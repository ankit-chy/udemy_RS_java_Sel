package com.sec_12_13_MiscTopics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class takeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		
		// Initialize the WebDriver with ChromeDriver
		
		WebDriver driver = new ChromeDriver(options);
		
		options.addArguments("start-maximized");

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(src, new File("/Users/ankitchoudhary/eclipse-workspace/UdemyRS/src/screenshots_1//screenshots.png"));

	}

}
