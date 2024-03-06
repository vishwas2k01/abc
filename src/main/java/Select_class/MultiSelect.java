package Select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Basic.BaseClass1;

public class MultiSelect extends BaseClass1 {
public static void main(String[] args) {
	preCondition();
	driver.get("file:///C:/Users/admin/Desktop/demo.html");
	WebElement multi_level = driver.findElement(By.id("multiple_cars"));
	Select ref = new Select(multi_level);
	if(ref.isMultiple() ) {
			List<WebElement> car_product = ref.getOptions();
			for(WebElement web : car_product) {
				web.click();			}
	}
}
else {
	System.out.println("")
		// TODO Auto-generated method stub

	}

}
