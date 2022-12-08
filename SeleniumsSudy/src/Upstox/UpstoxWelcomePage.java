package Upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomePage {
//Variable Declaration
	@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement iamgood;
	
	//Intialize the variable withnthe help of constructor (PageFactory Class & initelements method)
	public UpstoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage of variable by creating non static method
	public void clickoniamgood() 
	{
		iamgood.click();
	}
	
	
}
