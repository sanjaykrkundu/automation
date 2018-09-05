package automation.testcase.sanity;

import org.testng.annotations.Test;

import automation.testcase.BaseTest;

public class TestClass extends BaseTest {

	@Test
	private void login() {
		System.out.println("login");
		driver.get("google.com");
	}

	
	
	@Test
	private void logout() {
		System.out.println("logout");
	}
	
}
