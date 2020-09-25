package com.rameshsoft.selenium.objectrepository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemoWriteOperations
{

	public static void main(String[] args) throws IOException 
	{
	  FileInputStream fis = new FileInputStream("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\objectrepository\\OR_WriteOperations_File.properties");
	  
	  Properties properties = new Properties();
	  properties.load(fis);
	  
	  properties.setProperty("gmail_un_id","identifierId");
	  properties.setProperty("gmail_un_xpath","//input[@id='identifierId']");
	  properties.setProperty("gmail_un_cssSelector_1","input[id='identifierId']");
	  properties.setProperty("gmail_un_cssSelector_2","input#identifierId");
	  properties.setProperty("gmail_un_cssSelector_3","#identifierId");
	  
	  properties.setProperty("Map","String");
	  
	  FileOutputStream fos = new FileOutputStream("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\objectrepository\\OR_WriteOperations_File.properties");
	  
	  properties.store(fos, "Saved in Properties file Successfully");
	  
	  System.out.println("Written key value pairs to properties files");
	}

}
