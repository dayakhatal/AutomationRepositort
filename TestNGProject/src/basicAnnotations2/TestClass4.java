package basicAnnotations2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass4 
{

	@Test
	public void test1()
	{
		
		System.out.println("Test 1 Class 4");
		
		
	}
	@Test
	public void test2()
	{
		
		System.out.println("Test 2 Class 4");	
	}
	@Test
	public void test3()
	{
		
		System.out.println("Test 3 Class 4");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		System.out.println("Before Method class 4 ");
	}
    
	@AfterClass
	public void afterMethod()
	{
		
		System.out.println("After Method class 4 ");
		
		
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class 4");
		
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class 4");
		
	}
	
	@BeforeTest
	@Parameters({ "browser" })
	public void masterMaintance(String browser)
	{
		
		System.out.println("Before CAS");
		System.out.println("browser"+browser);
		
		
	}
	
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("After CAS");
		
		
	}
	
	
	
}

