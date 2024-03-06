package selenium;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Omayo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://omayo.blogspot.com/");
        Actions act = new Actions(driver);
        act.keyDown(Keys.PAGE_DOWN).build().perform();
        act.keyDown(Keys.PAGE_DOWN).build().perform();
        act.keyDown(Keys.PAGE_DOWN).build().perform();
        act.keyDown(Keys.PAGE_DOWN).build().perform();
        act.keyUp(Keys.PAGE_UP).build().perform();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(30));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
        button.click();
        Alert ref = driver.switchTo().alert();
        ref.accept();
        WebElement Drop = wait.until(ExpectedConditions.elementToBeClickable(By.className("dropbtn")));
        Drop.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']"))).click();
        button.click();
        driver.findElement(By.id("container")).click();
        		
        
	}
        
        
        
        
	}


