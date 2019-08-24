package Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LaunchBrowser {
	
	@BeforeSuite
	public void beforeSuite() {
		System.err.println(" ========== Connect to db ========== ");
	}
	

	@AfterSuite
	public void OpenBrowser() {
		System.err.println(" ========== close db ========== ");
	}
	

	@AfterClass
	public void close() {
		System.err.println("close Browser");
	}

}
