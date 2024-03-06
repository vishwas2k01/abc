package assignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBTask1 {
	static Select click;
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/r.php?locale=en_GB");

driver.findElement(By.xpath("//input[@name='firstname'][1]")).sendKeys("Vishwas Kumar");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tyagi");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("vishwastyagi123@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("vishwastyagi123@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8449337878");
Thread.sleep(1000);
WebElement st=driver.findElement(By.xpath("//select[@name='birthday_day']"));
//Select click=new Select(st);
 click=new Select(st);
Thread.sleep(2000);
List<WebElement> birthdate=click.getOptions();
for(WebElement b:birthdate) {
	b.click();
}
	Thread.sleep(2000);
	
WebElement mt=driver.findElement(By.xpath("//select[@name='birthday_month']"));
click = new Select(mt);
List<WebElement> month=click.getOptions();
for(WebElement m: month) {
	m.click();

}
Thread.sleep(2000);
WebElement yt=driver.findElement(By.cssSelector("select#year"));
click=new Select(yt);
List<WebElement> year=click.getOptions();
for(WebElement y: year) {
	y.click();
}
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
driver.close();


	}
}
