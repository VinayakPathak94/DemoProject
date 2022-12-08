package ExcelSheetStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelDataFetch {

	public static void main(String[] args) throws IOException  {
		
		File myfile = new File("G:\\Vinayak\\Manual Lecture\\Selenium.xls");
		
		FileInputStream myexcel=new FileInputStream(myfile);
	String test = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(test);
		
		
	}

}

	
