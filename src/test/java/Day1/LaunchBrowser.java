package Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LaunchBrowser {
	
	

	@BeforeClass
	public void OpenBrowser() {
		System.err.println("Open Browser");
	}
	

	@AfterClass
	public void close() {
		System.err.println("close Browser");
	}

}
