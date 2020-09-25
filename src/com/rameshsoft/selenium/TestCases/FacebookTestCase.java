package com.rameshsoft.selenium.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rameshsoft.selenium.basePackage.BaseEngine;
import com.rameshsoft.selenium.supporters.PropertiesReader;
import com.rameshsoft.selenium.utilities.FilePaths;

public class FacebookTestCase extends BaseEngine
{
   @Test
   public void fbTestCase() throws IOException, InterruptedException 
   {
	
	   PropertiesReader preConf = new PropertiesReader(FilePaths.configPath);
	   String url = preConf.getPropertyValue("fb_url");
	   getDriver().get(url);
	   Thread.sleep(3000);
	   //getDriver().get("https://www.facebook.com");
	 
	 
   }
}
