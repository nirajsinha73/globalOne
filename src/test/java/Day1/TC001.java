package Day1;

import org.testng.annotations.*;
import org.testng.Assert;

public class TC001 extends LaunchBrowser {

	@BeforeMethod
	public void beforeMethod() {
		System.err.println(" ====== Before method =====");
	}

	@AfterMethod
	public void afterMethod() {
		System.err.println(" ====== After method =====");
	}

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

		Assert.fail("Fail...");
	}

	@Test
	public void addAdd() {
		System.out.println("add Add");
	}

	@Test
	public void cod() {
		System.out.println("cod");
	}

}
