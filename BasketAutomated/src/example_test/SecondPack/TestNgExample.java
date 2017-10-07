package example_test.SecondPack;

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
	
	@BeforeTest
	
	public static void BeforeTest()
	{
		System.out.println("Delete Cookies Before Test");
	}	
	
	@BeforeMethod
	public static void BeforeMethod()
	{
		System.out.println("My Before Method");
	}
	
	@AfterTest
	public static void AfterMethod()
	{
		System.out.println("My After Method");
	}
	
	@AfterTest
	public static void afterClass()
	{
		System.out.println("Delete Cookies after Test");
	}
	
	@Test
	public static void MyFirstTest()
	{
		System.out.println("testNG Test");
	}
	

	@Test
	public static void MySecondTest()
	{
		System.out.println("testNG My Second Test");
	}
	
	@Test
	public static void MyThirdTest()
	{
		System.out.println("testNG My Third Test");
	}
	
}
