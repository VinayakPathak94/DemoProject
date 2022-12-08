import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewOfFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='col col-7-12']/div)[2]")).click();
		
		String mainpage = driver.getWindowHandle();
		Set<String> Bothtab= driver.getWindowHandles();
		
		Iterator<String> it = Bothtab.iterator();
		String mainwindow = it.next();
		String childtab = it.next();
		
		driver.switchTo().window(childtab);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3_L3jD']")).click();
		Thread.sleep(2000);
		 List<WebElement> Reviews = driver.findElements(By.xpath("(//div[@class='_2c2kV-'])/div"));
		 
		 for(WebElement r:Reviews)
		 {
			 System.out.println(r.getText());
		 }
		
		
		
		//driver.switchTo().window(Bothtab)
		
		
		
		//Thread.sleep(10000);
		//driver.close();

	}

}
