package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart1 
{
	@Test
	public void test()
	{
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		
		//dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("https://www.flipkart.com/");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//for overing the mouse  actions is class is used to mouse related act
		Actions act = new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();//build and perform are fix method we have to user
		
		WebDriverWait wait = new WebDriverWait(dr,20);
		
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']"))));
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		
	}
	
	
	
}
