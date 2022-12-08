import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/frames");
			driver.switchTo().frame("frame1");
			Thread.sleep(2000);
			WebElement Text1 = driver.findElement(By.id("sampleHeading"));
			
			System.out.println("Text of frame1 is "+Text1.getText());
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(2000);
			driver.switchTo().frame("frame2");
			Thread.sleep(2000);
			WebElement Text2 = driver.findElement(By.id("sampleHeading"));
			
			System.out.println("Text of frame2 is "+Text2.getText());
			

	}

}
