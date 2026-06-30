package com.sec8_9.FT.Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentWaitTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		
		WebElement fo = w.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				WebElement el = driver.findElement(By.xpath("//div[@id='finish']/h4"));
				if(el.isDisplayed()) {
				return el;
				}
				else  
					return null;
			}
		});
		System.out.print("Is Displayed : "  + driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed());
		
		System.out.print("Is Displayed : "  + driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
	}
	

}
