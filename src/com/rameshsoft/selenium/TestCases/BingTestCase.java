package com.rameshsoft.selenium.TestCases;

import org.testng.annotations.Test;

import com.rameshsoft.selenium.basePackage.BaseEngine;

public class BingTestCase extends BaseEngine
{
   @Test	
   public void bingTestCase() throws InterruptedException
   {
	  getDriver().get("https://www.bing.com"); 
	  Thread.sleep(3000);
	  //getDriver().findElementByClassName("123456"); 
   }
}
