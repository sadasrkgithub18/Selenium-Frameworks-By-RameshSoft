package com.rameshsoft.selenium.practice;

public class StringReverse2 
{

	public static void main(String[] args) 
	{
	   String s = "HELLO JAVA";
	   char[] ch = s.toCharArray();
	   
	   String reverse = "";
	   
	   for(int i = ch.length-1; i>=0 ;i--)
	   {
		   reverse = reverse + ch[i];
	   }
	   
	   System.out.println(reverse);
 	}

}
