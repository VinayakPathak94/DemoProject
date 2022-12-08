

package HardAssertStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC1 {
  @Test
  public void verifycheckbox() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://vctcpune.com/selenium/practice.html");
      WebElement CheckBox1 = driver.findElement(By.id("checkBoxOption1"));
      Thread.sleep(1000);
     
//      if(CheckBox1.isSelected())
//      {
//    	  Reporter.log("CheckBox is Selected so test case is passed",true);
//      }
//      else
//      {
//    	  Reporter.log("CheckBox is not selected so test case is failed", true);
//      }
//     
      CheckBox1.click();
      
      Assert.assertTrue(CheckBox1.isSelected(),"CheckBox is not selected test case is failed");
  }
}
