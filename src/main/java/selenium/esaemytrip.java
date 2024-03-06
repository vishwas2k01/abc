package selenium;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class easemytrip {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
	
		org.openqa.selenium.WebElement easemy_trip= driver.findElement(By.id("rh_main"));
		File from = easemy_trip.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\admin\\Desktop\\screenshot\\easemy_trip.png");
		FileHandler.copy(from, to);
	





	}

}
