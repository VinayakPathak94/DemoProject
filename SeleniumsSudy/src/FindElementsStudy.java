

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
      List<WebElement> links = driver.findElements(By.tagName("a"));
        
      System.out.println(links.size());
      
      for(WebElement L:links)
      {
    	  System.out.println(L.getText());
      }
      
     
      
	}

}
