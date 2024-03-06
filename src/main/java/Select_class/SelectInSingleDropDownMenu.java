package Select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import selenium.BaseClass;

public class SelectInSingleDropDownMenu extends BaseClass{

	public static void main(String[] args) throws InterruptedException{
		//String[]str = {"0","1","2","3","4","5","6","7","8","9"};
		precondition1();
		driver.get("file:///C:/Users/admin/Desktop/demo.html");
		WebElement single_level = driver.findElement(By.id("standard_cars"));
		Select ref = new Select(single_level);
		//Thread.sleep(2000);
		//ref.selectByValue("lr");
		//Thread.sleep(3000);
		//ref.selectByIndex(2);
		//Thread.sleep(3000);
		//ref.selectByVisibleText("Ford");                           
		//Thread.sleep(2000);
		for(int i = 1 ; i<=11 ; i++) {
			ref.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		postconditionclose();
		

	}

	private static void postconditionclose() {
		// TODO Auto-generated method stub
		
	}

	private static void precondition1() {
		// TODO Auto-generated method stub
		
	}

}