package Upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPassCodePage {
	//variable Decleration
	@FindBy(name="yob")private WebElement passcode;
	
	//Intialize the variable withnthe help of constructor (PageFactory Class)
	public UpstoxPassCodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage of variable
	//create non static method to perform action
	public void enterpasscode()
	{
		passcode.sendKeys("1993");
	}
	

}
