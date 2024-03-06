package assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions;

public class openThreelementInNewWindow {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/computers");
Actions act=new Actions(driver);
List<WebElement> Size =  driver.findElements(By.xpath("//ul[@class='top-menu']/li"));

for (WebElement a : Size) {
	act.keyDown(Keys.CONTROL).moveToElement(a).click().build().perform();
	Thread.sleep(1000);
	
}



	}

}
