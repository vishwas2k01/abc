package Project;

	import java.time.Duration;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
	@Test
	public class Scenario4 { 
		public static void precondition1() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	   
		System.out.println("Link count is " + allLinks.size());
	    for(WebElement link : allLinks)
	    	System.out.println(link.getText());
	    driver.close();
	    driver.quit();
	    }
	    }
	


