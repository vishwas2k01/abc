package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement; 

public class Bookpage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ChromeDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://demowebshop.tricentis.com/");
         WebElement given_Button=driver.findElement(By.xpath("//a[Contains(text()'Books')]"));
         if(given_Button.isDisplayed())	{
        	 System.out.println("Book is verified");
             given_Button.click();
         }
	}
}

