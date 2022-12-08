package UpstoxUsingUsingBaseandUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Varibale Declaration using annotation
	@FindBy(name="userId")private WebElement userID;
	
	@FindBy(name="password")private WebElement password;
	
	@FindBy(xpath="//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")private WebElement ClickButton;
	

//Now variable intialization using constructor(PageFactory,initelements)

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);//We used here "this"keyword to access globale variable from same class
}

//Variable Usage
//Create non static method for variable usage and to perform action

public void sendusername(String username)//Now we have given (String username) because we need to enter username in test class
                                         //And our username is in the form of string thats why we mention string here
{
	userID.sendKeys(username);//Call the object of veriable and use method which you need to perform
}
public void sendpassword(String entpassword)
{
     password.sendKeys(entpassword);
}
public void clickonbutton()
{
	ClickButton.click();
}









}
