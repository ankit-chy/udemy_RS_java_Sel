package com.sec5.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();

		//At least will wait for 5 seconds whenever required 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Navigate to the page
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Ankit");
		driver.findElement(By.name("inputPassword")).sendKeys("123456");
		driver.findElement(By.className("signInBtn")).click();
		
		String errorMsg = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errorMsg);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ankit");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("something@eaxmple.com");
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();		// nth child (index) using css selector last preference
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("something@eaxmple.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");			//parenttagname childname
		
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		String passTxt = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(passTxt);
		
		
		driver.findElement(By.xpath("//button[contains(@class,'login-btn')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Ankit");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");  // by using partial text regular expression in css 
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();   // --> regular expression x path
		
		
		
		
		//driver.close();

	}

}
