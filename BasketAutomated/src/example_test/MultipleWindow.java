package example_test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindow {


	public static WebDriver driver;
	@Test
	public void GetAllRadioButton()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		//System.exit(0);
		driver.get("https://gmail.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//a[@target='_blank']")).click();
		System.out.println(driver.getTitle());
		
		Set<String> window= driver.getWindowHandles();
		Iterator<String> it= window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
	}
}
