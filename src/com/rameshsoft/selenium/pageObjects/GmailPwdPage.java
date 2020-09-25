package com.rameshsoft.selenium.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.selenium.basePackage.BaseEngine;

public class GmailPwdPage extends BaseEngine
{
    @FindBy(name="password")
    private static WebElement password;
    
    
    @FindBy(id="passwordNext123")
    private static WebElement signIn;
    
    
    @FindBy(xpath="//*[contains(text(),'Forgot password?')]")
    private static WebElement frgtPwd;
    
    
    public static void enterPassword(String testData)
    {
    	if(password.isDisplayed() && password.isEnabled())
    	{
    		password.clear();
    		password.sendKeys(testData);
    	}
    }
    
    
    
    public static void clickOnSignInButton()
    {
    	if(signIn.isDisplayed() && signIn.isEnabled())
    	{
    		signIn.click();
    	}
    }
    
    
    public static void clickOnorgotPwd()
    {
    	if(frgtPwd.isDisplayed() && frgtPwd.isEnabled())
    	{
    		frgtPwd.click();
    	}
    }
    
    
    static
    {
    	PageFactory.initElements(getDriver(), GmailPwdPage.class);
    }
    
    
    
}
