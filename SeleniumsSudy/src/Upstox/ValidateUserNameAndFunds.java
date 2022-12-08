package Upstox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidateUserNameAndFunds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	      
        
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://login-v2.upstox.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));
	      
	      //Sending Username
	      driver.findElement(By.id("userCode")).sendKeys("4YB8VB");
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));
	      
	      //Sending Password
	      driver.findElement(By.name("password")).sendKeys("Esh@7551gm");
	      
	      //Click on log in button
	      driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(800));
	      
	      
	      //We will navigate on next page,need to enter YEAR OF BIRTH
	      driver.findElement(By.id("yob")).sendKeys("1993");
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(800));
	      
	      //Will navigate on next page inspect the element (Ctrl+shift+I)shortcut to enable Dev tool
	      driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));
	      
	      //Validate user name 
	      String Actualusername = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
	     
	      
	      
	      String ExpectedUSername = "Eshwar T";
	      
	      //We need to use if-else condition here
	      if(Actualusername.equals(ExpectedUSername))
	      {
	    	  System.out.println("Actual user name is matching with expected user name thats why test case is passed ");
	      }
	      else
	      {
	    	  System.out.println("Actual user name is not matching with expected user name thats why test case is fail");
	      }
	      
	      //Check & Validate Funds
	      driver.findElement(By.id("funds")).click();
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));
	      
	      String Funds = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
	      
	      System.out.println("Available funds to trade is "+Funds);
	      
	}

}
