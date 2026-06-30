package com.sec5.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators_two {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String password = getPassword(driver);

		// Navigate to the page
		driver.get("https://rahulshettyacademy.com/locatorspractice");

		String name = "Ankit";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);

		String actualMsg = driver.findElement(By.tagName("p")).getText();
		System.out.println(actualMsg);

		Assert.assertEquals(actualMsg, "You are successfully logged in.");

		String txtMsg = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		System.out.println(txtMsg);

		String actualTxt = "Hello " + name + ",";
		Assert.assertEquals(actualTxt, txtMsg);

		driver.findElement(By.xpath("//button[text()='Log Out']")).click();

		driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		Thread.sleep(1000);

		driver.findElement(By.linkText("Forgot your password?")).click();

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ankit");

		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("something@eaxmple.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210"); // parent tag  name child name
		Thread.sleep(1000);

		driver.findElement(By.className("reset-pwd-btn")).click();

		String passTxt = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(passTxt);
		// Please use temporary password 'rahulshettyacademy' to Login.

		String[] passWord = passTxt.split("'");
		// Array 0th Index :- Please use temporary password
		// Array 1st Index :- rahulshettyacademy' to Login.

		String passWordtxtt = passWord[1].split("'")[0];
		// New Array 0th Index :- rahulshettyacademy
		// New Array 1st Index :- to Login.

		return passWordtxtt;

	}
}
