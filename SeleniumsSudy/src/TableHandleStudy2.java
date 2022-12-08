import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandleStudy2 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		
//		Absolute xpath
//		Absolute xpath is used to navigate from root of parent to its immediate child. To achieve absolute xpath, we need to use ‘/’.
//	/html/body/div[2]/input[1]
//	Relative xpath
//		Relative xpath is used to navigate from parent to any child. To achieve relative xpath, we need to use ‘//’.
//	//div[2]//input[1]
//	html/body/section/div[1]/div[1]
//	//section[2]//div//div
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		List<WebElement> TotalRows = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
				System.out.println("Total number of rows present on table is "+TotalRows.size());
				Thread.sleep(1000);
				System.out.println("=======================================================================");
				
				List<WebElement> Coulumn = driver.findElements(By.xpath("//table[@id='product']//tr/th"));
				System.out.println("Total number of coulumn is "+Coulumn.size());
				Thread.sleep(1000);
				System.out.println("=======================================================================");
				
				//Now we are taking text of all table using for each loop
				for(WebElement r:TotalRows)
				{
					System.out.println(r.getText());
				}
				System.out.println("=======================================================================");
				
				//We can take text of table with using another method without using loop
				 WebElement PathforAllTable = driver.findElement(By.xpath("//table[@id='product']/tbody"));
				System.out.println(PathforAllTable.getText());
				
	}

}
