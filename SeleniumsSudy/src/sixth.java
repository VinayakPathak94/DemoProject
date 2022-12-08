import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sixth {

	public static void main(String[] args) throws InterruptedException {
System .setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(2000);
		WebElement mobilenumber = driver.findElement(By.id("mobileNumber"));
		
		//mobilenumber.sendKeys("8888888888");
                 
		WebElement GetOtp = driver.findElement(By.xpath("//button[@type='submit']"));
		
		System.out.println(GetOtp.isEnabled());
		
	}

}
