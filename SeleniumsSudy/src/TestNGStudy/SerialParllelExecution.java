package TestNGStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerialParllelExecution {
 //We will see execution of program serially and paralley,Parallel execution takes more time as compared 
//to serial execution because in serial execution (in xml file) thread count=5 it means execution is divided
//And in parallel case suit runs parallely so thetre in that case "thread count" not required cause suit execution is not divided
//so it takes more time 
  @Test
  public void LaunchAmazon() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
  }
}
