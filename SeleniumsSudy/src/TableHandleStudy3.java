import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandleStudy3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/50963/ind-vs-rsa-3rd-odi-south-africa-tour-of-india-2022");
		
		 WebElement ScoreBoard = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/div/div)[3]"));
		 System.out.println("Fall of wicket "+ScoreBoard.getText());
		Thread.sleep(10000);
		driver.close();

	}

}
