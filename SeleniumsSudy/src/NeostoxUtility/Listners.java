package NeostoxUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import UpstoxBase.BaseNew;

public class Listners extends BaseNew implements  ITestListener
{
 
@Override
public void onTestSuccess(ITestResult result) 
{
	Reporter.log("TC"+result.getName()+"Passes successfully", true);
}
}
