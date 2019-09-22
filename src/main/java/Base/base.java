package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class base {

	public WebDriver driver;

	
	@BeforeTest
	public void beforeSuite(String browser){
		
		
		System.out.println("*** TEST SUITE STARTED ");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		


		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		}
		
	@AfterTest
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		driver.quit();
		

	}




}
	
}
