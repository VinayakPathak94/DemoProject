package HardAssertStudy;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
  private static final ITestResult True = null;

@Test
  public void AssertNotEqualsUse() 
  {
	  //My Test case will pass when two things are not equals-->
	  
	  String a = "MH";
	  String b = "MH";
	  
	  Assert.assertEquals(a, b, "A & B are equal TC is failed");
	  Reporter.log("TC is passed A & B are not matching", true);
	  
  }

}
