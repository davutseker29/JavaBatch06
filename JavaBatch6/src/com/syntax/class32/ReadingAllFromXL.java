package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingAllFromXL {

	public static void main(String[] args) throws IOException {

		String filePath=System.getProperty("user.dir")+"/testdata/TestData.xlsx";
		System.err.println(filePath);
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("TestData");
		
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(col);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				
				String values = sheet.getRow(i).getCell(j).toString();
				System.out.print(values+"  ");
			}System.out.println();
			
		}
	}

}
