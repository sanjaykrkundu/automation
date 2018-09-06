package automation.irequest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "emailAddressGhost")
	WebElement ghostEmail;
	@FindBy(id = "emailAddress")
	WebElement email;
	@FindBy(name = "pass_temp")
	WebElement ghostPass;
	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id = "signIn")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void login(String email, String pass) {
		ghostEmail.clear();
		this.email.sendKeys(email);
		ghostPass.clear();
		this.pass.sendKeys(pass);
		loginBtn.click();
	}

}
