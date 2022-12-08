import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElementStudy3 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Iphone 14 pro max");
		Thread.sleep(2000);
		
		 List<WebElement> SearchList = driver.findElements(By.xpath("//ul[@class='erkvQe']/div//li"));
		
		Thread.sleep(5000);
		for( WebElement Loop:SearchList)
		{
			System.out.println(Loop.getText());
			
			String ExpectedResult = "iphone 14 pro max colors";
			
			if(ExpectedResult.equals(Loop.getText()));
			{
				Loop.click();
				break;
			}
		}
		Thread.sleep(5000);
		
	}

}
