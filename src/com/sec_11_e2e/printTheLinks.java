package com.sec_11_e2e;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printTheLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 5, 555, 3, 4 };

		int index = array[5];

		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1. Get all links on the page
		System.out.println("Links on the entire page : " + driver.findElements(By.tagName("a")).size());

		// 2. Get all links in the footer section , limiting scope of driver from global
		// to the specific section footer only
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(
				"In footer section there are " + footerDriver.findElements(By.tagName("a")).size() + " links present");

		// 3. Get all links in specific column of the Footer section
		WebElement firstColumnDriver = footerDriver.findElement(By.xpath("(//div[@id='gf-BIG']//tr/td/ul)[1]"));

		int linksCount = firstColumnDriver.findElements(By.tagName("a")).size();

		System.out.println("First Column links count : " + linksCount);

		// 4. Click and check if links are working in the first column

		for (int i = 0; i < linksCount; i++) {
			// System.out.println("Successfully clicked : " +
			// firstColumnDriver.findElements(By.tagName("a")).get(i));

			// Actions a = new Actions((WebDriver) firstColumnDriver);

			String clickOnLinks = Keys.chord(Keys.COMMAND, Keys.ENTER);

			firstColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);

		}

		Thread.sleep(5);
		
		// 5. Get all windows title

		Set<String> childWindows = driver.getWindowHandles();

		Iterator<String> it = childWindows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println("Title : " + driver.getTitle());
		}

	}

}
