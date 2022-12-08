package ActionClassStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        
      WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
      
      Actions act= new Actions(driver);
      
      act.contextClick(SearchBox).perform();
        

	}

}
