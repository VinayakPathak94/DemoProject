import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Courses'])[1]")).click();
		
		driver.close();
	}

}
