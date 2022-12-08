package NeoStox;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeostoxUtility.UtilityPage;
import UpstoxBase.BaseNew;

public class Displaycharttestclass extends BaseNew
{
	UsernamePage username;
	PasswordPage pass;
	HomePage home;
	ChartStyle chart;
	
	 //So here we need to execute this class using testNg annotation
	  //@BeforeClass---->Open the nbrowser
	  //@BeforeMethod--->Login to app (SendUsername,password)
	  //@Test--->Change displaychart
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
		chart=new ChartStyle(driver);
	}
	@BeforeMethod
	public void logintoapp() throws EncryptedDocumentException, IOException, InterruptedException
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
  public void changedisplay() throws InterruptedException 
  {
	  chart.clickondisplay();
	  Thread.sleep(2000);
	  chart.selectchart();
	  Reporter.log("Changing chart style", true);
	  Thread.sleep(2000);
	    
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
