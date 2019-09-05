package webPageAccess;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Class1 

{

	ChromeDriver dr;
	@Test
	public void bookOneWay() throws Exception
	{
		//Driver not require because we have addded the same in environment variable
		//System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		dr = new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com/");
		dr.manage().window().maximize();
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		//selecting radio button
		dr.findElement(By.xpath("//input[@value=\"oneway\"]")).click();
		
		//handiling dropdown
		WebElement wd=dr.findElement(By.name("passCount"));
		Select sk=new Select(wd);
		sk.selectByIndex(2);
		Thread.sleep(2000);
		sk.selectByValue("3");
		Thread.sleep(2000);
		sk.selectByVisibleText("4");
		
		WebElement wn =dr.findElement(By.name("fromPort"));
		
		Select st=new Select(wn);
		st.selectByValue("Acapulco");
		
		Thread.sleep(2000);
		st.selectByValue("Frankfurt");
		Thread.sleep(2000);
		st.selectByValue("London");
		Thread.sleep(2000);
		st.selectByValue("New York");
		
		dr.findElement(By.xpath("//input[@value=\"Business\"]")).click();
		
		dr.findElement(By.name("findFlights")).click();
		
		//reading table 
				

		
		WebElement table=dr.findElement(By.xpath("//table[1][@cellpadding='2'][@cellspacing='1'][1]//tbody"));
		
		table.findElements(By.tagName("tr"));
		
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(WebElement r:rows)
		{
			
			List<WebElement> cols=r.findElements(By.tagName("td"));
			
			for(WebElement c:cols)
			{
				
				
				System.out.println(c.getText());
				
				
			}
		}				
		
	
		
		dr.findElement(By.name("reserveFlights")).click();
		
		dr.findElement(By.name("ticketLess")).click();
		
		System.out.println(dr.findElement(By.name("ticketLess")).isSelected());
		
		WebElement wh= dr.findElement(By.name("delCountry"));
		
		Select sn = new Select(wh);
		
		sn.selectByIndex(3);
		
		//For handling the alert
		
		Alert al=dr.switchTo().alert();
		
		//gettext is used to read the alert message
		System.out.println(al.getText());
		
		//accept is used to accept the alert message
		//al.accept();

		//dismiss is 
		al.dismiss();
		
		
		dr.findElement(By.name("buyFlights")).click();
		
		System.out.println(dr.findElement(By.xpath("//font[@size='+1']")).getText());
		
		dr.close();
		

		
		dr.close();
		
	}
	
	
	
	
	
	
	
}
