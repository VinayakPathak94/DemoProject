package UpstoxPOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Variable Declaration
		@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement  username;
		
		@FindBy(id = "funds") private WebElement fundsbutton;
		
		@FindBy(xpath = "//div[text()='Logout']")private WebElement logoutbutton;
		
		//Intialize the variable withnthe help of constructor (PageFactory Class & initelements method)
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Usage of variable by creating non static method to perform action
		public void validateUsername(WebDriver driver) throws InterruptedException
		{
			
			Thread.sleep(1000);
			
			String actualuserID = username.getText();
			String ExpectedUserID = "Eshwar T.";
			
			if(actualuserID.equalsIgnoreCase(ExpectedUserID))
			{
				System.out.println("Actual and Expected UserID are Matching that's why Test Case is Passed");
			}
			else
			{
				System.out.println("Actual and Expected UserID are Not Matching that's why Test Case is failed");
			}
			
		}
		public void Clickobfunds()
		{
			fundsbutton.click();
		}
		public void logoutfromapp()
		{
			username.click();
			logoutbutton.click();
		}
}
