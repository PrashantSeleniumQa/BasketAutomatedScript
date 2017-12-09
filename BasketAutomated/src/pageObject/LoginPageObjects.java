package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//input[@id = 'txt_name']")
	WebElement userEmail;


	@FindBy(xpath=".//input[@id = 'password']")
	WebElement passeord;

	@FindBy(xpath=".//a[@id = 'login_submit']")
	WebElement btnLogin;

	@FindBy(xpath=".//input[@class = 'check_txtbx_chck remember']")
	WebElement chkRememberMe;

	@FindBy(xpath=".//div[@class='alert alert-danger']")
	WebElement ErrorMsg;



	public WebElement userEmail() {

		return userEmail;
	}

	public WebElement userPassword() {

		return passeord;
	}
	public WebElement submitBtn() {

		return btnLogin;
	}
}

