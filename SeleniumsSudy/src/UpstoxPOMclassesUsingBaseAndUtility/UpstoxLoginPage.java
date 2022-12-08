package UpstoxPOMclassesUsingBaseAndUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage {
	//Variable Declaration
	@FindBy(name="userId")private WebElement UserId;
	
	@FindBy(name="password")private WebElement password;
	
	@FindBy(xpath="//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")private WebElement SignInButton;
	
	//Intialize using constructor
	//Intialize variable with the help of--->PageFactory class which contains initElemnts method
	
	public UpstoxLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable Usage
	public void SendUserName(String UN)
	{
		UserId.sendKeys(UN);
	}
	public void SendPass(String pass)
	{
		password.sendKeys(pass);
	}
	public void ClickOnSignIn()
	{
		SignInButton.click();
	}

}
