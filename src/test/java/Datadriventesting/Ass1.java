package Datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new  ChromeDriver();
			
			//to maximize the window
			 driver.manage().window().maximize();
			
			//Launch the application
			 driver.get("https://demowebshop.tricentis.com/");
			 
			 //step1:downcast javscriptexecutor
			 JavascriptExecutor jse = (JavascriptExecutor) driver;
			 
			 //step2:call executeScript(String Script,object)
			 jse.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //complete scrolling from top to bottom
			driver.findElement(By.xpath("//li[class='facebook']")).click();

	}

}
