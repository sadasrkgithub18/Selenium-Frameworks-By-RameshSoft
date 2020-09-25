package com.rameshsoft.selenium.practice;

public class StringDemo 
{

	public static void main(String[] args)
	{
	   String s = "Java Selenium";
	   String a = new String("RAMESHSOFT");
	   
	   String a1 = s.concat("JOB");
	   
	   s.concat("Demo");
	   System.out.println("=================================");
	   
	   System.out.println(s.hashCode()+"======"+a1.hashCode()+"======="+a.hashCode());
	   System.out.println(s+"======"+a1);
	   System.out.println("=================================");
	   
	   StringBuffer sb = new StringBuffer("Long Note");
	   StringBuffer sb1 = sb.append("Book");
	   
	   System.out.println(sb+" === "+sb1);
	   System.out.println(sb.hashCode()+"         "+sb1.hashCode());
	   
	   System.out.println("=================================");
	   
	}

}
