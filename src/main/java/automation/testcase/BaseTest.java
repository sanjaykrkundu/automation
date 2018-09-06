package automation.testcase;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Date;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import automation.framework.util.DriverSelector;
import automation.framework.util.Resources;

public class BaseTest {

	@BeforeSuite
	private void beforeSuite() {
		System.setProperty("webdriver.gecko.driver",
				Resources.getResourceFile("driver" + File.separator + "geckodriver.exe").getAbsolutePath());
		System.setProperty("webdriver.chrome.driver",
				Resources.getResourceFile("driver" + File.separator + "chromedriver.exe").getAbsolutePath());
	}

	@DataProvider(name = "data")
	public Object[][] getDataFromDataprovider(Method method) {

		System.out.println(method.getName() + new Date());

		return new Object[][] { new Object[] { DriverSelector.getDriver(), Math.random() } };

	}

}
