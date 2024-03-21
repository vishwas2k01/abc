package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Scenario1 {
    WebDriver driver;

    @Test(priority = 1)
    public void dws() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");

        WebElement link = driver.findElement(By.xpath("//section[normalize-space()='Link']"));
        link.click();
        
     
    }


  
    
    }