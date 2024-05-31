package HelperMethodTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod1 {
	@Test(priority =3)

	public void CreateAccount() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.royalchallengers.com/");
	System.out.println("Account Is Created");
	}
@Test (priority=0,dependsOnMethods="createAccount")
public void ModifyAccount() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println("Account Has Been Modified");
	}
@Test (priority=2)
public void DeleteAccount() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.chennaisuperkings.com/");
	System.out.println("Account Is Deleted");
	}


}
