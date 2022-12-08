import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame3 {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame2");
		WebElement Text = driver.findElement(By.id("sampleHeading"));
		Thread.sleep(2000);
		System.out.println("The text of frame 2 is  "+Text.getText());
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		WebElement Text1 = driver.findElement(By.id("sampleHeading"));
		System.out.println("The text of frame 1 is "+Text1.getText());
		
		WebDriver Text3 = driver.switchTo().parentFrame();
		
		System.out.println("The text of parent frame is "+Text3.getTitle());
	}

}
