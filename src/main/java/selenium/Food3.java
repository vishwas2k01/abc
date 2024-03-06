package selenium;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Food3 {

	public static void main(String[] args) throws InterruptedException {
		String olive = "https://www.olivegarden.com/home";
		WebDriver driver = new ChromeDriver();
		String given_Url = "file:///C:/Users/admin/Downloads/openfood.html";
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/admin/Downloads/openfood.html");
		String parent = driver.getWindowHandle();
		WebElement Food = driver.findElement(By.xpath("//input@type='button']"));
		Actions a = new Actions(driver);
		a.moveToElement(Food).click().build().perform();
		Thread.sleep(3000);
		Set<String> popups = driver.getWindowHandles();
			Thread.sleep(3000);
			for(String string : popups) {
				driver.switchTo().window(str);
		String current = driver.		
				driver.getCurrentUrl();
				
				
			}
			
			}
		
	

}
