package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launchthebrowser1 {
@Test
	public void bhosda() {
		// TODO Auto-generated method stub
	    WebDriver dr = new ChromeDriver();
	    dr.manage().window().maximize();
	    
	    dr.get("https://www.nike.com/in/");
	    
	    dr.close();
	    

	}
@Test
	
	public void bhosdaofkaran() {
		// TODO Auto-generated method stub
	    WebDriver dr = new ChromeDriver();
	    dr.manage().window().maximize();
	    
	    dr.get("https://dotmovies.bar/");
	    
	    dr.close();
	    

	}
	@Test
	
	public void karanbhosda() {
		// TODO Auto-generated method stub
	    WebDriver dr = new ChromeDriver();
	    dr.manage().window().maximize();
	    
	    dr.get("https://moviesmod.info/");
	    
	    dr.close();
	    

	}

}
