package com.rameshsoft.selenium.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.selenium.basePackage.BaseEngine;

public class GmailHomePage extends BaseEngine
{
   @FindBy(id="identifierId")
   private static WebElement userName;
   
   
   @FindBy(id="identifierNext")
   private static WebElement next;
   
   
   @FindBy(xpath="//*[contains(text(),'Forgot email?')]")
   private static WebElement frgtEmail;
   
   
   @FindBy(xpath="//*[contains(text(),'Create account']")
   private static WebElement createAcc;
   
   
   
   public static void enterUserName(String testData)
   {
	   if(userName.isDisplayed() && userName.isEnabled())
	   {
		   userName.clear();
		   userName.sendKeys(testData);
	   }
   }
   
   public static void clickOnNextBtn()
   {
	    if(next.isDisplayed() && next.isEnabled())
	    {
	    	next.click();
	    }
   }
   
   
   public static void clickOnCreateAcc()
   {
	   if(createAcc.isDisplayed() && createAcc.isEnabled())
	   {
		   createAcc.click();   
	   }
   }
   
   
   public static void clickOnForgotEmail()
   {
	   if(frgtEmail.isDisplayed() && frgtEmail.isEnabled())
	   {
		   frgtEmail.click();
	   }
   }
   
   static 
   {
	   PageFactory.initElements(getDriver(), GmailHomePage.class);
   }
   
}
