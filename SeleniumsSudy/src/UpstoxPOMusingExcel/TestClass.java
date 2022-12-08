package UpstoxPOMusingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	      
        
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://login-v2.upstox.com/");
	      
	      
	      
	      //Now we need to read the data from excel
	      File myFile= new File("G:\\Vinayak\\Password for upstox.xlsx");
	      
	      Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	      
	      //Now create an object of login page
	      login lin=new login(driver);
	      //Fetching data from excel 1st type
	      lin.enteruserID(mysheet.getRow(1).getCell(0).getStringCellValue());
	      //Fetching data from excel 2nd type
	      String pwd = mysheet.getRow(1).getCell(1).getStringCellValue();
	      lin.enterpassword(pwd);
	      
	      lin.clickonsigninbutton();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	      
	      //Create an object of passcode page
	      String code = mysheet.getRow(1).getCell(2).getStringCellValue();
	      PasscodePage pcode=new PasscodePage(driver);
	      pcode.enterpasscode(code);
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	      
	     //Create an object of welcome page
	      WelcomePage wel=new WelcomePage(driver);
	      wel.clickoniamgood();
	      
	       //Create an object of home page
	      HomePage home=new HomePage(driver);
	      home.validateUsername(driver);
	      home.Clickobfunds();
	      
	      //Create an object of funds page
	      FundsPage fund=new FundsPage(driver);
	      fund.validateavailablefunds(driver);
	      home.logoutfromapp();
	      
	      
	      

	}

}
