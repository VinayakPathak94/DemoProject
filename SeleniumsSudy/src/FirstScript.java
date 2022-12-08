import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		
		
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
