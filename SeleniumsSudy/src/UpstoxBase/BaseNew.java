package UpstoxBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseNew 
{
	protected  WebDriver driver;//WE make it protected because we are using this driver in another package
	//Make it static because static makes only one replica
	public void Launchbrowser()
	
	{
           System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://neostox.com/sign-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
