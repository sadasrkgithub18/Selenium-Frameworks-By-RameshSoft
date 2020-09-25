package com.rameshsoft.selenium.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestA 
{
	@Test  
	public void login()
	{
		System.out.println("login()");
		Assert.assertEquals("Java", "Java");
	}
}
