import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
        driver.get("https://skpatro.github.io/demo/links/");
        
          // to get ID of main page use getWidnowHandle-->
        
      String mainPageID = driver.getWindowHandle();
		
      System.out.println(mainPageID);
      
   // to open new tab/window click on main page-->New Button
      
      driver.findElement(By.name("NewTab")).click();
      Thread.sleep(5000);
      
   // now main page along with child/ new window will be available
   // to get all page ID's use getWindowHandles() method which will

      Set<String> AllPageID = driver.getWindowHandles();   
      System.out.println(AllPageID);
      
   // to get desired page id use iterator and use next method to move

                           Iterator<String> it = AllPageID.iterator();
                           
                         
                           String mainPageID1 = it.next();
                             String AllPageID1 = it.next();
                             System.out.println(mainPageID1);
                             Thread.sleep(3000);
                            // System.out.println();
                             
                             driver.switchTo().window(AllPageID1);// switching selenium  focus from main page to child page            
                             Thread.sleep(3000);
                             driver.manage().window().maximize();
                             driver.close();
                             Thread.sleep(2000);
                             driver.quit();
                          
                          
                          
                          
	  

	}

}
