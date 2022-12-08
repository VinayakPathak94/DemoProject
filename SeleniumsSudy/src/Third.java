import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Program for Selenium script
public class Third {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.getTitle();
		
		//String title=driver.getTitle();
		//System.out.println("Title is "+title);
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
	    driver.navigate().forward();
	    
	    driver.findElement(By.xpath("//a[text()='Log in']")).click();
	    
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    
	    driver.manage().window().minimize();
	    
		
		driver.close();
		

	}

}
