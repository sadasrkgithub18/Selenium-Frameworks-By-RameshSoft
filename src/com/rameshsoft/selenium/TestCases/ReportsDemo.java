package com.rameshsoft.selenium.TestCases;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsDemo 
{

	public static void main(String[] args) 
	{
	   ExtentReports extentReports = new ExtentReports("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\Reports\\Report.html");
	   
	   ExtentTest extentTest = extentReports.startTest("Practice");
	   
	   extentTest.log(LogStatus.INFO,"Browser is Opened");
	   
	   extentTest.log(LogStatus.INFO, "URL is entered");
	   
	   extentTest.log(LogStatus.INFO, "Entered user name");
	   
	   extentTest.log(LogStatus.INFO, "clicked on next button");
	   
	   extentTest.log(LogStatus.INFO, "Entered pwd");
	   
	   extentTest.log(LogStatus.INFO, "Clicked on sigin button");
	   
	   extentReports.endTest(extentTest);
      	 
	   extentReports.flush();
	   extentReports.close();
	   
	}

}
