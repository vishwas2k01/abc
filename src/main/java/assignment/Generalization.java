package assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import graphql.relay.Edge;

public class Generalization {
	public class Baseclass2 {

	}



	static WebDriver driver;
	public static void PreCondition1() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void PreCondition2() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	public static void PreCondition3() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public static void PreCondition4() {
		driver=new SafariDriver();
		driver.manage().window().maximize();
	}
	public static void PreCondition5() {
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
	public static void PreConditionClose6() {
		driver.close();
	}
	
	
	
	public static void main(String[] args)  {


	}

}