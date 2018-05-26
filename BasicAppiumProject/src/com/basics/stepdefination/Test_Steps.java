package com.basics.stepdefination;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_Steps {

	@Given("^Basic Driver Launch$")
	public void driverLaunch() throws Throwable {
/*		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.252.101:5555");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.jquiz.act");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.jquiz.act.StartActivity");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);*/
		System.out.println("Driver Has been launched");
	}
}
