package example_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetLinkOfThePage {

	@Test
	public void DragandDrop()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.in/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Count for links in futter sections
		WebElement futter = driver.findElement(By.xpath(".//div[@id='gf-BIG']"));
		System.out.println(futter.findElements(By.tagName("a")).size());

		List<WebElement>Links= futter.findElements(By.tagName("a"));
		String text = "Buying Basics";
		if (text.equals(Links.get(1).getText()))
		{
			Links.get(1).click();
		}


	}
}
