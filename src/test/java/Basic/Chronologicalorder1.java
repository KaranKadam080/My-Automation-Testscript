package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;       
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chronologicalorder1 {
@BeforeSuite
	public void beforeSuite1() {
		System.out.println("beforeSuite1");
		// TODO Auto-generated method stub
	}
@BeforeTest
public void beforeTest() {
	System.out.println("beforeTest");
}
@BeforeClass
public void beforeClass() {
	System.out.println("beforeClass");
}

public void beforeSuite() {
	System.out.println("beforeSuite");
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
