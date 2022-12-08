package UpstoxUsingUsingBaseandUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	//Variable declaration
	@FindBy(name="(//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'])[1]")private WebElement iamgoodbutton;
	
	//variable intialization using constructor pagefactory--->intitelements
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Now usage of variable to perform action using non static method
	public void clickonImgood()
	{
		iamgoodbutton.click();
	}
	
	

}
