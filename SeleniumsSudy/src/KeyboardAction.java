import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		//Program for Key Board action
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        
      WebElement CreateNewAccount = driver.findElement(By.xpath("//a [@data-testid='open-registration-form-button']"));
      
      Actions act=new Actions(driver);
      Thread.sleep(2000);
      
      act.click(CreateNewAccount).perform();
      Thread.sleep(2000);
      
      WebElement Day = driver.findElement(By.id("day"));
      act.click(Day).perform();
      
      act.sendKeys(Keys.ARROW_DOWN).perform();
      Thread.sleep(500);
      act.sendKeys(Keys.ARROW_DOWN).perform();
      Thread.sleep(500);
      act.sendKeys(Keys.ARROW_DOWN).perform();
      Thread.sleep(500);
      act.sendKeys(Keys.ARROW_UP).perform();
      act.sendKeys(Keys.ENTER).perform();
      Thread.sleep(2000);
      
      //Program for selecting month
      
      WebElement Month = driver.findElement(By.id("month"));
      
      act.click(Month).perform();
      for(int i=0;i<=7 ;i++)
      {
    	  act.sendKeys(Keys.ARROW_UP).perform();
    	  Thread.sleep(500);
      }
      act.sendKeys(Keys.ENTER).perform();
      
	}

}
