package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderbasic2 {
@Test (dataProvider="login")	
				public void receiver (String username,String password) throws InterruptedException{
					// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://demowebshop.tricentis.com/");
				driver.get("https://demowebshop.tricentis.com/login");
				driver.findElement(By.cssSelector("a[class='ico-login']")).click();
				driver.findElement(By.id("Email")).sendKeys(username);
				driver.findElement(By.id("Password")).sendKeys(password);
				driver.findElement(By.id("Remember  me")).click()
				driver.findElement(By.cssSelector("input[class='value-Log in']")).click();
				Thread.sleep(2000);
				driver.close();
				}
			@DataProvider(name="login")
			public Object[][]sender(String username, String password){
			return DataProviderUtility.dwsLgin();	
			

	}

}
