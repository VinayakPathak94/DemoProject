import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandleStudy {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(1000);
	List<WebElement> NoofRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
	
	System.out.println("Number of rows present on table is "+NoofRows.size());
	Thread.sleep(2000);
	System.out.println("=================================================================");
	
	List<WebElement> NoofColumns = driver.findElements(By.xpath("(//table[@id='product']//tr)[1]//th"));
	System.out.println("Total number of coulumns present on a table is "+NoofColumns.size());
	Thread.sleep(5000);
	System.out.println("=================================================================");
	
	//Now we are reading and getting text of all table with using for each loop
	for(WebElement r:NoofRows)
	{
		System.out.println(r.getText());
	}
	System.out.println("=================================================================");
	//Without using for each loop
	 WebElement WholeTable = driver.findElement(By.xpath("//table[@id='product']//tbody"));
	 System.out.println(WholeTable.getText());
		System.out.println("=================================================================");
	
}
}
