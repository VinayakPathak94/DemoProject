import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

         driver.get("https://www.google.co.in/");
		
         driver.findElement(By.name("q")).sendKeys("Honda Amaze");
//		 
		 
		 Thread.sleep(2000);
		 List<WebElement> SearchList = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		 
		 Thread.sleep(2000);
		 for(WebElement list:SearchList)
		 {
			 System.out.println(list.getText());
		 
			 String ExpectedResult = "honda amaze mileage";
			 
			 if(ExpectedResult.equals(list.getText()))
			 {
				 list.click();
				 break;			 }
		 
		 }

	}

	}

	
