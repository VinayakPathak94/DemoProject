package NeoStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class UsernamePage 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement username;
	
	@FindBy(id="lnk_signup1")private WebElement signupbutton;
	
	
	//Intialize the variable withnthe help of constructor (PageFactory Class & initelements method)
	public UsernamePage(WebDriver driver)//This is parameterized constructor
	{
		PageFactory.initElements(driver, this);
	}
	
//Create non static method to perform action
	public void enterusername(String un)
	{
		username.sendKeys(un);
		Reporter.log("Sending username", true);
	}
	public void signupbutton()
	{
		signupbutton.click();
		Reporter.log("Clicking on signupbutton", true);
	}

}
