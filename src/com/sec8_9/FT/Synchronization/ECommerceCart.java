package com.sec8_9.FT.Synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ECommerceCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// At least will wait for 5 seconds whenever required
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] desiredProducts = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		addToCart(driver, desiredProducts);
		proceedToCheckOut(driver);
		
		driver.close();
	}

	public static void addToCart(WebDriver driver, String[] desiredProducts) {
		// get all products iterate through it and get index of the desired products and
		// then click add to cart for that index

		// Step 1 --> Expected Products Array

		// Step 2 --> Getting products from page
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

		// driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		// --> Can use this xpath as well cause the text on page changes for few second.

		int index = 0;
		int breakCount = 0;
		// Step 3 -->
		for (WebElement product : products) {

			String[] nameVeggie = product.getText().split(" "); // formatting the product name Cucumber -1Kg to cucumber
																// hence can easily compare in array list
//					String formatteddname = nameVeggie[0].trim();

			// Converting array to arryayList
			List<String> itemsNeededList = Arrays.asList(desiredProducts);

			if (itemsNeededList.contains(nameVeggie[0])) {
				addToCartButtons.get(index).click();
				System.out.println(nameVeggie[0] + " Added to Cart");
				breakCount++;

				if (breakCount == desiredProducts.length) {
					break;
				}

			}
			index++;
		}

	}
	
	public static void proceedToCheckOut(WebDriver driver) throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
	Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		String actualTxt = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		String expectedTxt = "Code applied ..!";
		
		Assert.assertEquals(actualTxt, expectedTxt);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
	}


}