package HardAssertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void AssertTrueUse() 
  {
	  boolean a = false;
	  
	  //If it is true then TC should be passed
	  Assert.assertTrue(a, "TC is failed because a is false");
  }
  @Test
  public void AssertFalseUse() 
  {
	 boolean b = true; 
	 
	 //TC will execute when b is false
	 Assert.assertFalse(b, "TC is failed because b is true");
  }
}
