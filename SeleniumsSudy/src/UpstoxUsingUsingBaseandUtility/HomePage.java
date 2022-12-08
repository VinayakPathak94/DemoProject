package UpstoxUsingUsingBaseandUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralizeMethods.ScreenshotMethod;

public class HomePage 
{
	//Variable declaration
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement username;
	
	@FindBy(id="funds")private WebElement funds;
	
	@FindBy(xpath="//div[text()='Logout']")private WebElement logout;
	
	//Variable intialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Usage 
	public void validateusername(WebDriver driver,String expid) throws IOException
	{
		String ActualuserID = username.getText();//Get text using declared variable
		String expectedID = expid;//Here we have not given any value because we are going to mention that value in TESTNg class
		
		
		
		if(ActualuserID.equals(expectedID))
		{
			System.out.println("Actual and expected userid are matching TC is passed");
			ScreenshotMethod.screenshotgeneralmethod(driver, ActualuserID);		
		}
		else
		{
			System.out.println("Actual and expected used id is not matching TC is failed");
		}
	}
		
		public void clickonfunds() throws InterruptedException
		{
			Thread.sleep(1000);
			funds.click();
			Thread.sleep(1000);
		}
	
		public void clickonlogout() throws InterruptedException
		{
			Thread.sleep(1000);
			funds.click();
			Thread.sleep(1000);
			logout.click();
		}
		
		public String getactualuserid(WebDriver driver)
		{
			String actualid = username.getText();
			return actualid;
			
		}

}
