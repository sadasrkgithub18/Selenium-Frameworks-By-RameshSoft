package com.rameshsoft.selenium.datadriven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbayTest 
{
	WebDriver driver;
	
   @BeforeMethod
   public void setUp()
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\Drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   driver.get("https://www.facebook.com");
	   
   }
   
   @DataProvider
   public Iterator<Object[]> getData() throws EncryptedDocumentException, InvalidFormatException, IOException
   {
	   ArrayList<Object[]> testData = TestDataUtil.getDataFromExcel();
	   return testData.iterator();
   }
   
   
   
   @Test(dataProvider="getData")
   public void regTest(String firstname, String lastname, String email, String PASSWORD)
   {
	   //System.out.println(driver.getTitle());
	   
	   driver.findElement(By.id("u_0_m")).clear();
	   driver.findElement(By.id("u_0_m")).sendKeys(firstname);

	   driver.findElement(By.id("u_0_o")).clear();
	   driver.findElement(By.id("u_0_o")).sendKeys(lastname);

	   driver.findElement(By.id("u_0_r")).clear();
	   driver.findElement(By.id("u_0_r")).sendKeys(email);

	   driver.findElement(By.id("password_step_input")).clear();
	   driver.findElement(By.id("password_step_input")).sendKeys(PASSWORD);
 
   }
   
   
   @AfterMethod
   public void tearDown()
   {
	   driver.quit();
   }
   
}
