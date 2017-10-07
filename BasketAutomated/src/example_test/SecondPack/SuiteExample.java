package example_test.SecondPack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SuiteExample {

	@BeforeSuite
	public void InstallSoftware()
	{
		System.out.println("My The First");
	}

	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("I am the last");
	}

}
