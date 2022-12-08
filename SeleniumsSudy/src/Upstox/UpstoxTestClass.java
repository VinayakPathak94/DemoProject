package Upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	      
        
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://login-v2.upstox.com/");
	      
	      //Now Create an object of Upstox login page
	      UpStoxLoginPage login=new UpStoxLoginPage(driver);
	      login.enteruserID();
	      login.enterpassword();
	      login.clickonsigninbutton();
	      
	      Thread.sleep(1000);
	      
	      //Create an object of UpstoxPassCodepage class
	      UpstoxPassCodePage passcode=new UpstoxPassCodePage(driver);
	      passcode.enterpasscode();
	      
	      Thread.sleep(6000);
	      
	    //Create an object of UpstoxWelcomePage class
	      UpstoxWelcomePage iamgoodbutton=new UpstoxWelcomePage(driver);
	    		  iamgoodbutton.clickoniamgood();
	    		  
	      Thread.sleep(1000);

	    //Create an object of homepage class
	    		  HomePage home=new HomePage(driver);
	    		  home.validateUsername(driver);
	    		  home.Clickobfunds();
	    
	       Thread.sleep(1000);
	    		  
	    //Create an object of Upstoxfundspage class
	    		  UpstoxFundsPage fund=new UpstoxFundsPage(driver);
	    				  fund.validateavailablefunds(driver);
	    				  home.logoutfromapp();
	    		  
	}

}
