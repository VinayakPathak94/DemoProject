package UpstoxPOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//Variable Declaration
		@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement iamgood;
		
		//Intialize the variable withnthe help of constructor (PageFactory Class & initelements method)
		public WelcomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Usage of variable by creating non static method
		public void clickoniamgood() 
		{
			iamgood.click();
		}
		

}
