package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLIntro {

	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\User\\eclipse-workspace\\JavaBatch6\\testdata\\Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet4");
		
		Row row=sheet.getRow(0);
		
		Cell cell=row.getCell(1);
		
		String r0cell1=cell.toString();
		System.out.println(r0cell1);
		
		//how to get New York
		
		Row row2=sheet.getRow(2);
		Cell cell2=row2.getCell(2);
		
		String r2cell2 = cell2.toString();
		System.out.println(r2cell2);
		
		//access virginia
		
		String r1c2=sheet.getRow(1).getCell(3).toString();
		System.out.println(r1c2);
		
		//numeric value
		double numValue = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)numValue);

		String valC = sheet.getRow(1).getCell(4).toString();
		System.out.println(valC);
		String[] arr = valC.split("\\.");
		System.out.println(arr[0]);
		
	}

}
