package com.dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNgExample {
	
	//TestNg is a Testing Framework and it's stand with some Strong Feature compair with Junit
	//We can trigger the test case in a batch or all the cases 
	// Write TestCase Inside the Method 
	// By Default TestNG Run the test Case default Alphabetically 
	
	//BeforeMethod will execute before each and every method 
	
	// 
	
	
	public static WebDriver driver;
	
	//@BeforeTest
	@Test
	public static void BeforeTest() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream f = null;
		try {
			f = new FileInputStream("C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\datadriven.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop.load(f);
		System.out.println(prop.getProperty("username"));
		System.out.println("Delete Cookies Before Test");
		
		if (prop.getProperty("browser").contains("fireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\workspace\\Basket\\BasketAutomated\\ResoureceFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
		}
		
		else if (prop.getProperty("browser").contains("chrome")) {
			
			WebDriver driver = new ChromeDriver();
		}
		
		else {
			
			WebDriver driver = new InternetExplorerDriver();
		}
		
	}	
	
	
//	@BeforeMethod
//	public static void BeforeMethod()
//	{
//		System.out.println("My Before Method");
//	}
//	
//	@AfterTest
//	public static void AfterMethod()
//	{
//		System.out.println("My After Method");
//	}
//	
//	@Test (groups = {"priority1"})
//	public void afterClass()
//	{
//		System.out.println("Delete Cookies after Test");
//	}
//	
//	@Test(groups = {"priority1"},dependsOnMethods = {"afterClass"})
//	public void MyFirstTest()
//	{
//		System.out.println("testNG Test");
//	}
//	
//
//	@Test
//	public static void MySecondTest()
//	{
//		System.out.println("testNG My Second Test");
//	}
//	
//	@Test
//	public static void MyThirdTest()
//	{
//		System.out.println("testNG My Third Test");
//	}
//	
}
