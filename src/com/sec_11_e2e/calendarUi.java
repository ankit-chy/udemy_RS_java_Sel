package com.sec_11_e2e;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendarUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String monthNumber ="5";
		String date = "26";
		String year = "2025";
		
		String [] expectedList = {monthNumber,date,year};	
		
		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[text()='" + year +"']")).click();
		
		
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber) - 1).click();
		
		
		driver.findElement(By.xpath("//abbr[text()='" + date +"']")).click();
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0; i<actualList.size(); i++) {
			System.out.println(actualList.get(i).getAttribute("value"));
			
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
		}
		
			driver.close();
	}

}
