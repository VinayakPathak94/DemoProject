import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.runtime.model.ConsoleAPICalled.Type;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException
	{
System .setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	   driver.get("https://www.amazon.in/");
	   File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   System.out.println(Source);
	   
	   File Destination = new File("C:\\selenium-java-4.4.0\\Screenshot\\screenshot2.jpeg");
			   
			   FileHandler.copy(Source, Destination);
		
		
	}

}
