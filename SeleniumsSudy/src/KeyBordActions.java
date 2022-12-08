import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBordActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
       driver.get("https://www.facebook.com/");
       Thread.sleep(3000);
       
      WebElement CreateAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
       Thread.sleep(1000);
       
       Actions act=new Actions(driver);
       act.click(CreateAccount).perform();
       Thread.sleep(1000);
       
       WebElement Day = driver.findElement(By.id("day"));
       act.click(Day).perform();
       Thread.sleep(1000);
       act.sendKeys(Keys.ARROW_DOWN).perform();
       Thread.sleep(500);
       act.sendKeys(Keys.ARROW_DOWN).perform();
       Thread.sleep(500);
       act.sendKeys(Keys.ARROW_UP).perform();
       Thread.sleep(500);
       act.sendKeys(Keys.ENTER).perform();
       Thread.sleep(500);
       
       //Program for to select the DAy using keyboard class
       
       WebElement Month = driver.findElement(By.id("month"));
       
       act.click(Month).perform();
       
       for(int i=0;i<=6;i++)
       {
    	   act.sendKeys(Keys.ARROW_UP).perform();
    	   Thread.sleep(2000);
    	   
       }
       act.sendKeys(Keys.ENTER).perform();
       
       
	}

}
