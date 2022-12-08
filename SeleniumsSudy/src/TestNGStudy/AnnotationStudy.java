


package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy {
	
 @Test
  public void ValidatePin() 
	  {
		  Reporter.log("Pin Validation Done-->@Test Used", true);
	  }
  @Test 
  public void ValidateUserID() 
  {
	  Reporter.log("USerID Validation Done-->@Test Used", true);
  }
  @BeforeMethod
  public void EnterUserIDAndPassword() 
  {
	  Reporter.log("UserIDandPasswordEntered Done-->@beforemethod used", true);
  }

  @AfterMethod
  public void Logout() 
  {
	  Reporter.log("LogOut Done-->@Aftermethod used", true);
  }

  @BeforeClass
  public void Browserlaunch() 
  {
	  Reporter.log("Browser launched Done-->@Beforeclass method used", true);
  }

  @AfterClass
  public void BrowserClosed() 
  {
	  Reporter.log("Browser closed Done-->@AfterMethod used", true);
  }

}
