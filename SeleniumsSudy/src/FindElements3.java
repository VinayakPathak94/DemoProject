import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.google.co.in/");
        
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        
        System.out.println(Links.size());
        
        for(WebElement L:Links)
        {
        	System.out.println(L.getText());
        }
	}

}
