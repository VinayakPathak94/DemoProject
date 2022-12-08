package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 

{  //Variable declaration
	@FindBy(xpath = "//span[text()='PIM']")private WebElement pimbutton;
	
	@FindBy(xpath = "//a[text()='Employee List']")private WebElement emplist;
	
	@FindBy(xpath="//span[text()=' (38) Records Found']")private WebElement records;
	
	
	//Variable intialization using constructor(pagefactory--->Initelements)
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variabe usage to perform action
	public void clickPIMbutton()
	{
		pimbutton.click();
	}
	public void employeelist()
	{
		emplist.click();
	}
	public void records()
	{
		records.click();
		
	}
	

}
