package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHover  {

	public static void main(String[] args) {
		//open the browser
        WebDriver driver=new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
       //enter into Myntra webpage
        driver.navigate().to("https://www.myntra.com/");
        WebElement kids = driver.findElement(By.xpath("//a[text()='Women']"));
        new Actions(driver).moveToElement(kids).build().perform();
        driver.findElement(By.xpath(["data-reactid=\"194\"]).click();
	}

}
