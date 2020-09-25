package com.rameshsoft.selenium.practice;

public class CharCount 
{

	public static void main(String[] args) 
	{
	   String data = "BANANA and Mango";
	   char[] ch = data.toCharArray();
	   
	   int aCount = 0;
	   
	   for(char c : ch)
	   {
		   if(c == 'a' || c == 'A')
		   {
			   aCount++;
		   }
	   }
	   
	   System.out.println("No.of occurences of A is:"+aCount);
	}

}
