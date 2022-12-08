import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        //Program For hidden POP-Up
        
      //  •	If we are able to inspect element present in a popup then we can use selenium directly to handle that popup.
//        1.	These popups are colorful.
//        2.	We can inspect the elements present in pop up.
//        3.	As we can inspect element present in popup then using selenium we can handle it & no need to switch.
//

        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.name("q")).sendKeys("Iphone 13");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//Pop-Up Close
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
       // Program to handle Alert popup
        
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        		

	}

}
