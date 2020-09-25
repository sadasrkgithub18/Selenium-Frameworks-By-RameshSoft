package com.rameshsoft.selenium.TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.selenium.basePackage.BaseEngine;
import com.rameshsoft.selenium.supporters.ExcelReader;
import com.rameshsoft.selenium.supporters.PropertiesReader;

public class GMailTestCase extends BaseEngine
{
   @Test
   public void gmailTestCase() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
   {
	
	PropertiesReader preConf = new PropertiesReader("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\config.properties");
	String url = preConf.getPropertyValue("gmail_url");
	getDriver().get(url);
	 
	Thread.sleep(3000);
	PropertiesReader prOr = new PropertiesReader("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\objectrepository\\OR_gmail_home_page.properties");
	
	String un     = prOr.getPropertyValue("gmail_un_id");
	String nxt    = prOr.getPropertyValue("gmail_next_id");
	String name   = prOr.getPropertyValue("gmail_pwd_name");
	String signin = prOr.getPropertyValue("gmail_signIn_idddd");
	
	Thread.sleep(3000);
	
	WebElement un1 =  getDriver().findElement(By.id(un));
	un1.clear();
	un1.sendKeys("sadasiva.kikkurru");
	
	Thread.sleep(3000);
	
	getDriver().findElement(By.id(nxt)).click();

	Thread.sleep(3000); 
	
	WebElement pwd = getDriver().findElement(By.name(name));
	pwd.clear();
	pwd.sendKeys("14785239");
	
	Thread.sleep(3000);
	
	getDriver().findElement(By.id(signin)).click();
	
	
   }
}
