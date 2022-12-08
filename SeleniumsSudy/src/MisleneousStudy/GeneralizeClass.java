package MisleneousStudy;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralizeClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/login/");
        
        Thread.sleep(4000);
        //SendKey method
         WebElement sendkey = driver.findElement(By.name("email"));
        SendkeyGeneralize.sendkeys(driver,sendkey);
        
        Thread.sleep(1000);
//
//        //Send keys of last name
        WebElement lastname = driver.findElement(By.name("pass"));
       SendkeyGeneralize.lastname(driver, lastname);
       Thread.sleep(1000);
//       
//       //Click Method
        WebElement action = driver.findElement(By.id("loginbutton"));
        SendkeyGeneralize.clickmethod(driver, action);
//       
//        //Set size method
//        Dimension d=new Dimension(500, -50);
//        SendkeyGeneralize.setsizeandpositionmethod(driver, d);
//       
       //Set position method
       Point p=new Point(500, 5);
       SendkeyGeneralize.setpositionmethod(driver, p);
       Thread.sleep(2000);
//       
//       driver.manage().window().maximize();
//       Thread.sleep(2000);
//       //Scroll method
//       driver.navigate().to("https://paytm.com/");
//       WebElement scrollto = driver.findElement(By.xpath("//div[text()='Insurance made easy.']"));
//       
//       SendkeyGeneralize.scrollmethod(driver,scrollto);
//       
//       
	}

}
