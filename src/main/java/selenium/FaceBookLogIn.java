package selenium;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FaceBookLogIn  {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement create_account = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		if(create_account.isDisplayed()) {
			System.out.println("create account button is displayed");
			create_account.click();
			WebElement first_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
			first_name.sendKeys("vishwas");
		}
		else {
			System.out.println("create button is not displayed");
		
		}
	}

	
		// TODO Auto-generated method stub
		
}


	