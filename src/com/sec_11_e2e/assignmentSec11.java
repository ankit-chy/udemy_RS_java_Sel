package com.sec_11_e2e;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignmentSec11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();

		// At least will wait for 5 seconds whenever required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> checkBoxes = driver.findElements(By.xpath("//fieldset//input[@type='checkbox']"));

		int randomIndex;
		String selectedCheckBox = null;
		// Ensure the list has 3 checkboxes
		if (checkBoxes.size() == 3) {
			// Generate a random number between 0 and 2 (since indices start from 0)
			Random random = new Random();
			randomIndex = random.nextInt(3);

			// Select the checkbox at the random index
			WebElement selectedCheckbox = checkBoxes.get(randomIndex);
			selectedCheckbox.click();

			// Print which checkbox was selected
			selectedCheckBox = selectedCheckbox.getAttribute("value");
			System.out.println("Selected checkbox: " + selectedCheckBox);
		} else {
			System.out.println("There are not exactly 3 checkboxes on the page.");
		}

		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));

		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue(selectedCheckBox);

		driver.findElement(By.name("enter-name")).sendKeys(selectedCheckBox);

		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(selectedCheckBox))

		{

			System.out.println("Alert message success");

		}

		else

			System.out.println("Something wrong with execution");

	}

}
