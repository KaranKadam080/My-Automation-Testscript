package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertEqual  {
	@Test
	public void hardAssert() {
		String expected_result="https://demowebshop.tricentis.com/";
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result =driver.getCurrentUrl();
		assertEquals(expected_result,actual_result);
		driver.findElement(By.id("small-searchterms")).sendKeys("abhya");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
	}
}
