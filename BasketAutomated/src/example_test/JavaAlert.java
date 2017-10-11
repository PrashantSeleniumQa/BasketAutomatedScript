package example_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaAlert {

	public static WebDriver driver;
	@Test
	public void GetAllRadioButton()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath(".//input[@type='button']")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Text");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
	}
	
}
