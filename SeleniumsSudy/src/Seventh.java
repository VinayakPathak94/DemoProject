import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Seventh {

	public static void main(String[] args) throws IOException, InterruptedException {
System .setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone13");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='s-color-swatch-inner-circle-border'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[14]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@data-iv-tab-view='ivVideosTab']")).click();
		//Thread.sleep(3500);
		 
		 File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 System.out.println(Source);
		 
		 File Destination = new File("C:\\selenium-java-4.4.0\\Screenshot\\screenshot2.jpeg");
		 
		 FileHandler.copy(Source, Destination);
		
		
	}

}
