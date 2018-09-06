package automation.framework.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import automation.Application;

public class DriverSelector {

	public static WebDriver getDriver() {
		WebDriver driver;

		switch (Application.configuration.getBrowser()) {
		case CHROME:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--log-level=3", "--silent");
//			options.addArguments("--start-maximized");
//			options.addArguments("disable-infobars");
//			options.addArguments("--disable-notifications");
//			options.addArguments("--auto-open-devtools-for-tabs");
			driver = new ChromeDriver(options);
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}

		// driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(Application.configuration.getPageLoadTimeOut(),
		// TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(Application.configuration.getImplicitTimeOut(),
		// TimeUnit.SECONDS);
		// driver.manage().timeouts().setScriptTimeout(Application.configuration.getScriptTimeOut(),
		// TimeUnit.SECONDS);

		return driver;
	}

}
