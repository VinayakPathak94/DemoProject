import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourth {

	//Program for sendkeys on Facebook
	public static void main(String[] args) throws InterruptedException {
		System .setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
		
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
