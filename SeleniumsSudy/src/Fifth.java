import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fifth {

	public static void main(String[] args) throws InterruptedException {
		System .setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Facebook create account");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='Start a Facebook Account - Create a New Facebook Account']")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s=new Select(day);
		
		
		Thread.sleep(2000);
		
		s.selectByValue("10");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
//		
//		driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//        Thread.sleep(2000);
//        
//        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//        
	}

}

