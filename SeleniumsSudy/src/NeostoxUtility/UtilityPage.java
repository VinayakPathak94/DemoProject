package NeostoxUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityPage 
{
	//Utility class is used to store genralize method which can be used multiple time or to reuse like:
	//Excel
	//Screenshot
	//Scrolling
	//Wait
	
	//All our testdata is store in excel sheet like password ,id
	//So make a method to read the data from excel 
	//WE need to make static method to read the data from excel and we have passed(row,cell)in it because we will mention
		//row and cell in testNG class
		//We have made it "string" return type because after reading data this method will give data in string
	
	public static String readdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		//we need to give path of our excel sheet where we saved our data and make object of file
		File myFile= new File("G:\\Vinayak\\Password for upstox.xlsx");
		
		//Now give path where yo saved your data in sheet
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;//This comes because we made thid method as a string and we get excel valu in string so thats why
		             //We need to give "return value";
	}
	
	//Now make a method to take screenshot 
	public static void screenshot(WebDriver driver,String name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("G:\\Vinayak\\Screenshot"+name+".png");
		
		FileHandler.copy(src, destination);
		Reporter.log("Taking Screenshot", true);
	}
	

}
