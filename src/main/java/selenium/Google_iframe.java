package selenium;



	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;


	public class Google_iframe {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("file:///C:/Users/admin/Downloads/2automation.html");
			WebElement google = driver.findElement(By.xpath("//a[text()=\"Google\"]"));
				if(google.isDisplayed()) {
						System.out.println("verified");
						google.click();
					}
		
			else System.out.println("its not verified");
		    driver.navigate().back();
		    driver.switchTo().frame("FR1");
		    driver.findElement(By.id("small-searchterms")).sendKeys("ocean");
		    driver.switchTo().parentFrame();
		    driver.findElement(By.xpath("//a[text()=\"Google\"]")).click();
		    Thread.sleep(2000);
		    driver.navigate().back();
		}
	}
		    		



				
			




		

		

	



