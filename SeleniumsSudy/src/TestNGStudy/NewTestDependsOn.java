
package TestNGStudy;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestDependsOn {
//dependsOnMethods: If 1 TC execution depends on multiple TC 
//then we need to use "dependsOnMethods" TestNG keyword.
  @Test
  public void LogIn()
  {
	  Reporter.log("LogIn Done Successfully", true);
	  Assert.fail();
	 
  }
  @Test(dependsOnMethods = "LogIn")
  public void VerifyPin()
  {
	  Reporter.log("Pin is Verified", true);
	  
  }
  @Test
  public void LogOut()
  {
	  Reporter.log("LogOut Done successfully", true);
  }
  
  
}
