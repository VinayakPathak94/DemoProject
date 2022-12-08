package MisleneousStudy;

import java.awt.Window;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionStudy1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://paytm.com/");
        
         Point defaultposition = driver.manage().window().getPosition();
         System.out.println("Default position of window is "+defaultposition);
         Thread.sleep(2000);
         
        Point p=new Point(500, 500);//You can use bboth + & - sign to set the window position
        driver.manage().window().setPosition(p);
      
      Thread.sleep(2000);
      
      
        Point newposition = driver.manage().window().getPosition();
       System.out.println(newposition);
      
      Thread.sleep(5000);
       
      //Now we are using method which is generalized in "MethodGeneralizationforSshot" class
        MethodGeneralizationforSshot.screenshotmethod(driver, "second");
       

	}

}
