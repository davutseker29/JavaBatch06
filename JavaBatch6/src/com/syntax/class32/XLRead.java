package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLRead {
	
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\User\\eclipse-workspace\\JavaBatch6\\testdata\\Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet4");
		
		//number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		
		System.out.println("number of rows:"+rows);
		
		//number of columns
		
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("number of columns:"+cols);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				String cellVal=sheet.getRow(i).getCell(j).toString();
				System.out.print(cellVal+"  ");
			}System.out.println();
			
		}
		
	}

}
