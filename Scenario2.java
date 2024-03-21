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




public class Scenario2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
        String dws_handle = driver.getWindowHandle();
    	System.out.println(dws_handle);
    	List<WebElement> products = driver.findElements(By.xpath("//section[normalize-space()='Link']"));
    	Actions act=new Actions(driver);
    	for (WebElement web : products) {
    		act.keyDown(Keys.CONTROL).click(web).build().perform();
    	}
    	Set<String> Multiple_window = driver.getWindowHandles();
    	System.out.println(Multiple_window);
    }
    }

