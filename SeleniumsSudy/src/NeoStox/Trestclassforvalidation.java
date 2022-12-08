package NeoStox;

import org.testng.annotations.Test;

import NeostoxBase.BaseClass;
import NeostoxUtility.UtilityPage;
import UpstoxBase.BaseNew;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

//Syntax: @Listeners(PackageName.ClassName.class)
@Listeners(NeostoxUtility.Listners.class)
public class Trestclassforvalidation extends BaseNew{
	//Create an object of all the class to reuse and to execute the method
	UsernamePage username;
	PasswordPage pass;
	HomePage home;
	UtilityPage utility;
	
	 //So here we need to execute this class using testNg annotation
	  //@BeforeClass---->Open the nbrowser
	  //@BeforeMethod--->Login to app (SendUsername,password)
	  //@Test--->Validate userID
	  //@aftermethod---->LogOut from upstox
	  //@Afterclass---->Close the browser
	  
	
  @BeforeClass
  public void openbrowser()throws IOException, InterruptedException
  {
	  Launchbrowser();
	  Thread.sleep(2000);
	//Now the object which we have created of all the classes we need to pass driver in it,becuase to perform browser
	//Action we need driver
	  username=new UsernamePage(driver);
	  pass = new PasswordPage(driver);
	  home=new HomePage(driver);
	  
	  
  }
  @BeforeMethod
  public void signintonewstox() throws EncryptedDocumentException, IOException, InterruptedException
  {
	 
	 username.enterusername(UtilityPage.readdatafromexcel(1, 0));
	  Thread.sleep(1000);
	  username.signupbutton();
	  Thread.sleep(2000);
	  pass.enterpassword(UtilityPage.readdatafromexcel(1, 1));
	  Thread.sleep(1000);
	  pass.clickonsubmit();
	  Thread.sleep(1000);
	  home.popuphandleok();
	  Thread.sleep(1000);
	  home.popuphandleclose();
  }
  @Test(priority=-1)
  
 
	  public void validateusername() throws EncryptedDocumentException, IOException, InterruptedException
	  {
		  Assert.assertEquals(home.validateuserid(), UtilityPage.readdatafromexcel(1, 3),"TC failed because actual and expected userid are not matching");
		  Thread.sleep(2000);
		  
	
	  }
  @Test
  
  public void validatefunds() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(home.getfunds(), UtilityPage.readdatafromexcel(1, 4),"Tc failed because actual and expected funds not matching");
  }
  
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  home.logoutfromapp();
	  Thread.sleep(2000);
  }
  @AfterClass
  public void closeabrowser()
  {
	  driver.close();
	  Reporter.log("Closing Browser..", true);
  }
}
