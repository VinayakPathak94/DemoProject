package GeneralizeMethods;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenshotMethod 
{

	public static void screenshotgeneralmethod(WebDriver driver,String name) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("G:\\Vinayak\\Screenshot\\"+name+".png");//We want to give specific name to our Sshot so we mention
	                                                        //(String name) into the bracket because we need to create local variable of it(Parameterzid mehod)
	org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
}
