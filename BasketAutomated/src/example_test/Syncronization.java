package example_test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Syncronization {

	public static WebDriver driver;
	@Test
	public void GetAllRadioButton()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		try{
			driver.navigate().to("https://www.alaskaair.com/");;
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(".//input[@class='form-control fromCity']")).sendKeys("New York, NY (All Airports)");
		driver.findElement(By.xpath(".//input[@class='form-control toCity']")).sendKeys("Los Angeles, CA (All Airports)");
		driver.findElement(By.xpath(".//input[@id='findFlights']")).click();
		WebDriverWait d = new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@value='2_2']")));
		
		//System.setProperty("Timeouts", "10");
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> listFlight=driver.findElements(By.xpath(".//tbody[@role='list']"));
		listFlight.get(0).findElement(By.xpath(".//input[@value='2_2']")).click();

	}
}
