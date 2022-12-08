import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone 14");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        Thread.sleep(2000);
        
       List<WebElement> image = driver.findElements(By.tagName("img"));
       System.out.println(image.size());
       
        
	}

}
