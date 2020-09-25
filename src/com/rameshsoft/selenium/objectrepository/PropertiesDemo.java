package com.rameshsoft.selenium.objectrepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo 
{
  public static void main(String[] args) throws IOException
  {
	FileInputStream fis = new FileInputStream("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\objectrepository\\OR_gmail_home_page.properties");
	
	Properties properties = new Properties();
	properties.load(fis);
	
	String gmail_un_id            = properties.getProperty("gmail_un_id");
	String gmail_un_xpath         = properties.getProperty("gmail_un_xpath");
	String gmail_un_cssSelector_1 = properties.getProperty("gmail_un_cssSelector_1");
	String gmail_un_cssSelector_2 = properties.getProperty("gmail_un_cssSelector_2");
	String gmail_un_cssSelector_3 = properties.getProperty("gmail_un_cssSelector_3");
	
	String gmail_next_id            = properties.getProperty("gmail_next_id");
	String gmail_next_xpath         = properties.getProperty("gmail_next_xpath");
	String gmail_next_cssSelector_1 = properties.getProperty("gmail_next_cssSelector_1");
	String gmail_next_cssSelector_2 = properties.getProperty("gmail_next_cssSelector_2");
	String gmail_next_cssSelector_3 = properties.getProperty("gmail_next_cssSelector_3");
	
	String gmail_pwd_name           = properties.getProperty("gmail_pwd_name");
	String gmail_pwd_xpath          = properties.getProperty("gmail_pwd_xpath");
	String gmail_pwd_cssSelector    = properties.getProperty("gmail_pwd_cssSelector");
	
	String gmail_signIn_id            = properties.getProperty("gmail_signIn_id");
	String gmail_signIn_xpath         = properties.getProperty("gmail_signIn_xpath");
	String gmail_signIn_cssSelector_1 = properties.getProperty("gmail_signIn_cssSelector_1");
	String gmail_signIn_cssSelector_2 = properties.getProperty("gmail_signIn_cssSelector_2");
	String gmail_signIn_cssSelector_3 = properties.getProperty("gmail_signIn_cssSelector_3");
	
	String gmail_signIn_id_11            = properties.getProperty("gmail_signIn_id11","Default value 1");
	String gmail_signIn_id_12            = properties.getProperty("gmail_signIn_id12","Default value 2");
	String gmail_signIn_id_13            = properties.getProperty("gmail_signIn_id13","Default value 3");
	
	System.out.println("===============================");
	
	System.out.println(gmail_un_id);
	System.out.println(gmail_un_xpath);
	System.out.println(gmail_un_cssSelector_1);
	System.out.println(gmail_un_cssSelector_2);
	System.out.println(gmail_un_cssSelector_3);
	
	System.out.println("===============================");
	
	System.out.println(gmail_next_id);
	System.out.println(gmail_next_xpath);
	System.out.println(gmail_next_cssSelector_1);
	System.out.println(gmail_next_cssSelector_2);
	System.out.println(gmail_next_cssSelector_3);
	
	System.out.println("===============================");
	
	System.out.println(gmail_pwd_name);
	System.out.println(gmail_pwd_xpath);
	System.out.println(gmail_pwd_cssSelector);
	
	System.out.println("===============================");
	
	System.out.println(gmail_signIn_id);
	System.out.println(gmail_signIn_xpath);
	System.out.println(gmail_signIn_cssSelector_1);
	System.out.println(gmail_signIn_cssSelector_2);
	System.out.println(gmail_signIn_cssSelector_3);
	
	System.out.println("===============================");
	
	System.out.println(gmail_signIn_id_11);
	System.out.println(gmail_signIn_id_12);
	System.out.println(gmail_signIn_id_13);
	
	System.out.println("===============================");
  }
}
