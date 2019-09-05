package basicSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestClass2 
{

	ChromeDriver dr;
	@Test
	public void bookAFlight() throws InterruptedException
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
				
				//radioButton
				dr.findElement(By.xpath("//input[@value='oneway']")).click();
				//Dropdown
				
				
				WebElement we=dr.findElement(By.name("passCount"));
		
				Select sel =new Select(we);
				
				sel.selectByIndex(2);
				
				Thread.sleep(2000);
				sel.selectByValue("2");
				
				Thread.sleep(2000);
				sel.selectByVisibleText("4");
				
				
				
			
		  ///daya code
		  
		  WebElement w2=dr.findElement(By.name("fromPort"));
		  
		  Select se1= new Select(w2);
		  
		  se1.selectByValue("Acapulco");
		  
		  Thread.sleep(2000);
		  se1.selectByValue("Frankfurt");
		 
		  Thread.sleep(2000);
		  se1.selectByValue("London");
		  
		 
		  Thread.sleep(2000);
		  se1.selectByValue("New York");
		  
		  Thread.sleep(2000);
		  se1.selectByValue("Paris");
		  
		  Thread.sleep(2000);
		  se1.selectByValue("Portland");
		  
		  Thread.sleep(2000);
		  se1.selectByValue("San Francisco");
		  

		  Thread.sleep(2000);
		  se1.selectByValue("Seattle");
		  
		  
		  Thread.sleep(2000);
		  se1.selectByValue("Sydney");
		  
		  Thread.sleep(2000);
		  se1.selectByValue("Zurich");
		  
		  
		  WebElement w3= dr.findElement(By.name("fromMonth")); 
		  
		  Select sl= new Select(w3);
		  
		  
		  sl.selectByValue("1");
		  
		
		  /*
		  Thread.sleep(2000);
		  sl.selectByValue("1");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("2");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("3");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("4");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("5");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("6");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("7");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("8");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("9");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("10");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("11");
		  
		  Thread.sleep(2000);
		  sl.selectByValue("12");
		  */
		  
		 // WebElement wk = dr.findElement(By.name("fromDay"));
		  
				
				dr.findElement(By.name("findFlights")).click();
				
				//webtable
				
				
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
				
				
				
				
				
				
				
	}
	
	
	
}
