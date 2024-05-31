package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSoft1 {
	@Test

	
	public void assertMethods() {
		String expected_result="https://demowebshop.tricentis.com/";
		String a="abhya";
		String b=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert ass=new SoftAssert();
		String actual_result=driver.getCurrentUrl();
		boolean result = expected_result.equals(actual_result);
		ass.assertTrue(result);
		driver.findElement(By.id("small-searchterms")).sendKeys("abhya");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}
