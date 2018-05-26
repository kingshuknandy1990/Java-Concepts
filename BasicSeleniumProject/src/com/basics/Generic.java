package com.basics;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Generic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kingshuk.nandy\\workspace_JavaConcepts\\BasicSeleniumProject\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
        
       // Thread.sleep(60000);
		driver.get("https://www.youtube.com/playlist?list=PLBb3Lc2YpCjcE7KSP4X-AfZ3f8mkAnSr8");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		//This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(20000);
        List<WebElement> element=driver.findElements(By.xpath("//span[@id='video-title']"));
		Iterator ite=element.iterator();
		int i=0;
		while (ite.hasNext()) {
			i++;
			WebElement object = (WebElement) ite.next();
			System.out.println(i+"  ]"+object.getText());
			
		}
	}

}
