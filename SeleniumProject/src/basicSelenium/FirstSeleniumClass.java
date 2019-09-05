package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass 
{
	ChromeDriver dr;
	
	
	@Test
	public void login()
	{
		//if(login=true)
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		///we import chromedriver 
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/"); 
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		//dr.findElement(By.linkText("SIGN-OFF")).click();
		
	}
	/*
	@Test(dependsOnMethods = {"login"})
	public void logout()
	{
		
		
		dr.findElement(By.linkText("SIGN-OFF")).click();
		
	}
	*/
}
