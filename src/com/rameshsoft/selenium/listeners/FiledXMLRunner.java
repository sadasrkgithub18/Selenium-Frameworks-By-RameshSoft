package com.rameshsoft.selenium.listeners;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FiledXMLRunner 
{
   public static void main(String[] args) 
   {
	   List<String> list = new ArrayList<String>();
	   list.add("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\test-output\\testng-failed.xml");
	   
	   TestNG test = new TestNG();
	   test.setTestSuites(list);
	   test.run();
   }
}
