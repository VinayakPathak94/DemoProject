package UpstoxBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseOrangeHRM 
{
protected WebDriver driver;//We make it protected because we are using this driver in another package
	
	public void launchbrowser()
	
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}


}
