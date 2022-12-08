package NeoStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage 
{
	@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement popupok;
	
	@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement popupclose;
	
	@FindBy(id = "lbl_username")private WebElement userID;
	
	@FindBy(id = "lbl_curbalancetop")private WebElement funds;
	
	@FindBy(xpath = "//span[text()='Logout']")private WebElement logoutbutton;
	
    @FindBy(xpath = "//span[text()='My Profile']")private WebElement myprofile;
	
	@FindBy(id="txt_userfname")private WebElement firstname;
	
	@FindBy(id="txt_userlname")private WebElement lastname;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void popuphandleok() 
	{
	popupok.click();
	}
	public void popuphandleclose() 
	{
	popupclose.click();
	}
	
	public String validateuserid()
	{
		String ActualID = userID.getText();//Get text using declared variable
		Reporter.log("Getting actual userid",true);                       //Here we have not given any value because we are going to mention that value in TESTNg class
		return ActualID;
	}
	public String getfunds()
	{
		String actualfunds = funds.getText();
		Reporter.log("Getting actual funds", true);
		return actualfunds;
	}
	public void logoutfromapp() throws InterruptedException
	{
		funds.click();
		Thread.sleep(2000);
		logoutbutton.click();
		Reporter.log("Logging out from app...", true);
	}
	public void clickonmyprofile() throws InterruptedException
	{
		funds.click();
		Thread.sleep(1000);
		myprofile.click();
	}
	public void valiadtefirstname() throws InterruptedException
	{
		Thread.sleep(1000);
		
		System.out.println(firstname.isDisplayed());
		
	}
	public void validatelastname() throws InterruptedException
	{
		Thread.sleep(1000);
		
		System.out.println(lastname.isDisplayed());
	}
}
