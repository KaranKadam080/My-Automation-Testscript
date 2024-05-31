package HelperMethodTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HelperMethod {
	
	@org.testng.annotations.Test( enabled = false)//(enabled=true)
	
	public void demo1() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
	}
	@org.testng.annotations.Test (priority= 1)
	
	public void demo2() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mumbaiindians.com/");
		driver.close();
	}
	@org.testng.annotations.Test (priority = 2, invocationCount = 2)
	
	public void demo3() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		driver.close();
	} 
	@org.testng.annotations.Test (priority = 0)
	
	public void demo() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		driver.close();
	}
}
