package com.rameshsoft.selenium.TestCases;

import java.io.IOException;

import com.rameshsoft.selenium.supporters.PropertiesReader;

public class WriteOperationsClass
{

	public static void main(String[] args) throws IOException
	{
		PropertiesReader prOr = new PropertiesReader("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\objectrepository\\OR_WriteOperations_File.properties");
		prOr.writeData("Java", "Selenium");
		
		
		prOr.writeData("Driver", "Chrome");
		System.out.println("Execution completed successfully");
	}

}
