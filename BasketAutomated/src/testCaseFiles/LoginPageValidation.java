package testCaseFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import resource.SetupBase;

public class LoginPageValidation extends SetupBase {

	
	@Test(priority = 1)
	public void NavigateBaseUrl() throws IOException
	{
		
		driver = InitializeDriver();
		driver.get("https://google.com");
		
	}
	
	
	
}
