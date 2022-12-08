package UpstoxPOMclassesUsingBaseAndUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	
	//Variable Declaration
	@FindBy(xpath = "//div[text()='No, I’m good']")private WebElement noIamGood;
	
	//Variable Intialization
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage 
	public void clickonNoiamgood()
	{
		noIamGood.click();
	}
	

}
