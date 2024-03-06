package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
  public static WebDriver driver;
public static void chrome(){
   driver=new ChromeDriver();
   driver.manage().window().maximize();
}
public static void edge(){
	 driver=new EdgeDriver();
}
 public static void firefox(){
     driver=new FirefoxDriver();
}
 public static void iE(){
	   driver=new InternetExplorerDriver();
 }
}
	  
