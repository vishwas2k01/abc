package selenium;

    public class Firststartselenium{
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


		public static void main(String[] args) {
			
			String givenUrl="https://demowebshop.tricentis.com/";
			String givenTitle="Demo Web Shop";
			// Open the Browser
			
			// 1st way  ChromeDriver driver=new ChromeDriver();
			
		WebDriver driver= new ChromeDriver();
		// maxmize the browser
		driver.manage().window() .maximize();
		// Enter into the demoWebShop
		driver.get("https://demowebshop.tricentis.com/");
		
		
		// driver close
		
		
		//
	  // verify both url is same or not
//		String CurrentUrl=driver.getCurrentUrl();
		//	if(givenUrl.equalsIgnoreCase(CurrentUrl))
//			System.out.println("I am in Current web Page");
//		else
//			System.out.println(" I am not in current webpage");
		
		// ...........................................................
		
		String CurentTitle=driver.getTitle();
		if(givenTitle.equalsIgnoreCase(CurentTitle))
			System.out.println("Title is Same");
		
		else
			System.out.println("Title is not same");
		
		driver.close();	

		}

	

	