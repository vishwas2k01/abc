package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Fbtest {

	public static void main(String[] args) 
	{
		
		String GivenUrl="https://www.facebook.com/";
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter to browser
		driver.navigate().to("https://www.facebook.com/");
		String CurrentUrl=driver.getCurrentUrl();
		if(GivenUrl.equalsIgnoreCase(CurrentUrl))
			System.out.println("I am  in current web page");
		else
			System.out.println("I am not in current web page");
		  WebElement element=driver.findElement(By.id("email"));
		  element.sendKeys("7055674770");
		  WebElement element1=driver.findElement(By.id("pass"));
		  element1.sendKeys("Tyagi@123");
		  //driver.findElement(By.xpath("//button[@name='login']")).click();
			

		  //TestFunction
		  driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
