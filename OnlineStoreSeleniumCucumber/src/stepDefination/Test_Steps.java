package stepDefination;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import beans.Credentials;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_Steps {
	public static WebDriver driver=null;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kingshuk.nandy\\workspace_JavaConcepts\\OnlineStoreSeleniumCucumber\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.get("http://www.store.demoqa.com");
        
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
	
/*	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.id("log")).sendKeys("Other12"); 
        driver.findElement(By.id("pwd")).sendKeys("test@123");
        driver.findElement(By.id("login")).click();
	}*/
	
/*	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
		driver.findElement(By.id("log")).sendKeys(username); 
        driver.findElement(By.id("pwd")).sendKeys(password);
        driver.findElement(By.id("login")).click();
	}*/
	
/*	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable userCredentials) throws Throwable {
      
		//Write the code to handle Data Table
		List<List<String>> data=userCredentials.raw();
		

		//This is to get the first data of the set (First Row + First Column)
		driver.findElement(By.id("log")).sendKeys(data.get(0).get(0)); 
 
		//This is to get the first data of the set (First Row + Second Column)
	    driver.findElement(By.id("pwd")).sendKeys(data.get(0).get(1));
 
	    driver.findElement(By.id("login")).click();
	}*/
	
/*	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser_and_Test(DataTable usercredentials) throws Throwable {

		//Write the code to handle Data Table
		List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		driver.findElement(By.id("log")).sendKeys(data.get(0).get("Username")); 
	    driver.findElement(By.id("pwd")).sendKeys(data.get(0).get("Password"));
	    driver.findElement(By.id("login")).click();
          
	}*/
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser_and_Test(DataTable  usercredentials) throws Throwable {

		int count=0;
		//Write the code to handle Data Table
		for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
			count++;
			driver.findElement(By.id("log")).sendKeys(data.get("Username")); driver.findElement(By.id("pwd")).sendKeys(data.get("Password"));
			driver.findElement(By.id("login")).click();
			Thread.sleep(4000);
			if (driver.findElement (By.xpath(".//*[@id='account_logout']/a")).isDisplayed()) {
				System.out.println("Login Successfully");	
			}
			driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
			Thread.sleep(4000);
			if (driver.findElement(By.id("login")).isDisplayed()) {
				System.out.println("LogOut Successfully");
			}			
			}
		
	}
	
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {	    
		 	System.out.println("Login Successfully");
	        
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
       
 
        
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		 System.out.println("LogOut Successfully");
		 driver.quit();
	}
}
