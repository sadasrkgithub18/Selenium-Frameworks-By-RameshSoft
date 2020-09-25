package com.rameshsoft.selenium.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUtility
{

	public static boolean isValidPhoneNum(String phNum) 
	{
	    boolean status = true;
		
		Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher matcher = pattern.matcher(phNum);
		
		if(matcher.find() && matcher.group().equalsIgnoreCase(phNum))
		{
			System.out.println("Valid Phone number");
		}
		
		else
		{
			System.out.println("Not a valid phone number");
		}
		return status;
	}

}
