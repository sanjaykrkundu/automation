package automation;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import automation.framework.util.ActionBot;
import automation.framework.util.DriverSelector;
import automation.framework.util.Resources;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				Resources.getResourceFile("driver" + File.separator + "geckodriver.exe").getAbsolutePath());
		System.setProperty("webdriver.chrome.driver",
				Resources.getResourceFile("driver" + File.separator + "chromedriver.exe").getAbsolutePath());

		WebDriver driver = DriverSelector.getDriver();

		// new LoginPage(driver).login("asdasdas", "alsdja");

		ActionBot.waitForLoad(driver, "http://www.google.com");
		Actions actions = new Actions(driver);
		
		Thread.sleep(20000);
		System.out.println("finish");
		driver.quit();
	}

}
