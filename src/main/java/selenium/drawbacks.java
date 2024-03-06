package selenium;

    public class drawbacks {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DrawBackofCssSelector {

		public static void main(String[] args) {                       

			WebDriver driver = new ChromeDriver();
			driver.manage().window() .maximize();
			driver.navigate().to("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();

		}

	}


}
