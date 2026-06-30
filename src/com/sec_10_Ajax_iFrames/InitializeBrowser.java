package com.sec_10_Ajax_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeBrowser {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
	
			// Initialize the WebDriver with ChromeDriver
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	
	//		driver.get("https://jqueryui.com/droppable/");
	//		
	//		WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	//		driver.switchTo().frame(ele);		// by web element of that particular iFrame
	//		
	//		//driver.switchTo().frame(0);  		// by index 0 indexing
	//		WebElement source = driver.findElement(By.id("draggable"));
	//		WebElement target = driver.findElement(By.id("droppable"));
	//		
	//		Actions a = new Actions(driver);
	//		a.dragAndDrop(source, target).build().perform();
	//		
	//		
			
//			// Assignment 
//			driver.get("https://the-internet.herokuapp.com/");
//			
//			driver.findElement(By.linkText("Nested Frames")).click();
//	
//	
//			driver.switchTo().frame("frame-top");
//	
//	
//	
//			driver.switchTo().frame("frame-middle");
//	
//	
//	
//			System.out.println(driver.findElement(By.id("content")).getText());
		}

	public InitializeBrowser() {
		super();
	}

}