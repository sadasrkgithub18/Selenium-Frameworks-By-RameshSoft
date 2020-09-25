package com.rameshsoft.selenium.utilities;

public class RegExDemo2 
{

	public static void main(String[] args) 
	{
	  String sms = "SRK947Reddy981";
	  char[] ch = sms.toCharArray();
	  
	  int sum = 0;
	  for(char ele : ch)
	  {
		  boolean b1 = Character.isDigit(ele);
		  
		  if(b1)
		  {
			sum = sum+Character.getNumericValue(ele); 
		  }
	  }
	  
	  System.out.println("Sum of the digits is:"+sum);
	}

}
