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

public class ExcelForTest 
{

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
      /*File file = new File("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\datadriven\\TestData.xlsx");
      FileInputStream fis = new FileInputStream(file);
      */
      
		FileInputStream fos = new FileInputStream("C:\\Users\\K SADA SIVA REDDY\\eclipse-workspaceE\\FrameworksSelenium\\src\\com\\rameshsoft\\selenium\\datadriven\\TestData.xlsx");
      
		Workbook workbook = WorkbookFactory.create(fos);
		
		Sheet sheet = workbook.getSheet("Selenium");
		
		for(int i=0; i<=sheet.getLastRowNum();i++)
		{
			Row row1 = sheet.getRow(i);
			
			for(int j=0; j<row1.getLastCellNum();j++)
			{
				Cell cell = row1.getCell(j);
				
				if(cell.getCellType() == Cell.CELL_TYPE_STRING)
				{
					System.out.println(cell.getStringCellValue());
				}
				
				else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
				{
					System.out.println(cell.getNumericCellValue());
				}
				
				else if(cell.getCellType() == Cell.CELL_TYPE_BOOLEAN)
				{
					System.out.println(cell.getBooleanCellValue());
				}
				
			}
			System.out.println("===================");
		}
      
      
	}

}
