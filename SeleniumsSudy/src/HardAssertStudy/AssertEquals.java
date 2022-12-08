package HardAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void TC1() 
  {
	  String a="Pune";
	  String b="Pune";
	//I need to verify a and b are equal or not?
	//if a and b are equal TC is passed or TC is failed
	  
//	  if(a.equals(b))
//	  {
//		  Reporter.log("a and b are matching TC is passed",true);
//	  }
//	  else
//	  {
//		  Reporter.log("a and b are not matching TC is failed ",true);
//	  }
	  
	  //Using Hard assert using static method of assert class
	  
	  //1)assertEquals()
	  //The Statement which is written will display on console only when test case is fail
	  Assert.assertEquals(a, b,"A and B are not matching TC is failed");
  }
}
