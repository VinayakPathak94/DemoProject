package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest4 {
//Note:  priority can be  
//i. bydefault=0	ii. +ve integer	iii. -ve integer	iv. Duplicate
	
	//(enabled=false) is used to disabled the method
			

  @Test
  public void A() 
  {
	  Reporter.log("Hi this is method A", true);
  }
  @Test
  public void B() 
  {
	  Reporter.log("Hi this is method B", true);
  }
  @Test
  public void C() 
  {
	  Reporter.log("Hi this is method C", true);
  }
  @Test
  public void D() 
  {
	  Reporter.log("Hi this is method D", true);
  }
  @Test
  public void E() 
  {
	  Reporter.log("Hi this is method E", true);
  }
  
}
