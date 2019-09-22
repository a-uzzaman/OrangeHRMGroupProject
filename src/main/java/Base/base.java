package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class base {

	public WebDriver driver;

@Parameters("os")
	@BeforeSuite
	public void beforeSuite(String os){

		switch(os) {
		case "windows":

			System.out.println("*** TEST SUITE STARTED ");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");



			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		case "mac":

			System.out.println("*** TEST SUITE STARTED ");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver");



			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		}
	}

	@AfterTest
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		driver.quit();


	}

	@Test
	public void testing() {
		driver.get("https:\\www.facebook.com");
	}




}


