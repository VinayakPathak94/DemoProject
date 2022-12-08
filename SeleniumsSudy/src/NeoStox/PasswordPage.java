package NeoStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PasswordPage 
{
	@FindBy(id="txt_accesspin")private WebElement password;
	
	@FindBy(id="lnk_submitaccesspin")private WebElement submitbutton;
	
	//Use constructor using PageFactory-->initelements
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Create non static method to perform action
	
	public void enterpassword(String PSW)
	{
		password.sendKeys(PSW);
		Reporter.log("Sending password", true);
	}
	
	public void clickonsubmit() 
	{
		submitbutton.click();
		Reporter.log("Clicking on submitbutton", true);
	}
	

}
