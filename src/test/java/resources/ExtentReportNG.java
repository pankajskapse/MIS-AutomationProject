package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG 
{

	public static ExtentReports getReportObject()
	{
		String path = System.getProperty("user.dir")+"\\Reports1\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		
		report.config().setReportName("MIS Sprint wise report");
		report.config().setDocumentTitle("Sprint 001 Result");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("QA Name", "Pankaj Kapse");
		
		return extent;
	}
}
