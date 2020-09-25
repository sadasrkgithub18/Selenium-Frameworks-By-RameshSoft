package com.rameshsoft.selenium.practice;

public class StringReverse 
{

	public static void main(String[] args) 
	{
		String s = "HELLO JAVA";
		StringBuffer sb = new StringBuffer(s);
		StringBuilder sbb = new StringBuilder(sb);
		
		System.out.println("Using StringBuffer  class:  "+sb.reverse());
		System.out.println("Using StringBuilder class:  "+sbb.reverse());
	}

}
