package HardAssertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void assertnulluse() 
  {
	  String a = null;
	  
	  //TC should be passed if a is null
	  Assert.assertNull(a, "TC is fail because a is not null");
  }
}
