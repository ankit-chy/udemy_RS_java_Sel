package com.sec_10_Ajax_iFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		
//		driver.findElement(By.cssSelector("a.blinkingText")).click();
//
//		Set<String> windows= driver.getWindowHandles();
//		Iterator<String>  it = windows.iterator();
//		String parentWindow = it.next();
//		String childWindow = it.next();
//		driver.switchTo().window(childWindow);
//		
//		String emailTxt = driver.findElement(By.cssSelector("p.red")).getText();
//		String [] txtArr = emailTxt.split("at");
//		
//		String actTxt = txtArr[1].trim();
//		
//		String[] mailTxtArr = actTxt.split("with");
//		System.out.println(mailTxtArr[0]);
//		
//		driver.switchTo().window(parentWindow);
//		driver.findElement(By.id("username")).sendKeys(mailTxtArr[0]);


		
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//div[@class='example']/a")).click();
		
		Set<String> windows= driver.getWindowHandles();
		Iterator<String>  it = windows.iterator();
		String parentWindow = it.next();
		String firstchildWindow = it.next();
		
		driver.switchTo().window(firstchildWindow);
		
		String childPageTxt = driver.findElement(By.tagName("h3")).getText();
		
		System.out.println(childPageTxt);
		
		driver.switchTo().window(parentWindow);
		String parenWindowTxt = driver.findElement(By.tagName("h3")).getText();
		
		System.out.println(parenWindowTxt);
		
		
		
		
	}

}
