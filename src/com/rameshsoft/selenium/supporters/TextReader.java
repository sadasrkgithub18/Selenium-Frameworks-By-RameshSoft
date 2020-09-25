package com.rameshsoft.selenium.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReader 
{
	private String filePath;
	private File file;
	private FileReader frr;
	private BufferedReader br;
	private FileWriter fr;
	private BufferedWriter bw;
	
	
	public TextReader(String filePath) throws IOException
	{
		this.filePath = filePath;
		 file = new File(filePath);
		 boolean fileStatus = file.createNewFile();
		 
		  if(fileStatus)
		  {
			  System.out.println("Created Newly");
		  }
		  
		  else
		  {
			  System.out.println("File already available in the path");
		  }
		  
		  frr = new FileReader(file);
		  br = new BufferedReader(frr);
		  fr  = new FileWriter(file);
		  bw = new BufferedWriter(fr);
		  
	}
	
	public void writeData(int data) throws IOException
	{
		bw.write(data);
		bw.flush();
		bw.newLine();
	}
	
	public void writeData(String data) throws IOException
	{
		bw.write(data);
		bw.flush();
		bw.newLine();
	}
	
	public void writeData(List data) throws IOException
	{
		for(Object obj : data)
		{
			String str = (String) obj;
			bw.write(str);
		}
		
		bw.flush();
		bw.newLine();
	}
	
	
	public String readData() throws IOException
	{
		return br.readLine();
	}
	
	public List<String> getTotalDataFile() throws IOException
	{
		List<String> fileData = new ArrayList<String>();
		while(br.ready())
		{
			String data = br.readLine();
			fileData.add(data);
		}
		return fileData;
		
	}
	
	
	
	
   public static void main(String[] args) throws IOException 
   {
	  
	  TextReader textReader = new TextReader("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\supporters\\hello.txt");
	  
	  List listData = new ArrayList();
	  listData.add("SRK");
	  listData.add("18");
	  listData.add("81.89");
	  listData.add("89.699f");
	  listData.add("true");
	  listData.add("K");
	  
	  textReader.writeData("Java Selenium 1");
	  textReader.writeData("Java Selenium 2");
	  textReader.writeData("Java Selenium 3");
	  textReader.writeData("Java Selenium 4");
	  
	  textReader.writeData(65);
	  textReader.writeData(97);
	  textReader.writeData(108);
	  textReader.writeData(118);
	  
	  
	  textReader.writeData(listData);
	  
	  
	  String sty = textReader.readData();
	  System.out.println(sty);
	  
	  List<String> totalData = textReader.getTotalDataFile();
	  System.out.println(totalData);	  
   }
}
