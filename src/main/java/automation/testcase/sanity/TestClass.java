package automation.testcase.sanity;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import automation.framework.util.URLSelector;
import automation.irequest.page.LoginPage;
import automation.testcase.BaseTest;

public class TestClass extends BaseTest {

	@Test(dataProvider = "data")
	private void login(WebDriver browser, double d) {
		System.out.println("login " + d);
		try {
			browser.get(URLSelector.getURL());
			new LoginPage(browser).login("raghavendra@tms.com", "Zycus@123");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			browser.quit();
		}

	}

	// @Test(dataProvider="data")
	private void logout(WebDriver browser, double d) {
		System.out.println("logout " + d);
		browser.quit();
	}

}
