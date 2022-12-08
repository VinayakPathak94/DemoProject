package UpstoxUsingUsingBaseandUtility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UpstoxBase.BaseNew;
import UpstoxBase.base;
import UpstoxUtility.Utility;
import UpstoxUtility.UtilityNew;

public class TestNGclasstoexecutemethod extends base {
  
//==============================================================================================
      //This class is used only to execute all the method present in POM classes
	  //This class extend the "Base" class so method or property which is present in base class will 
	  //Automatically comes in this class
//================================================================================================  
	  //Now we have to call static method from another class so we need to create object of that class
	  //So first create object of all POM classes globally so that we can reuse it
	  LoginPage login;
	  PasscodePage passcode;
	  WelcomePage welcome;
	  HomePage home;
  
	  
	  //So here we need to execute this class using testNg annotation
	  //@BeforeClass---->Open the nbrowser
	  //@BeforeMethod--->Login to upstox (SendUsername,password)
	  //@Test--->Validate userID
	  //@aftermethod---->LogOut from upstox
	  //@Afterclass---->Close the browser
	  
	  //create object of chrome options
      ChromeOptions opt=new ChromeOptions();
     
	  
	  @BeforeClass
	  //Create a nonstaticmethod
	  public void openbrowser()
	  {
		  opt.addArguments("--incognito");
		  
		  launchBrowser();//this method comes from "BaseNew" class cause we've extended it
		  Reporter.log("Launching Browser",true);
//=======================================================================================
//Now the object which we have created of all the classes we need to pass driver in it,becuase to perform browser
//Action we need driver
		   login = new LoginPage(driver);
		   passcode=new PasscodePage(driver);
		   welcome=new WelcomePage(driver);
		   home=new HomePage(driver);	  
	  }
	  @BeforeMethod   //Login to upstox (SendUsername,password)  
	  public void logintoupstox() throws EncryptedDocumentException, IOException, InterruptedException
	  {
		  login.sendusername(UtilityNew.readdatafromexcel(1, 0));
		  login.sendpassword(UtilityNew.readdatafromexcel(1, 1));
		  login.clickonbutton();
		  Reporter.log("Sending username & Paassword", true);
		  Thread.sleep(3000);
		  passcode.Enterpasscode(UtilityNew.readdatafromexcel(1, 2));
		  Reporter.log("Sending passcode", true);
		  Thread.sleep(2000);
		  welcome.clickonImgood();
		  Thread.sleep(3000);  
	  }
//======================================================================================================
	  //Now our test is to validate the user id so we have to do it using assertion
	  
	  @Test
	  public void validateuserid() throws EncryptedDocumentException, IOException
	  {
		  Assert.assertEquals(home.getactualuserid(driver),UtilityNew.readdatafromexcel(1, 3));
		  Reporter.log("Validating userID and taking Screenshot", true);
		  Utility.Screenshot(driver, "Validation");
	  }
//+======================================================================================================
	  //After method--->Logout from upstox
	  @AfterMethod
	  public void logout() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  home.clickonlogout();
		  Reporter.log("Logging out from application", true);
	  }
//==========================================================================================================
	  @AfterClass
	  public void closebrowser() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  Reporter.log("Closing Browser", true);
		  driver.close();
	  }
	  
	  
	  
  
}
