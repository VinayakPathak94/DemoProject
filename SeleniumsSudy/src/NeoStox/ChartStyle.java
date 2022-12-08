package NeoStox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChartStyle 
{
	@FindBy(xpath="//span[text()='Display']")private WebElement display;
	@FindBy(xpath="//span[text()='Colored Bar']")private WebElement chart;
	
	
	public ChartStyle (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickondisplay()
	{
		display.click();
	}
	public void selectchart()
	{
		chart.click();
	}
	
	
	
	

}
