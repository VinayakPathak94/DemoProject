import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
        driver.get("https://skpatro.github.io/demo/links/");
        
      String mainpageID = driver.getWindowHandle();
      System.out.println(mainpageID);
      //To open new tab/Window click on main page
      
      driver.findElement(By.name("NewTab")).click();
      Thread.sleep(2000);
      
      Set<String> allpageID = driver.getWindowHandles();
      
      System.out.println(allpageID);
      
      //toget desired page id we use iterator and use next method to move from one to another
      
     Iterator<String> it = allpageID.iterator();
     
    String mainpageID1 = it.next();
   String allpageID1 = it.next();
      System.out.println(mainpageID1);
      Thread.sleep(2000);
      System.out.println(allpageID1);
        

	}

}
