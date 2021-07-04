package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingToXL {

	public static void main(String[] args) throws IOException {

		String filePath=System.getProperty("user.dir")+"\\testdata\\AnotherFile.xlsx";
		System.out.println(filePath);
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		Sheet sheet=wbook.getSheet("Sheet1");
		
		sheet.createRow(0).createCell(0).setCellValue("name");
		sheet.createRow(1).createCell(0).setCellValue("ziya");
		
		Sheet createdSheet = wbook.createSheet("TestSheet");
		FileOutputStream fos=new FileOutputStream(filePath);
		wbook.write(fos);
	}

}
