package UpstoxUsingUsingBaseandUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage
{
	//variable declaration
	@FindBy(name="yob")private WebElement passcode;

	//Variable intialization with constructor (pagefactory-->Initelemnts)
	public PasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage of varibal
	
	public void Enterpasscode(String pass)
	{
		passcode.sendKeys(pass);
	}
}
