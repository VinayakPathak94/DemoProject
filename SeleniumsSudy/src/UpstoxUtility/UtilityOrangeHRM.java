package UpstoxUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityOrangeHRM 
{
	//This Class is used to store test data and to store genralize method
	
	
	//Excel
	//Screenshot
	//Scrolling
	//wait
	
	//Make a method to read data from excel
	
	//We need to make a static method to read the data from excel and we have passed (row,cell)in it because we will mention
	//row and cell in TestNg class
	//We have made it "String" return type because after reading data this method will give data in string
	public static String readdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("G:\\Vinayak\\Password for upstox.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	
	//Now create a method to take screenshot 
	//We want to give specific name to our Sshot so we mention (String name)into bracket  because we need to create local variable of it(Parameterzid mehod)
	public void screenshotmethod(WebDriver driver,String Name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("G:\\Vinayak\\Screenshot"+Name+".png");
		FileHandler.copy(src, destination);
	}

}
