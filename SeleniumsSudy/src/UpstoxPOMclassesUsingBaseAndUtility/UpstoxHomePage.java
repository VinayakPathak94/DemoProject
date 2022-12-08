package UpstoxPOMclassesUsingBaseAndUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage 
{   //Variable declaration
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement UserName;
	
	@FindBy(id="funds")private WebElement funds;
	
	@FindBy(xpath="//div[text()='Logout']")private WebElement logoutbutton;
	
	//Intialize variable 
	public UpstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Usage 
	public void ValidateUserid(WebDriver driver,String expID) throws InterruptedException
	{
		Thread.sleep(1000);
		String ActualUserId = UserName.getText();
		String ExpecteduserId = expID;
		
		if(ActualUserId.equals(ExpecteduserId))
		{
			System.out.println("Actual & Expected User ID are matching so TC is passed");
		}
		else
		{
			System.out.println("Actual & Expected user ID are not matching TC is failed ");
		}
	}
		
		public void ClickOnfunds(WebDriver driver) throws InterruptedException
		{
			Thread.sleep(2000);
			funds.click();
		}
		
		public void logoutFromApp(WebDriver driver) throws InterruptedException
		{
			UserName.click();
			Thread.sleep(1000);
			logoutbutton.click();
		}
	    
		//
		public String GetActualUserID(WebDriver driver)
		{
			String ActualUID = UserName.getText();
			return ActualUID;	
		}
}
