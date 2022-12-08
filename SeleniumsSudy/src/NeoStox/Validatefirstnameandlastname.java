package NeoStox;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeostoxUtility.UtilityPage;
import UpstoxBase.BaseNew;

public class Validatefirstnameandlastname extends BaseNew {
	UsernamePage username;
	PasswordPage pass;
	HomePage home;
	
	
	
	
	//So here we need to execute this class using testNg annotation
	  //@BeforeClass---->Open the nbrowser
	  //@BeforeMethod--->Login to app (SendUsername,password)
	  //@Test--->Validate firstname and lastname
	  //@aftermethod---->LogOut from upstox
	  //@Afterclass---->Close the browser
	
	@BeforeClass
	public void openbrowser()
	{
		Launchbrowser();
		//Pass driver in objectof POM class
		username=new UsernamePage(driver);
		pass=new PasswordPage(driver);
		home=new HomePage(driver);
		
		
			
	}
	@BeforeMethod
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		username.enterusername(UtilityPage.readdatafromexcel(1, 0));
		Thread.sleep(2000);
		username.signupbutton();
		Thread.sleep(2000);
		pass.enterpassword(UtilityPage.readdatafromexcel(1, 1));
		Thread.sleep(2000);
		pass.clickonsubmit();
		Thread.sleep(2000);
		home.popuphandleok();
		Thread.sleep(2000);
		home.popuphandleclose();
		Thread.sleep(2000);
		
		
	}
  @Test
  public void FNandLNvalidation() throws InterruptedException 
  {
	  home.clickonmyprofile();
	  Thread.sleep(2000);
	  home.valiadtefirstname();
	  Thread.sleep(2000);
	  home.validatelastname();
	  
  }
  @AfterMethod
  public void logoutfromapp() throws InterruptedException
  {
	  home.logoutfromapp();
	  Thread.sleep(2000);
  }
  @AfterClass
  public void closebrowser()
  {
	  driver.close();
  }
}
