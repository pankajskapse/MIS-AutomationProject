package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.ExtentTest.Status;

public class TestNGListener extends TestBase implements ITestListener
{
	ExtentTest test;
	ExtentReports extent = resources.ExtentReportNG.getReportObject();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName());
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	

	
}
