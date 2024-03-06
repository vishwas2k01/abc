package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.facebook.com/");
    WebElement given_button=driver.findElement(By.xpath("//a[text()='Create new account']"));
	if(given_button.isDisplayed()) {
		System.out.println("i am Facebook");
		given_button.click();
		
		
	}
	else 
		System.out.println("i am not in facebook page...... ");
}


}
