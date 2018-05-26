package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // Tells the Junit what is the TestRunner Class.
						 //@RunWith annotation tells JUnit that tests should run 
						 //using Cucumber class present in ‘Cucumber.api.junit‘ package.
@CucumberOptions(features = "Feature"
				, glue = {"stepDefination"}
				,tags = {"~@SmokeTest","~@RegressionTest","~@End2End"}	
				)
public class TestRunner {

}
