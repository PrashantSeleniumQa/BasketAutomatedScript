package example_test;

import java.util.List;

import org.eclipse.jetty.io.QuietException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.ExplicitGroup;

public class ValidationMethods {

	
	public static WebDriver driver;
	@Test
	public void GetAllRadioButton()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		//System.exit(0);
		driver.get("https://google.com");
		WebElement sel = driver.findElement(By.xpath(".//input[@value='Google Search']"));
		List<WebElement> sel1 = driver.findElements(By.xpath(".//input[@value='Google Search']"));
		sel.findElement(By.tagName("a"));
	
		Assert.assertEquals(sel.isDisplayed(), true, "test");
//		Select s = new Select(sel);
//		s.getFirstSelectedOption();
	}
	
	
	
}
