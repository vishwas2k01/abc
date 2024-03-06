package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class EaseMyTrip {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ch_options=new ChromeOptions();
		ch_options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ch_options);
		driver.manage().window().maximize();
		driver.navigate().to("https://easemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("dvfarecal")).click();
		driver.findElement(By.id("fiv_0_25/02/2024")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("divRtnCal")).click();
		
		Thread.sleep(3000);
		
		for(;;) {
		
		try {
			driver.findElement(By.id("frth_6_25/05/2024")).click();
			System.out.println("my script is successfull.........");
			break;
		} catch (Exception e) {
			driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("srchBtnSe")).click();
			
		}
		}
	}
}
		

	


