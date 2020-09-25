package com.rameshsoft.selenium.listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RetryTest 
{
    //@Test(retryAnalyzer = CustomRetryAnalyzer.class)
    @Test
	public void login()
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
			
			RemoteWebDriver driver = new ChromeDriver();
			
			driver.get("https://www.gmail.com");

	        driver.manage().window().maximize();

	        driver.manage().deleteAllCookies();

	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        WebElement web = driver.findElement(By.id("identifier"));
	        
	        web.clear();
	        web.sendKeys("sadasiva.kikkurru");
           // driver.close();
	}

}
