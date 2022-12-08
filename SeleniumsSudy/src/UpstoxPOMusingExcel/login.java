package UpstoxPOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	public static void main(String[] args) {}
		
        
	//Variable Declaration
		@FindBy(name="userId") private WebElement userIDup;
		
		@FindBy(name="password")private WebElement passwordup;
		
		@FindBy(xpath = "//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")private WebElement SignInButton;
		
		//Intialize using constructor
		//Intialize variable with the help of--->PageFactory class which contains initElemnts method
		
		public login(WebDriver driver)//Because to handle chrome we need driver so we created driver as a local variable
		                                        //We can also say that "user defined parameterized Constructor"
		{

			PageFactory.initElements(driver, this);
		}

		//VAriable usage to perform action on element
		//Create non static method for variable usage
		
		public void enteruserID(String uid)
		{
			userIDup.sendKeys(uid);
		}
		
		public void enterpassword(String pass)
		{
			passwordup.sendKeys(pass);
		}
		
		public void clickonsigninbutton()
		{
			SignInButton.click();
		}
}
