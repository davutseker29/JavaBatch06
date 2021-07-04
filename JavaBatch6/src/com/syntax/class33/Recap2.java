package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Recap2 {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "\\testdata\\Test.xlsx";
		System.out.println(filePath);

		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Sheet4");

		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();

		System.out.println("number of row:" + rows);
		System.out.println("number of col:" + cols);

		List<Map<String, String>> listMap = new ArrayList<>();

		for (int i = 1; i < rows; i++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int j = 0; j < cols; j++) {

				String key = sheet.getRow(0).getCell(j).toString();
				String value = sheet.getRow(i).getCell(j).toString();
				map.put(key, value);

			}
			listMap.add(map);

		}
		System.out.println(listMap);
		
		for (Map<String, String> map : listMap) {
			System.out.println(map);
		}
	}

}
