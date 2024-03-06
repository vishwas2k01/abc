package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Shopperstack {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   
			String GivenUrl="https://www.shoppersstack.com/";
			driver.get("https://www.shoppersstack.com/");
			
			String Current_Url=driver.getCurrentUrl();
			if(GivenUrl.equalsIgnoreCase(Current_Url)) {
				System.out.println("correct url");
				Thread.sleep(15000);
			WebElement login_button = driver.findElement(By.xpath("//button[@id='loginBtn']"));
			login_button.click(

					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					