package HardAssertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void assertnotnull() 
  {
	  String a = null;
	  
	  Assert.assertNotNull(a, "TC is failed a is null");
	  
  }
}
