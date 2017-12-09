package testCaseFiles;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import pageObject.LoginPageObjects;
import resource.SetupBase;

public class LoginPageValidation extends SetupBase {

	
	@Test(priority = 1)
	public void NavigateBaseUrl() throws IOException
	{
		String PageTitle = "";
		driver = InitializeDriver();
		driver.get(prop.getProperty("url"));
		PageTitle = driver.getTitle();
		LoginPageObjects LPObject = new LoginPageObjects(driver);
		LPObject.userEmail().sendKeys(prop.getProperty("email"));
		LPObject.userPassword().sendKeys(prop.getProperty("password"));
		LPObject.submitBtn().click();
		if (PageTitle.equals(driver.getTitle()))
		{
			System.out.println("Title Same");
		}
		
		
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		//driver.close();
	}
	
	
	
}
