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

public class WebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://shomachaudhury.com/katrina-kaif-the-man-of-the-family/");
		org.openqa.selenium.WebElement katrina_kaif = driver.findElement(By.id("main"));
		File from = katrina_kaif.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\admin\\Desktop\\screenshot\\katrinakaif.png");
		FileHandler.copy(from, to);
	}


	}


