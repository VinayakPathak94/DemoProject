package Upstox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxFundsPage {

	//Variable Declaration
	@FindBy(xpath="((//div[@class=\"_2Bthrplw1VYHfLzzQv0asZ\"])[1]//div)[3]")private WebElement availablefunds;
	
	//Intialize the variable withn the help of constructor (PageFactory Class & initelements method)
	public UpstoxFundsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage of variable by creating non static method to perform action
	public void validateavailablefunds(WebDriver driver) 
	{
		String myfunds = availablefunds.getText();
		System.out.println("My avaialble funds is "+myfunds);
	}
	
		

	
	

}
