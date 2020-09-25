package com.rameshsoft.selenium.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo 
{

	public static void main(String[] args) 
	{
	   //Pattern pattern = Pattern.compile("Java");
	   //Pattern pattern = Pattern.compile("[a-z]");
	   //Pattern pattern = Pattern.compile("[A-Z]");
	     Pattern pattern = Pattern.compile("[0-9]");
		   
	   
	   
	   Matcher matcher = pattern.matcher("Jav3a Progr7ammi9n5g Java L1a2n3gu7ag9e Javas8e Sp7ring6Java EE2Java");
	   
	   /*int count = 0;
	   
	   while(matcher.find())
	   {
		   String match = matcher.group();
		   System.out.println(match);
		   System.out.println(matcher.start());
		   System.out.println(matcher.end());
		   count++;
	   }
	   
	   System.out.println("No.of Occurrences of Java is:" + count);*/
	   
	   
	   int sum = 0;
	   
	   while(matcher.find())
	   {
		 String match = matcher.group();  
		 System.out.println(match);
		 int i = Integer.parseInt(match);
		 sum = sum + i;
		 
	   }
	   
	   System.out.println("Sum is:" +sum);
	}
	
    
}
