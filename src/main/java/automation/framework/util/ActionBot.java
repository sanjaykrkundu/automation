package automation.framework.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActionBot {

	public static void waitForLoad(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoadCondition = (WebDriver wd) -> ((JavascriptExecutor) wd)
				.executeScript("return document.readyState").equals("complete");
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(pageLoadCondition);
			System.out.println("page load completed");
		} catch (Exception e) {
			Assert.fail("PageLoading Failed Due To Timeout.");
		}
	}

	public static void waitForLoad(WebDriver driver, String url) {
		driver.get(url);
		waitForLoad(driver);
	}

}
