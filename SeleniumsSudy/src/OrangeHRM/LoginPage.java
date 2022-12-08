package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Variable Declaration
	@FindBy(name="username")private WebElement username;
	
	@FindBy(name="password")private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;
	
	
	//Variable Intialization with constructor and initelements
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable usage to perform action
	public void enterusername(String UN)
	{
		username.sendKeys(UN);
	}
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickonbutton()
	{
		loginbutton.click();
	}
	
	

}
