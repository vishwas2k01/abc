package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;


public class demo_qspiders {
     public static void main(String[] args) {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	 driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
    	 driver.findElement(By.xpath("//section[text()='Frames']")).click();
    	 driver.findElement(By.xpath("//section[text()='iframes']")).click();
    	 driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
         driver.switchTo().frame(0);
         driver.switchTo()
         driver.findElement(By.id(null))
     }
}
