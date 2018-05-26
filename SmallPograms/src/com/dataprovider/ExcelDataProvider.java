package com.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		FileInputStream fileInputStream= new FileInputStream("C:\\Users\\kingshuk.nandy\\Desktop\\Perfecto Documents\\Important\\Various_Credential.xlsx");
		Workbook wb=new XSSFWorkbook(fileInputStream);
		Sheet sheet=wb.getSheet("CloudLoginCredentials");
		
		int str=sheet.getPhysicalNumberOfRows();
		System.out.println(str);
		
		Row row=sheet.getRow(2);
		String name=row.getCell(1).getStringCellValue();
		System.out.println("name:"+name);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
