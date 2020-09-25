package com.naveen.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
  public static WebDriver driver;
  
  public static void initialization()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver(); 
	  driver.get("https://www.google.com");
  }
  
  public static void screenShot(String testMethodName) throws IOException 
  {
  	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	FileUtils.copyFile(file, new File("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\ScreenShots\\"+testMethodName+"_"+".png"));

  }
	
  
}
