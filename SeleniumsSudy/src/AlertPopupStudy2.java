import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupStudy2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
//		2. Alert Popup:
//			1. We cannot inspect the elements present in pop up, does not have any colors
//			2. These popups will contain ok button or cancel button & Text.
//			3. Sometimes this type of popup also contains”?” or “!” symbol.
        
        driver.get("https://demoqa.com/alerts ");
        Thread.sleep(7000);
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        Alert alt = driver.switchTo().alert();
        
        System.out.println(alt.getText());
        Thread.sleep(2000);
        alt.accept();
        
        driver.findElement(By.id("alertButton")).click();

		

	}

}
