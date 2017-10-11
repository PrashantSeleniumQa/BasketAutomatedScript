package example_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioButton {

	public static WebDriver driver;
	@Test
	public void GetAllRadioButton()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		int i = driver.findElements(By.xpath(".//input[@name='group1']")).size();
		for (int count =0; count <i; count++)
		{
			driver.findElements(By.xpath(".//input[@name='group1']")).get(count).click();
			String text = driver.findElements(By.xpath(".//input[@name='group1']")).get(count).getAttribute("value"); 
			
			if (text.equals("Chees"))
			{
			 
				driver.findElements(By.xpath(".//input[@name='group1']")).get(count).click();
			}
			
		}
	}
	
	
	
}
