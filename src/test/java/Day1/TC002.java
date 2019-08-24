package Day1;

import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002 extends LaunchBrowser {
 
	

	
	@Test
	public void url() {
		System.out.println("open url");
	}
	
	@Test
	public void search() {
		System.out.println("search");
	}
	
	
	@Test
	public void login() {
		System.out.println("login");
	}
	
	
	@Test
	public void addCart() {
		System.out.println("add cart");
	}
	 
	
	
	@Test
	public void addAdd() {
		System.out.println("add Add");
	}
	
	
	@Test
	public void cod() {
		System.out.println("cod");
		
		throw new SkipException("SKip...");
	}
 
	
 
	 
	
}
