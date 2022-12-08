package UpstoxPOMclassesUsingBaseAndUtility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UpstoxBase.base;
import UpstoxUtility.Utility;

public class UserNamevalidation extends base  {
	//Creating object og all the classes locally because to reuse the object
	UpstoxLoginPage login;
	PassCodePage passcode;
	WelcomePage welcome;
	UpstoxHomePage home;
	
	
	
	@BeforeClass
	public void openbrowser()
	{
		launchBrowser();
		Reporter.log("Launching Browser", true);
		home=new UpstoxHomePage(driver);
		passcode=new PassCodePage(driver);
		login=new UpstoxLoginPage(driver);
		welcome=new WelcomePage(driver);
	}
	
	@BeforeMethod
	public void logintoupstox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.SendUserName(Utility.ReadDataFromExcel(1, 0));
		login.SendPass(Utility.ReadDataFromExcel(1, 1));
		login.ClickOnSignIn();
		Reporter.log("Sending username & password",true);
		Utility.wait(driver, 1000);
		passcode.enterpasscode(Utility.ReadDataFromExcel(1, 2));
		Reporter.log("Sending Passcode",true);
		Utility.wait(driver, 4000);
		welcome.clickonNoiamgood();
	}
	@Test
	public void ValidateUserID() throws EncryptedDocumentException, IOException
	{
		Assert.assertEquals(home.GetActualUserID(driver), Utility.ReadDataFromExcel(1, 3));
		Reporter.log("Validating USer ID and taking Screenshot",true);
		Utility.Screenshot(driver, "First");
	}
 
	@AfterMethod
	public void logoutfromupsttox() throws InterruptedException
	{
		home.logoutFromApp(driver);
		Reporter.log("logging out...",true);
	}
	@AfterClass
	public void CloseBrowser() 
	{
	Reporter.log("Closing Browser",true);	
	driver.close();
	}
}
