package com.sec_10_Ajax_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
			
		//Entering input in search bar in capital letters.
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(searchBar).click().keyDown(Keys.SHIFT).sendKeys("samsung").doubleClick().build().perform();
		
		WebElement accSign = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//Moves to specific element
		a.moveToElement(accSign).contextClick().build().perform();
		
		

	}

}
