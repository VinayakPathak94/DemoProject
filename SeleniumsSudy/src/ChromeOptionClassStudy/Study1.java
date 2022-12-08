package ChromeOptionClassStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Study1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
      
        
      //create object of chrome options
        ChromeOptions opt=new ChromeOptions();
        
      //call method addArguments and add desired options
		opt.addArguments("--incognito");
		opt.addArguments("start-maximized");
		opt.addArguments("version");
		//opt.addArguments("headless");
		
		
		
		
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://www.amazon.in");
        
		
		
		
		
		
		
	}

}
