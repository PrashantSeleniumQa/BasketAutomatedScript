package example_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {

	WebDriver driver;
	@Test
	public void ActionExample()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		try{
			driver.navigate().to("https://amazon.in");;
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath(".//a[@id='nav-link-shopall']"))).build().perform();
		//a.moveToElement(driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']"))).click().keyUp(Keys.SHIFT).sendKeys("t-shirt").doubleClick().build().perform();
		//driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']"));
		a.moveToElement(driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']"))).contextClick().build().perform();
		
		
	}
	
}
