package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Clickcomputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ChromeDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://demowebshop.tricentis.com/");
         WebElement given_Button=driver.findElement(By.xpath("//a[text()='Computers']"));
         if(given_Button.isDisplayed())	{
	
            given_Button.click();
         }
	}
}
