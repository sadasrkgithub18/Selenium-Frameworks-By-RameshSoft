package com.rameshsoft.selenium.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile 
{
	
	public static void main(String[] args) throws IOException {
		
	
	   File file = new File("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\supporters\\Mobile.txt");
	  
	   boolean fileStatus = file.createNewFile();
	  if(fileStatus)
	  {
		  System.out.println("Created Newly");
	  }
	  else
	  {
		  System.out.println("File already available in the path");
	  }
	  
	  
	  FileWriter fr  = new FileWriter(file,true);
	  BufferedWriter bw = new BufferedWriter(fr);
	
	  bw.write("Java SE");
	  bw.newLine();
	  bw.write("Selenium 3.141.59");
	  bw.newLine();
	  bw.write("No practice nothing");
	  bw.newLine();
	  
	  bw.flush();
	  bw.close();
	  
	  
	  FileReader frr = new FileReader(file);
	  BufferedReader br = new BufferedReader(frr);
	  
	  while(br.ready())
	  {
		  System.out.println(br.readLine());
		  System.out.println("======================");
	  }
		
	}
}
