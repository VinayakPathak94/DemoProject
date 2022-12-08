package MisleneousStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class MethodGeneralizationforSshot {
	
	public static void screenshotmethod(WebDriver driver,String name) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("G:\\Vinayak\\Automation Lecture\\ScreenShot saved\\"+name+".jpg");
		
		FileHandler.copy(src, destination);
		
		
	}

}
