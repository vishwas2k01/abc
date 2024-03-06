package assignment;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class StaleElementException {
public static void main (String[] args) throws InterruptedException{
	
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/digital-downloads");
		WebElement sort_by = driver.findElement(By.id("products-orderby"));
		Select ref=new Select(sort_by);
		Thread.sleep(2000);
		List<WebElement> sort = ref.getOptions();
        System.out.println(sort);
        int i = 0;
        for (WebElement web: sort) {
        	sort_by=driver.findElement(By.id("products_orderby"));
        	ref=new Select(sort_by);
        	ref.selectByIndex(i++);
        	Thread.sleep(2000);
        }
	}

}
