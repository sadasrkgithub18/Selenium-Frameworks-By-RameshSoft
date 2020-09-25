package com.rameshsoft.selenium.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetryAnalyzer implements IRetryAnalyzer
{

	int retryCount    = 0;
	int maxRetryCount = 3;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(ITestResult.FAILURE == result.getStatus() && retryCount < maxRetryCount)
		{

			try 
			{
				Thread.sleep(3000);
				System.out.println("Count is:" +retryCount+ "Executing TC is:"+ result.getName());
				retryCount++;
				return true;
			} 
			
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		
	    }
		return false;
	}
}
