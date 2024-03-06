package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class OpenFood {

	public static void main(String[] args) throws InterruptedException {	
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("file:///C:/Users/admin/Downloads/openfood.html");
				String parent_page = driver.getWindowHandle();
			WebElement action_btn =	driver.findElement(By.xpath("//input[@value='Open Food Sites']"));
			Actions act = new Actions(driver);
			if(action_btn.isEnabled()) {
			System.out.println("The btn is enables");
			act.moveToElement(action_btn).click().build().perform();
			Thread.sleep(3000);
			Set<String> allPopUps = driver.getWindowHandles();
			for (String str : allPopUps)
				if(parent_page.equalsIgnoreCase(str)) {
			
			}
			
				else
				{
			
				driver.switchTo().window(str);
				driver.close();
	            }
			}
	
	 else
	 {
		System.out.println("the btn is not enabled");
	}
}
}
