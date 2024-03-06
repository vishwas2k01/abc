package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedBus {

		public static void main(String[] args) throws InterruptedException {
			ChromeOptions ch_options=new ChromeOptions();
			ch_options.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(ch_options);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.redbus.in/");
			Thread.sleep(2000);
			driver.findElement(By.id("src")).sendKeys("Modinagar");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//text[text()='Modinagar']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("dest")).sendKeys("India Gate");
			Thread.sleep(2000);
			driver.findElement(By.className("dateText")).click();
			driver.findElement(By.xpath("//span[text()='25']")).click();			
	        Thread.sleep(2000);
	        driver.findElement(By.id("search_button")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[text()='next']")).click();
	        Thread.sleep(2000);
	}

}
