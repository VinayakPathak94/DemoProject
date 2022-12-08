import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolDown1 {

	private static final String ScroolDown1 = null;

	public static void main(String[] args) throws ClassNotFoundException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.flipkart.com");
        Class.forName(ScroolDown1);

	}

}
