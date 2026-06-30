import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class cwhTextExtractor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.codewithharry.com/courses/complete-python-bootcamp-learn-python-from-scratch");

            // Wait for the lesson divs to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            List<WebElement> sections = driver.findElements(By.xpath("//html/body/div[3]/main/div/div[2]/div[2]/div[3]/div"));

            System.out.println("Total sections found " + sections.size());
            
            for (WebElement section : sections) {
                section.click();
                String text = section.getText(); // full block
                String[] lines = text.split("\\r?\\n");

                if (lines.length >= 2) {
                    String sectionName = lines[0];
                    String[] parts = lines[1].split("•");
                    
                    if (parts.length == 2) {
                        String lectureCount = parts[0].trim(); // "4 lectures"
                        String duration = parts[1].trim();     // "24min"

                        System.out.println("Name: " + sectionName);
                        System.out.println("Lectures: " + lectureCount);
                        System.out.println("Duration: " + duration);
                        System.out.println();
                        
                        System.out.println("********----------**********");
                        List<WebElement> lessons = driver.findElements(By.xpath("//span[@class='flex-grow text-sm text-foreground dark:text-foreground']"));

                        //System.out.println("Total lessons found " + lessons.size());

                        for (WebElement lesson : lessons) {
                        	System.out.println(lesson.getText());
                        }
                        System.out.println("********----------**********");
                        driver.findElement(By.xpath("//span[contains(text(),'" + sectionName + "')]"));
                    }
                }
            }
            
        

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
