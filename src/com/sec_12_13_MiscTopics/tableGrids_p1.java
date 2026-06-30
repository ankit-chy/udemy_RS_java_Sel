package com.sec_12_13_MiscTopics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tableGrids_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  // Casting driver into Js executor and creating the object of it. JAVASCRIPT EXECUTOR IS A CLASS
		js.executeScript("window.scrollBy(0,400)");		// scrolling on window level

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");	// Scrolling on a specific component
		
		List <WebElement> values =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int actualSum = 0;
		
		for(int i =0; i<values.size();i++) {
			
			WebElement ele =values.get(i);
			int num =Integer.parseInt(ele.getText());
			
			actualSum = actualSum + num;
			
		}
		
		System.out.println("Total Sum is : " + actualSum);
		
		int expectedSum =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(actualSum, expectedSum);
		
		
		
		//assignment - 1
		
		List <WebElement> newWebTableRows =driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println("Total Rows : " + newWebTableRows.size());  					// Printing number of rows
		
		List <WebElement> newWebTableColumn =driver.findElements(By.cssSelector(".table-display tr th"));
		System.out.println("Total Rows : " + newWebTableColumn.size()); 
		
		System.out.println("2nd Row : " + newWebTableRows.get(1).getText() + " 2nd Column : " + newWebTableColumn.get(1).getText());
		
	}

}
