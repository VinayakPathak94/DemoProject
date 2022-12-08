package MisleneousStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitStudy1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://vctcpune.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//latest syntax after selenium 4
        
      //you are waiting for 100sec page loaded in 20 sec once page loaded release timeout(80sec)
        
        
	}

}
