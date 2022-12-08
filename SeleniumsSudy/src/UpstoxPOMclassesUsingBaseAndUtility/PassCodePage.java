package UpstoxPOMclassesUsingBaseAndUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassCodePage 
{
	//Variable Dclaration
	@FindBy(name="yob")private WebElement passcode;
	
	//variable Intialization
	
	public PassCodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage(Variable method-->Action)
	public void enterpasscode(String pass)
	{
		passcode.sendKeys(pass);
	}
	

}
