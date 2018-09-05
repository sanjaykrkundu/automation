package automation.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	
	@BeforeMethod
	public void doBeforeMethod() {
		System.out.println("testClass1: before method");
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void doAfterMethod() {
		System.out.println("testClass1: after method");
		driver.close();
	}
}
