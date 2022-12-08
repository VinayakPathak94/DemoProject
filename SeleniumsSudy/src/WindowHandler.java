import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13"); //Search Field
        Thread.sleep(1000);
        driver.findElement(By.id("nav-search-submit-button")).click();  //Search Button
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
        Thread.sleep(2000);
        
        //Program for Windows Handler 
       Set<String> WindowsHandler = driver.getWindowHandles();
       System.out.println(WindowsHandler);
       
             Iterator<String> iterator = WindowsHandler.iterator();
                              String ParentWindow = iterator.next();
                              String Childwindow = iterator.next();
                              
                              driver.switchTo().window(Childwindow);
                              Thread.sleep(8000);
              driver.findElement(By.xpath("(//input[@class='a-button-input'])[13]")).click();     
              
         //Program for ScreenShot
              File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     		 
     		 System.out.println(Source);
     		 
     		 File Destination = new File("C:\\selenium-java-4.4.0\\Screenshot\\screenshot10.jpeg");
     		 
     		 FileHandler.copy(Source, Destination);
     		
     		
	}

}
