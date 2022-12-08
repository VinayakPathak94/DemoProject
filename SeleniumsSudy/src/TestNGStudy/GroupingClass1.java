package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingClass1 {
	//If i want to execute some specific method for specific scenario but many times not only 1 or 2
	//more than 500 or 700 test cases we need to execute that time "Include" or "Exclude" process is too lengthy
	//So we use grouping method,Which as follows
  @Test(groups = "funds")
  public void F() 
  {
	  Reporter.log("F TC running", true);
  }
  @Test(groups = "Home page")
  public void G() 
  {
	  Reporter.log("G TC running", true);
  }
  @Test(groups = "funds")
  public void H() 
  {
	  Reporter.log("H TC running", true);
  }
  @Test(groups = "Home page")
  public void I() 
  {
	  Reporter.log("I TC running", true);
  }
  @Test(groups = "funds")
  public void J() 
  {
	  Reporter.log("J TC running", true);
  }
  
}
