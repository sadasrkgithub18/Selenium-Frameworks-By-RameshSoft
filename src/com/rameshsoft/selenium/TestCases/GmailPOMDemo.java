package com.rameshsoft.selenium.TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.rameshsoft.selenium.basePackage.ActionEngine;
import com.rameshsoft.selenium.basePackage.BaseEngine;
import com.rameshsoft.selenium.pageObjects.GmailHomePage;
import com.rameshsoft.selenium.pageObjects.GmailPwdPage;
import com.rameshsoft.selenium.supporters.ExcelReader;
import com.rameshsoft.selenium.supporters.PropertiesReader;
import com.rameshsoft.selenium.utilities.FilePaths;
import com.relevantcodes.extentreports.LogStatus;


@Test
public class GmailPOMDemo extends BaseEngine
{
   public void mailPOMDemo() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException
   {
	   PropertiesReader prOr = new PropertiesReader(FilePaths.configPath);
	   String urlgm = prOr.getPropertyValue("gmail_url");
	   ActionEngine.enterURL(urlgm);
	   
	   getExtentTest().log(LogStatus.INFO,"URL is entered as:"+urlgm);
	   
	   ExcelReader excelReader = new ExcelReader(FilePaths.excelPath);
	   
	   
	   GmailHomePage.enterUserName(excelReader.getSingleCellData("TestingData",0,0));
	   
	   getExtentTest().log(LogStatus.INFO,"UN is entered as:"+excelReader.getSingleCellData("TestingData",0,0));
	   
	   GmailHomePage.clickOnNextBtn();
	   
	   getExtentTest().log(LogStatus.INFO, "Clicked on next button");
	   
	   Thread.sleep(3000);
	   
	   GmailPwdPage.enterPassword(excelReader.getSingleCellData("TestingData",0,1));
	   
	   getExtentTest().log(LogStatus.INFO, "Pwd is entered:"+excelReader.getSingleCellData("TestingData",0,1));
	   
	   
	   
	   Thread.sleep(3000);
	   
	   GmailPwdPage.clickOnSignInButton();
	   
	   getExtentTest().log(LogStatus.INFO,"Clicked on signIn Button");
	   
   }
   
}
