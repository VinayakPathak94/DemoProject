import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PopUpStudy2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        // Program to handle Alert popup
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(1000);
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(7000);
        Alert alt = driver.switchTo().alert();
        
        System.out.println(alt.getText());
       alt.accept();
       Thread.sleep(1000);
      // Alert alt1 = driver.switchTo().alert();
       WebElement Alert = driver.findElement(By.xpath("//div[@class='pattern-backgound playgound-header']"));
       System.out.println(Alert.getText());
       //System.out.println(alt1.getText());
       
       driver.findElement(By.id("alertButton")).click();
       
       File Source = ((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
       File dest = new File("C:\\selenium-java-4.4.0\\Screenshot\\popup1.jpg");
       
       FileHandler.copy(Source, dest);
        

	}

}
