package assignment;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ChildBrowser {
	public static void main (String []args) throws InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Fcebook")).click();
		Thread.sleep(2000);
	   String parent = driver.getWindowHandle();
	Set<String> Ecommerce_Link = driver.getWindowHandles();
	Ecommerce_Link.remove(parent);
	for (String str: Ecommerce_Link)
	{
	driver.switchTo().window(str);
	driver.findElement(By.id(":rp:")).sendKeys("danny");
		}
	}
	


}
