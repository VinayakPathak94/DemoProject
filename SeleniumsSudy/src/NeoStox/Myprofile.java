package NeoStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myprofile 
{
	@FindBy(xpath = "//span[text()='My Profile']")private WebElement myprofile;
	
	@FindBy(id="txt_userfname")private WebElement firstname;
	
	@FindBy(id="txt_userlname")private WebElement lastname;
	
	public Myprofile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickonmyprofile()
	{
		
		myprofile.click();
	}
	public void valiadtefirstname()
	{
		firstname.isDisplayed();
		
	}
	public void validatelastname()
	{
		lastname.isDisplayed();
	}
}
