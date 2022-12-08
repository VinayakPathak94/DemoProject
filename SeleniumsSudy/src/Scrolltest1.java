import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
       driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		//Javascriptexecutor interface does not present in a Selenium architecture as like "Takesscreenshot" interface
		//We need to create typecasting of the "javaScriptExcutor" as "Takessreenshot"
		//Typecasting---->Type casting is when you assign a value of one primitive datatype to another type
		
       JavascriptExecutor je=(JavascriptExecutor)driver;
       
       je.executeScript("window.scrollBy(0,1000)");
       
		
	}

}
