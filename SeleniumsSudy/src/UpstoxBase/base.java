package UpstoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	//Base Class is used to launch the browser
	protected WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        
        driver=new ChromeDriver();
        driver.get("https://login-v2.upstox.com");
        driver.manage().window().maximize();
	}
	
	

}
