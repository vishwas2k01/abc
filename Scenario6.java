package Project;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class Scenario6 {


		public static void precondition1() {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
	        
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	        System.out.println("Link count is " + allLinks.size());
	        
	        for(WebElement link : allLinks) {
	            String url = link.getAttribute("href");
	            String title = link.getText().trim();
	            
	            System.out.println("URL: " + url);
	            System.out.println("Title: " + title);
	        }


	}

}
