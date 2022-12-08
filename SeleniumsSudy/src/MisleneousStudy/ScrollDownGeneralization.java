package MisleneousStudy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollDownGeneralization  {
	
	public static void Scrolldowngenralizemethod(WebDriver driver,WebElement element)
	{
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollintoview()",element);
	}

}
