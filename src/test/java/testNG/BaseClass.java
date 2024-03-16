package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void suiteconfiguration()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void testconfiguration()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void classconfiguration()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void methodconfiguration()
	{
		System.out.println("Before Method");
	}
	@AfterSuite
	public void suiteteardown()
	{
		System.out.println("After Suite");
	}
	@AfterTest
	public void testteardown()
	{
		System.out.println("After Test");
	}
	@AfterClass
	public void classteardown()
	{
		System.out.println("After Class");
	}
	@AfterMethod
	public void methodteardown()
	{
		System.out.println("After Method");
	}

}
