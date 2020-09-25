package com.rameshsoft.selenium.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMobileNum 
{

	public static void main(String[] args)
	{
		
		/*String target = "Test@123";
		
		Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,32})");
		Matcher matcher = pattern.matcher(target);
		

	    if(matcher.find() && matcher.group().equalsIgnoreCase(target))
	    {
	    	System.out.println("Valid Password");
	    }
	    
	    else
	    {
	    	System.out.println("Not a valid password");
	    }
		*/
		
		
		String target   = "KKsada18.siva.kikkurru9@gmail.in.com";
		Pattern pattern = Pattern.compile("^[A-Za-z_.0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(target);
		

	    if(matcher.find() && matcher.group().equalsIgnoreCase(target))
	    {
	    	System.out.println("Valid EMail ID");
	    }
	    
	    else
	    {
	    	System.out.println("Not a valid EMail ID");
	    }
		
		
		
		
		
		
		
		
	   /* String target = "+91 94900 76979";
	 
	  //Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
	    Pattern pattern = Pattern.compile("[+]*(0|91)?[\\s]*[6-9][0-9]{4}[\\s]*[0-9]{5}");
	    
	    Matcher matcher = pattern.matcher(target);
	    
	    if(matcher.find() && matcher.group().equalsIgnoreCase(target))
	    {
	    	System.out.println("Valid Phone number");
	    }
	    
	    else
	    {
	    	System.out.println("Not a valid Phone number");
	    }*/
		
		
	
	  //System.out.println(RegExUtility.isValidPhoneNum("9490076979"));
      
		
	
	}

}
