import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupStudy3 {

	public static void main(String[] args) throws InterruptedException {
		
		
			
//			Hidden-Division Popup:
//				1.	These popups are colorful.
//				2.	We can inspect the elements present in pop up.
//				3.	As we can inspect element present in popup then using selenium we can handle it & no need to switch.
//
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.name("q")).sendKeys("iphonee 14");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        
        
        

   

	}

}
