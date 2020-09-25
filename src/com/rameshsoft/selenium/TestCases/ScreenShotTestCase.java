package com.rameshsoft.selenium.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class ScreenShotTestCase
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\64bitAutomationSW\\chromedriver.exe");
		RemoteWebDriver driver =new ChromeDriver();
		
		// WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		SessionId sessionID = driver.getSessionId();  // Using RemoteWebDriver driver
		System.out.println(sessionID);
		
		
		 File file = driver.getScreenshotAs(OutputType.FILE);  // Using RemoteWebDriver driver
		
		// TakesScreenshot takesscreenshot = (TakesScreenshot) driver; // Using WebDriver driver
		
		// File file = takesscreenshot.getScreenshotAs(OutputType.FILE);
		
	      FileUtils.copyFile(file, new File("D:\\ScreenShots\\gmlogin.jpg"));
		
		  driver.close();

	}

}
