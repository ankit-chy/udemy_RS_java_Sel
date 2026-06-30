package com.sec7.WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // Selenium will wait till page loads fully

		// drop down with select tag
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		updatedDropDown(driver, 3);

		dynamicDroopDown(driver, "Pune", "Bengaluru");

		calendarUi(driver);

		autoSuggestiveDropDown(driver);

		checkBoxes(driver);
		
		driver.findElement(By.xpath("//span[@class='btn-find-flight-home']/input[@value='Search']")).click();

		driver.close();

	}

	public static void updatedDropDown(WebDriver driver, int nAdults) throws InterruptedException {

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(1000);

		for (int i = 1; i < nAdults; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Assert.assertEquals("3 Adult", driver.findElement(By.id("divpaxinfo")).getText());
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

	public static void dynamicDroopDown(WebDriver driver, String fromCity, String toCity) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// xpath for pune --> //a[@value="PNQ"]
		// xpath for Bengaluru --> //a[@value="BLR"]

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

//		driver.findElement(By.xpath("//a[@value='PNQ']")).click(); // from pnq
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click(); //to pnq

		// parent child relationship x path
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='PNQ']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']"))
				.click();

	}

	public static void autoSuggestiveDropDown(WebDriver driver) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				System.out.println(option.getText() + " is selected");
				break;
			}
		}

	}

	public static void checkBoxes(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		System.out.println("Is checkox selected Before : "
				+ driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		System.out.println("Is checkox selected After : "
				+ driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());

		// count the number of check boxes on the page

		System.out.println("There are " + driver.findElements(By.cssSelector("input[type='checkbox']")).size()
				+ " checkboxes present on the page");

	}

	public static void calendarUi(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		System.out.println("Return Date is Enabled : " + driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); // Should be false
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		System.out.println("Return Date is Enabled : " + driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); // Should be true

		// basically on UI it's opacity is changing hence it's true both time.

		// work around
		System.out.println("Style Attribute Before : " + driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // clicking on return btn
		System.out.println("Style Attribute After : " + driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// .ui-state-default.ui-state-highlight

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

	}

}
