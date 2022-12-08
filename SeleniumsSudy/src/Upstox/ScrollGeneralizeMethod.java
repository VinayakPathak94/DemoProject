package Upstox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollGeneralizeMethod {

	public static void main(String[] args) {}
		public static void Scrolldowngenralizemethod1(WebDriver driver,WebElement fundsbutton)
		{
			WebElement element1=driver.findElement(By.id("funds"));
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("arguments[0].scrollintoview()",element1);
		}
		

	

}
