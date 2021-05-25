package com.syntax.class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Maps {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaBatch6\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.getRow(02);
        Cell cell = row.getCell(0);
        System.out.println(cell.toString());

        List<Map<String, String>> rows = new ArrayList<>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Map<String, String> columns = new LinkedHashMap<>();
            columns.put("Name", sheet.getRow(i).getCell(0).toString());
            columns.put("Age", sheet.getRow(i).getCell(1).toString());
            columns.put("RollNumber", sheet.getRow(i).getCell(2).toString());
            columns.put("Marks", sheet.getRow(i).getCell(3).toString());
            rows.add(columns);

        }


        //System.out.println(rows);
        for (Map<String, String> map : rows
        ) {
            System.out.println(map);
        }






        List<ExcelData> rowsUsingCustomClass = new ArrayList<>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {


            ExcelData excelData = new ExcelData(sheet.getRow(i).getCell(0).toString()
                    , sheet.getRow(i).getCell(1).getNumericCellValue(),
                    sheet.getRow(i).getCell(2).toString(),
                    sheet.getRow(i).getCell(3).getNumericCellValue());
            rowsUsingCustomClass.add(excelData);

        }

        System.out.println(rowsUsingCustomClass);


    }
}
