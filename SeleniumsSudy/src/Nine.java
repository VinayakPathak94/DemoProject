import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Nine {

	public static void main(String[] args) throws InterruptedException, IOException {
         System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         
        
         
         driver.get("https://www.amazon.in/");
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone13");
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
         Thread.sleep(7000);
         //driver.getWindowHandle();
        
         driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
         Thread.sleep(12000);
        driver.getWindowHandles();
        // driver.switchTo().frame("a-container");
         //driver.switchTo().frame("altImages");
        // Thread.sleep(10000);
         //driver.findElement(By.id("bylineInfo")).click();
        //driver.findElement(By.id("a-autoid-8")).click();
         //driver.findElement(By.xpath("(//input[@type='submit'])[17]"));
        // Thread.sleep(3000);
 		//driver.findElement(By.xpath("//a[@data-iv-tab-view='ivVideosTab']")).click();
         
         
         
       //span[@class='a-button a-button-thumbnail a-button-toggle a-button-selected a-button-focus']
         

	}

}//bylineInfo
//altImages
//a-page