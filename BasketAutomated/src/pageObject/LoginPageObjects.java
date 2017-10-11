package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	@FindBy(xpath=".//input[@id = 'firstName']")
	WebElement txtFirstName;

	
	@FindBy(xpath=".//input[@id = 'lastName']")
	WebElement txtLastName;
	
	@FindBy(xpath=".//input[@id = 'email']")
	WebElement email;
	
	@FindBy(xpath=".//input[@id = 'n_password']")
	WebElement password;
	
	@FindBy(xpath=".//button[@id = 'btn btn-blue log_btn']")
	WebElement btnSignUp;
	
	@FindBy(xpath=".//input[@class = 'check_txtbx_chck remember']")
	WebElement chkRememberMe;
	
}
