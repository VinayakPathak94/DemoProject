import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(1000);
        
        Actions act=new Actions(driver);
        //Program for the Right click
        
//        WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//        
//        //Perform action on selected XPATH
//        act.moveToElement(RightClick).contextClick().build().perform();
//        Thread.sleep(2000);

        //Program For the Double Click
        
        
        WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
       // 1st way
        //act.moveToElement(DoubleClick).perform();
       // act.doubleClick().perform();
        
        
        
        //2nd way
        //act.moveToElement(DoubleClick).doubleClick().build().perform();
        
        //3rd way
        act.doubleClick(DoubleClick).perform();
	}
	

}
