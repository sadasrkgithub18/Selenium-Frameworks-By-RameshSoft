package com.rameshsoft.selenium.practice;

public class StringDemo2 
{

	public static void main(String[] args) 
	{
	   String data = "   PLZ      Practice      ,JOB, Rameshsoft, Data";
	   //System.out.println(data.trim());
	   String[] values = data.split(",");
	   
	   for(String str : values)
	   {
		   System.out.println(str.trim());
	   }
	   
	}

}
