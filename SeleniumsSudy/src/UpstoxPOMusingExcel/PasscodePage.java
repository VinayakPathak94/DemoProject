package UpstoxPOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage {
	//variable Decleration
		@FindBy(name="yob")private WebElement passcode;
		
		//Intialize the variable withnthe help of constructor (PageFactory Class)
		public PasscodePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//Usage of variable
		//create non static method to perform action
		public void enterpasscode(String pass)
		{
			passcode.sendKeys(pass);
		}

}
