package automation.framework.bo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicWebElement {

	String prefix;
	String suffix;

	public DynamicWebElement(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public WebElement getElement(WebDriver driver, String val) {
		return driver.findElement(By.xpath(prefix + val + suffix));
	}
}
