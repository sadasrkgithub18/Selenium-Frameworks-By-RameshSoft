package com.rameshsoft.selenium.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriteOperations 
{

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
	   File file = new File("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\datadriven\\TestData.xlsx");
	   FileInputStream fis = new FileInputStream(file);
	   
	   Workbook workbook =   WorkbookFactory.create(fis);
	   
	   Sheet sheet = workbook.getSheet("Spring");
	   
	   Row row0 =  sheet.createRow(0);
	   
	   Cell cell = row0.createCell(0);
	   
	   cell.setCellValue("Operations");
	   
	   FileOutputStream fout = new FileOutputStream("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\datadriven\\TestData.xlsx");
	   workbook.write(fout);
	   System.out.println("Done");
	}

}
