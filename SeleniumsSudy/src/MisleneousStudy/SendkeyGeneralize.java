package MisleneousStudy;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendkeyGeneralize {
	public static void sendkeys(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='vinayak'", element);
	}
	
	public static void lastname(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].value='Pathak'",element);
	}
	
	public static void clickmethod(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()",element );
	}
	
	public static void setsizeandpositionmethod(WebDriver driver,Dimension d )
	{
		driver.manage().window().setSize(d);
	}
	
	public static void setpositionmethod(WebDriver driver,Point p)
	{
		driver.manage().window().setPosition(p);
	}
	
	public static void Sshot(WebDriver driver,String name)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("G:\\Vinayak\\Automation Lecture\\ScreenShot saved"+name+".jpg");
		//FileHandler.copy(src,destination);
			
	}

}
