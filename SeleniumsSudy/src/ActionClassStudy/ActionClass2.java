package ActionClassStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Program for credit side
	WebElement Sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
//==========================================================================================
	WebElement Destination = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
	
	Actions act=new Actions(driver);
	
	act.dragAndDrop(Sales, Destination).perform();
	Thread.sleep(3000);
//===================================================================================================
	WebElement Amount = driver.findElement(By.xpath("//a[text()=' 5000']"));
	
	 WebElement Destination2 = driver.findElement(By.id("amt8"));
	 
	 act.dragAndDrop(Amount, Destination2).perform();
	 Thread.sleep(2000);
	
	
	 //Program for debit side
	 WebElement Bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	                 
	 WebElement Destination3 = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
	}

}
