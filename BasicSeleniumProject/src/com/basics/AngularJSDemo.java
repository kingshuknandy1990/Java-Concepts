package com.basics;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AngularJSDemo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kingshuk.nandy\\workspace_JavaConcepts\\BasicSeleniumProject\\lib\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "D:\\QAS Git Repository\\JetBlueDemo\\server\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "D:\\QAS Git Repository\\JetBlueDemo\\server\\IEDriverServer.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://angularjs.org/"); 
	     Thread.sleep(1000);
	      //we are about to identify an element with attribute ng-model
	     //WebElement element=driver.findElement(By.xpath("//*[contains(@placeholder,'Enter a name')]"));
	     WebElement element=driver.findElement(By.xpath("//input[@ng-model='yourName']"));
	    // WebElement element=driver.findElement(By.cssSelector("css="));
	     element.click();
	     /*JavascriptExecutor js = (JavascriptExecutor)driver;	
	     js.executeScript("document.getElementById('elementID').setAttribute('value', 'new value for element')");*/
	     element.sendKeys("xyz");
	     WebElement fld_Result = driver.findElement(By.xpath("//h1[@class='ng-binding']"));
	     System.out.println(fld_Result.getText());
	     if (!(fld_Result.getText() == "Hello xyz!")) //returns 0, if equals, so negation
	        {
	            System.out.println("Passed");
	        }
	     
	     driver.quit();
	   }

}
