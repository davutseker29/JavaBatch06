package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Recap {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "\\testdata\\Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet4");

		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();

		System.out.println("number of rows:" + rows);
		System.out.println("number of cells:" + cells);

		List<Map<String, String>> mapList = new ArrayList<>();

		for (int i = 1; i < rows; i++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int j = 0; j < cells; j++) {
			
				String key=sheet.getRow(0).getCell(j).toString();
				String value=sheet.getRow(i).getCell(j).toString();
				map.put(key, value);
			}
			mapList.add(map);
		}
		System.out.println(mapList);
	}

}
