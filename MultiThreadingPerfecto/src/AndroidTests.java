import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.html5.*;
import org.openqa.selenium.logging.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.Cookie.Builder;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.ios.*;

import com.perfecto.reportium.client.ReportiumClient;
import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResult;
import com.perfecto.reportium.test.result.TestResultFactory;

/**
 * This template is for users that use DigitalZoom Reporting (ReportiumClient).
 * For any other use cases please see the basic template at https://github.com/PerfectoCode/Templates.
 * For more programming samples and updated templates refer to the Perfecto Documentation at: http://developers.perfectomobile.com/
 */
public class AndroidTests extends Thread {
	static String browserName = "mobileOS";
	static String host = "demo.perfectomobile.com";;
	static String USERNAME="kingshukn@perfectomobile.com";
	static String PASS="Perfecto123";
	static String DeviceID;
	public AndroidTests(String DeviceID) {
		this.DeviceID=DeviceID;
	}
	public static AndroidDriver getDriver() throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);
        
        capabilities.setCapability("user", USERNAME);
        capabilities.setCapability("password", PASS);
        
        //TODO: Change your device ID
        capabilities.setCapability("deviceName", DeviceID);
        
        // Use the automationName capability to define the required framework - Appium (this is the default) or PerfectoMobile.
        capabilities.setCapability("automationName", "Appium");
        
        // Call this method if you want the script to share the devices with the Perfecto Lab plugin.
        PerfectoLabUtils.setExecutionIdCapability(capabilities, host);
		AndroidDriver driver = new AndroidDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
	}
    
    
    
  
}
