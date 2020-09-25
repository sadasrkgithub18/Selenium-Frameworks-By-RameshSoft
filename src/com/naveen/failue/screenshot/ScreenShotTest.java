package com.naveen.failue.screenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.naveen.base.Base;
import com.rameshsoft.selenium.listeners.TestListenerTC;

@Listeners(TestListenerTC.class)
public class ScreenShotTest extends Base
{
	@BeforeMethod
	public void setUp()
	{
	   initialization();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test
	public void takeScShot1()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void takeScShot2()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void takeScShot3()
	{
		Assert.assertEquals(true, false);
	}
	
	
}
