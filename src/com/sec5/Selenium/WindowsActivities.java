package com.sec5.Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium Manager is package now
		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://google.com");  // Selenium will wait till page loads fully
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); 	// Selenium will not wait till page loads fully
		
		driver.navigate().back();
		driver.navigate().forward();

	}

}
