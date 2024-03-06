package JavaScriptExecutor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HidenTextField {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement custom = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		js.executeScript("argunments[0].value='sedha namak';",custom);
		

	}

}
