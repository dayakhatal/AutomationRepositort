package basicAnnotations2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass3 
{

	@Test
	public void test1()
	{
		
		System.out.println("Test 1 Class 3");
		
		
	}
	@Test
	public void test2()
	{
		
		System.out.println("Test 2 Class 3");	
	}
	@Test
	public void test3()
	{
		
		System.out.println("Test 3 Class 3");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		System.out.println("Before Method class 3 ");
	}
    
	@AfterClass
	public void afterMethod()
	{
		
		System.out.println("After Method class 3 ");
		
		
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class 3");
		
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class 3");
		
	}
}

