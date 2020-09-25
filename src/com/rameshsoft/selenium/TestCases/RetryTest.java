package com.rameshsoft.selenium.TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.selenium.basePackage.BaseEngine;
import com.rameshsoft.selenium.supporters.PropertiesReader;
import com.rameshsoft.selenium.utilities.FilePaths;

public class RetryTest extends BaseEngine
{
    //@Test(retryAnalyzer = CustomRetryAnalyzer.class)
    @Test
	public void login() throws IOException, InterruptedException
	{
    	  PropertiesReader preConf = new PropertiesReader(FilePaths.configPath);
 	      String url = preConf.getPropertyValue("fb_url");
 	      getDriver().get(url);
 	      Thread.sleep(3000);
 	   
 	      WebElement ele = getDriver().findElement(By.id("identifier"));
	        
 	       ele.clear();
	       ele.sendKeys("sadasiva.kikkurru");
           // driver.close();
	}

}
