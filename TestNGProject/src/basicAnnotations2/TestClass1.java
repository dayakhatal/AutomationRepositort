package basicAnnotations2;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClass1 
{

	
    @Test(priority=0,enabled = false)
	public void test3()
	{
		
    	System.out.println("Test Case 3");
	}
	
   
    //dependsonmethod------is will depends on other methos which we will assisgn
    @Test(priority=1,dependsOnMethods = {"test2"})
	public void test1()
	{
		
    	System.out.println("Test Case 1");
		
	}
    
    @Test(priority=2)
	public void test2()
	{
		
    	System.out.println("Test Case 2");
    	
    	throw new SkipException("Skip this test");
	}
	
	
}
