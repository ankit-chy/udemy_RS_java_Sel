package com.sec_15_Selenium_4_features;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invokingMultipleTabWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		
		driver.get("https://rahulshettyacademy.com");
		
		String txt = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		driver.switchTo().window(parentWindow);
		
		WebElement searchEle =driver.findElement(By.cssSelector("[name='name']"));
		searchEle.sendKeys(txt);
		
		File file =searchEle.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("/Users/ankitchoudhary/eclipse-workspace/UdemyRS/src/screenshots_1/ss.png"));
	
		//GEt Height & Width

		System.out.println(searchEle.getRect().getDimension().getHeight());

		System.out.println(searchEle.getRect().getDimension().getWidth());
	}

}
