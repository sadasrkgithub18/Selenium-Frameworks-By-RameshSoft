package com.rameshsoft.selenium.datadriven;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.selenium.supporters.ExcelReader;

public class TestDataUtil 
{
    public static ExcelReader reader;
    static int count =1;
   
    
	public static ArrayList<Object[]> getDataFromExcel() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		 ArrayList<Object[]> myData =  new ArrayList<Object[]>();
		
		reader =new ExcelReader("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\datadriven\\TestData.xlsx");
		
		
		for(int rowNum=2; rowNum <= reader.getRowCount("EbayReg"); rowNum++)
		{
			
			String firstName = reader.getSingleCellData("EbayReg", count, 0);
			String lastName = reader.getSingleCellData("EbayReg", count, 1);
			String email    = reader.getSingleCellData("EbayReg", count, 2);
			String password = reader.getSingleCellData("EbayReg", count, 3);
			
			Object ob[] = {firstName, lastName, email, password};
			myData.add(ob);
			
			count++;
		}
		return myData;
	}
}
