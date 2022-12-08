package UpstoxUtility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityNew 
{
	//Utility class is used to store genralize method which can be used multiple time or to reuse like:
	
	//Excel
	//Screenshot 
	//Scrolling
	//Wait
	
	//Make a method to read a data from exccel
	
	//WE need to make static method to read the data from excel and we have passed(row,cell)in it because we will mention
	//row and cell in testNG class
	//We have made it "string" return type because after reading data this method will give data in string
	public static String readdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile= new File("G:\\Vinayak\\Password for upstox.xlsx");
	      
	      Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	     String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		 return value;		
	}
	
	//Now create a method to take screenshot
	//We want to give specific name to our Sshot so we mention
    //(String name) into the bracket because we need to create local variable of it(Parameterzid mehod)
	public void screenshotmethod(WebDriver driver,String name ) throws IOException    
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("G:\\Vinayak\\Screenshot"+name+".png");
		org.openqa.selenium.io.FileHandler.copy(src, destination);
		
		
	}
}
