package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingClass {
	    //If i want to execute some specific method for specific scenario but many times not only 1 or 2
		//more than 500 or 700 test cases we need to execute that time "Include" or "Exclude" process is too lengthy
		//So we use grouping method,Which as follows
	
  @Test (groups = {"Home page","funds"})//In this scenario if we "exclude"(home page,funds) group then this msg
  public void A()                       //won't execute.but if we "include"(home pgae,funds) this TC will execute
  {
	  Reporter.log("A TC running", true);
  }
  @Test(groups = "funds")
  public void B() 
  {
	  Reporter.log("B TC running", true);
  }
  @Test(groups = "Home page")
  public void C() 
  {
	  Reporter.log("C TC running", true);
  }
  @Test(groups = "funds")
  public void D() 
  {
	  Reporter.log("D TC running", true);
  }
  @Test(groups = "Home page")
  public void E() 
  {
	  Reporter.log("E TC running", true);
  }
  
  
}
