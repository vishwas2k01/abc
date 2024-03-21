package Project;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		  List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	        System.out.println("Link count is " + allLinks.size());
	        
	        Actions actions = new Actions(driver);
	        
	        for(WebElement link : allLinks) {
	            actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
	            
	        }

	}

}
