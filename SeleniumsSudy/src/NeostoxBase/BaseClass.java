package NeostoxBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	//Base class is used to launch the browser and to to perform action on browser we required driver
	//So firstly we need to intialize driver globally 
	
	protected WebDriver driver; //But we need to make it protected because we have to use that driver in another package using
	                           //inheritance operation 

	public void launchbrowser() 
	{
	
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();//Make a object 
		driver.get("https://neostox.com/sign-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
}
