package utilities;

import java.io.File;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {
	
	ExtentReports exRep ;
	
	@BeforeTest
	public ExtentReports config() {
		
		//extent reports , extent spark reporter
		//String path = System.getProperty("user.dir") + "\\ExtentReports\\index.html";
		String path = System.getProperty("user.dir") + File.separator + "ExtentReports" + File.separator + "index.html";
		ExtentSparkReporter rep = new ExtentSparkReporter(path);
		
		rep.config().setReportName("Testing");
		rep.config().setDocumentTitle("Test Results");
		
		exRep = new ExtentReports();
		exRep.attachReporter(rep);
		exRep.setSystemInfo("QA", "Ankit Choudhary");
		
		return exRep;
		
	}

}
