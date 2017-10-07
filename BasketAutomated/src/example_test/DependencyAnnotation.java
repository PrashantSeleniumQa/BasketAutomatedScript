package example_test;

import org.testng.annotations.Test;

public class DependencyAnnotation {




	@Test(dependsOnMethods={"MyThirdTest"})
	public static void MyFirstTest()
	{
		System.out.println("Login Checker");
	}


	@Test ( dependsOnMethods={"MyFirstTest"}, alwaysRun=true)
	public static void MySecondTest()
	{
		System.out.println("testNG My Second Test");
	}

	@Test 
	public static void MyThirdTest()
	{
		System.out.println("Open The Browser");
	}
	
	//Enabling and deciabling the test cased 
	@Test (enabled=false)
	public static void MyFourthTest()
	{
		int i = 6/0;
		System.out.println("Open The Browser");
	}
	
	@Test (timeOut=5000)
	public static void MyFifthTest()
	{
		
		System.out.println("Open The Browser");
	}
	
	@Test  (priority = 2)
	public static void MySeventhTest()
	{
		
		System.out.println("Priority two");
	}

	@Test  (priority = 1)
	public static void MySixthTest()
	{
		
		System.out.println("Priority One");
	}
}
