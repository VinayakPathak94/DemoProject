import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
      System .setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		
		dropDown.click();
		Thread.sleep(1000);
		
		Select s=new Select(dropDown);
		Thread.sleep(1000);
		s.selectByValue("option2");
		Thread.sleep(4000);
		
		s.selectByIndex(0);
		
	}

}
