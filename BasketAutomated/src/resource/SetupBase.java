package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SetupBase {

	public static WebDriver driver;
	 public Properties prop = new Properties();
	
	public WebDriver InitializeDriver() throws IOException
	{
		
		FileInputStream f = null;
		try {
			f = new FileInputStream("C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\src\\resource\\datadriven.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop.load(f);
		
		if (prop.getProperty("browser").contains("fireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (prop.getProperty("browser").contains("chrome")) {
			
			WebDriver driver = new ChromeDriver();
			
		}
		
		else {
			
			WebDriver driver = new InternetExplorerDriver();
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
	
	public void CloseBrowser() 
	{
		driver.close();
	}


	
}
