package com.sec_14_javaStreams;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class webTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// 1. Check if the column ge sorted on clicking the column header
		// click on column
		// capture all webelement into list
		// capture text of all webelements into new list (original)
		// sort the list --> Sorted list is a new list
		// compare original vs new

		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all web element into list
		//List<WebElement> ele = driver.findElements(By.xpath("//tr/td[1]"));

		// capture text of all webelements into new list (original)
//		List<String> originalList = ele.stream().map(s->s.getText()).collect(Collectors.toList());
//		
//		// sort the list --> Sorted list is a new list
//		List<String> sortedList =originalList.stream().sorted().collect(Collectors.toList());
//		System.out.println("Before assert");
//		// compare original vs new 
//		Assert.assertEquals(originalList, sortedList,"Lists are sorted");
//		System.out.println("After assert");
//		//2. Get the price of rice
		List<String> price;

		do {
			List<WebElement> ele = driver.findElements(By.xpath("//tr/td[1]"));
			price = ele.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			price.forEach(a -> System.out.println(a));

			if (price.size() < 1) {

				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}

		} while (price.size() < 1);
		
		
		WebElement searchEle =driver.findElement(By.id("search-field"));
		
		System.out.println("Get Text is : " +  driver.findElement(with(By.tagName("label")).above(searchEle)).getText());

		relativeLocators(driver);
	}

	public static String getPriceVeggie(WebElement s) {
		String priceTxt = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		System.out.println("in get price " + priceTxt);
		return priceTxt;

	}
	
	public static void relativeLocators(WebDriver driver) {
		
		
		System.out.println("In the relaive locatrs");
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");



		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));



		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));

		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();

		WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();



		WebElement rdb = driver.findElement(By.id("inlineRadio1"));



		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());








	}

}
