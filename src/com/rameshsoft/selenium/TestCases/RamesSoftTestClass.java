package com.rameshsoft.selenium.TestCases;

import org.testng.annotations.Test;

import com.rameshsoft.selenium.basePackage.BaseEngine;

public class RamesSoftTestClass extends BaseEngine
{
   @Test
   public void rameshSoftTC() throws InterruptedException
   {
	   getDriver().get("https://www.rameshsoft.com");
	   Thread.sleep(3000);
	   //getDriver().findElement(By.name("pwd")).click();
   }
}
