package com.rameshsoft.selenium.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadOperations 
{

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
	   FileInputStream fis = new FileInputStream("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\datadriven\\TestData.xlsx");
	  
	   Workbook workbook = WorkbookFactory.create(fis);
	   
	   Sheet sheet = workbook.getSheet("Java");
	   
	   Row row1 = sheet.getRow(0);
	   
	   Cell cell1 =  row1.getCell(0);
	   
	   String val = cell1.getStringCellValue();
	   
	   System.out.println(val);
	}

}
