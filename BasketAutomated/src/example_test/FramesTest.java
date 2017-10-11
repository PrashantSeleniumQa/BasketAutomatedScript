package example_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FramesTest {

	@Test
public void DragandDrop()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	//System.exit(0);
	driver.get("http://jqueryui.com/draggable/");
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	Actions act= new Actions(driver);
	act.dragAndDropBy(driver.findElement(By.id("draggable")), 12, 15).build().perform();
//	driver.findElement(By.id("draggable")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("")).click();
}
}
