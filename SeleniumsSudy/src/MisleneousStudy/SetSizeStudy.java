package MisleneousStudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://paytm.com/");
        
        Dimension DefaultSize = driver.manage().window().getSize();//This method will give the default size of the window after launching the URl
         System.out.println(DefaultSize);
//        
          Dimension d=new Dimension(1000, 100);//The value which is inserted in this method is nothing but the pixel value
         Thread.sleep(3000);
         driver.manage().window().setSize(d);//This method will give size of our window(diemension)
         Thread.sleep(3000);
          driver.manage().window().maximize();//It will maximize the window
           Thread.sleep(3000);
         Dimension maxsize = driver.manage().window().getSize();//This method is used to get size of max window
         Thread.sleep(2000);
          System.out.println("Maximum window size is "+maxsize);
//        
        
	}

}
