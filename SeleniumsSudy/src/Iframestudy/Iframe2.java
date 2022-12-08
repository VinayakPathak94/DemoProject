package Iframestudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		Thread.sleep(2000);
	}

}
