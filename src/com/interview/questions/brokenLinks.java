package com.interview.questions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		// Initialize the WebDriver with ChromeDriver

		WebDriver driver = new ChromeDriver(options);

		options.addArguments("start-maximized");

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//  broken URL
		//  Java Methods will call URL's and get the Status Code if status code is greater than 400 it means URL is not working
		
//		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
//		HttpURLConnection conn =  (HttpURLConnection)new URL(url).openConnection();		
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int resCode = conn.getResponseCode();
//		System.out.print(resCode);
		
//		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//		HttpURLConnection conn =  (HttpURLConnection)new URL(url).openConnection();		
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int resCode = conn.getResponseCode();
//		System.out.print(resCode);
		
		
		//Step 1 --> Getting all URL's
		List<WebElement> allLinks = driver.findElements(By.cssSelector("li[class='gf-li'] a"));		
		
		SoftAssert a = new SoftAssert();
		for(WebElement link : allLinks) {
			
			String url = link.getAttribute("href");
			
			HttpURLConnection conn =  (HttpURLConnection)new URL(url).openConnection();		
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			System.out.println( link.getText() + " status code : " + resCode);
			a.assertTrue(resCode < 400, link.getText() + " is broken");
		
		}
		
		a.assertAll();

	}

}
