package UpstoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class Utility 
{
	//Utility class is used to read the data all the generalize ,common methods is mention in utility class to reuse the method and code
	
	
	//Excel
	//Screenshot
    //wait
	
	public static String ReadDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile= new File("G:\\Vinayak\\Password for upstox.xlsx");
	      
	      Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	     String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	//Create a method to get screenshot
	
	public static void Screenshot(WebDriver driver,String name ) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("G:\\Vinayak\\Screenshot"+name+".png");
		org.openqa.selenium.io.FileHandler.copy(source, destination);
				
	}
	
	//Create a method for wait
	
	public static void wait(WebDriver driver ,int WaitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(WaitTime));
	}

}
