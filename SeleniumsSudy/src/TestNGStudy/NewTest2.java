package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2{
	//1.invocationCount: Sometimes same test method/TC need to be executed multiple 
	//times which can be possible by using TestNG keyword "invocationCount"
  @Test(invocationCount=1)
  public void Display() 
  {
	  Reporter.log("HI,Good morning",false );//If we give boolean value "TRUE" then it will print the given value
  }	                                        //But if we pass boolean value "FALSE" them it will not print the given value
  
  @Test
  
  public void Display2()
  {
	  Reporter.log("Good morning,my name is Vinayak", true);
  }

}
