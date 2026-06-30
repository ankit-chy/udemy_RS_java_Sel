//package extentReports;
//import utilities.*;
//import java.io.File;
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class reportsForTraining {
//	
//
//
//	@Test
//	public void initialSetUp() {
//		
//		ExtentTest test =exRep.createTest("Initial SetUp");
//		WebDriverManager.chromedriver().setup();
//
//		// Initialize the WebDriver with ChromeDriver
//		WebDriver driver = new ChromeDriver();
//
//		// At least will wait for 5 seconds whenever required
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		// Navigate to the page
//		driver.get("https://rahulshettyacademy.com/locatorspractice");
//
//		//test.addScreenCaptureFromBase64String(null);
//	    driver.quit();
//	}
//
//}
