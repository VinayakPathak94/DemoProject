import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandleStudy4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
	 List<WebElement> numberofrows = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")); 
	 System.out.println("Total Number of rows present on table "+ numberofrows.size());
	 System.out.println("===========================================================");
	 
	 List<WebElement> noofcoulumn = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th"));
	 System.out.println("Total number of column is "+noofcoulumn.size());
	 System.out.println("===========================================================");
	 
	 //We can take text of all the table using foreach loop
	 for(WebElement r:numberofrows)
	 {
		 System.out.println(r.getText());
	 }
	 System.out.println("===========================================================");
	 
	 //Without using for each loop
	 WebElement BodyOftable = driver.findElement(By.xpath("//table[@id='product']/tbody"));
	 System.out.println(BodyOftable.getText());
	 System.out.println("===========================================================");
	 
	}

}
