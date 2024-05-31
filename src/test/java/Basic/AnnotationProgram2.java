package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationProgram2 {
	WebDriver driver;
		@BeforeSuite
		public void beforeSuite1() {
			System.out.println("connecting to the database");
			// TODO Auto-generated method stub
		}
	@BeforeTest
	public void beforeTest() {
		System.out.println("prediction for the test runnner");
	}
	@BeforeClass
	public void beforeClass() {
		//openn the browser
		driver= new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//enter into dws page
		driver.get("https://demowebshop.tricentis.com/");
	   
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@Test
	public void testCase1() {
		System.out.println("testCase1");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("afterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");


	}

}
