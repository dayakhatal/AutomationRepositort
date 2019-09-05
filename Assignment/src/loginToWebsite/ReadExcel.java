package loginToWebsite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ReadExcel 
{
	
	ChromeDriver dr;
	public class TestngClass1 
	{
	    @Test(dataProvider="getData2")
		public void loginTestCase(String Username,String Password)
		{
			
			System.out.println(Username);
			System.out.println(Password);
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			///we import chromedriver 
			dr= new ChromeDriver();
			dr.manage().window().maximize();
			dr.get("http://www.newtours.demoaut.com/"); 
			dr.findElement(By.name("userName")).sendKeys(Username);
			dr.findElement(By.name("password")).sendKeys(Password);
			dr.findElement(By.name("login")).click();
			
			//radioButton
			dr.findElement(By.xpath("//input[@value='oneway']")).click();
			//Dropdown
			
			dr.close();
			
			
			
			
		}
	    
		
	 
	    @DataProvider
		public String[][] getData2() throws IOException
		{
	    
	    	
	    	
	    	
	    	ReaderExcel2 dk = new ReaderExcel2("D:\\AutomationRepositort\\Assignment\\src\\loginToWebsite\\LoginCredential.xlsx");
			
			int rows=dk.getrowcount("Sheet1");
			int cols=dk.getcolumncount("Sheet1");
			
			System.out.println(rows);
			
			System.out.println(dk.getcolumncount("Sheet1"));
			
			String[][] data= new String[rows][cols];

			
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=cols;c++)
					
				{
					//System.out.println(dk.getCellData("Sheet1",r,c));
					
					
					data[r-1][c-1]=dk.getCellData("Sheet1",r,c);
				
					
					
				}
				
			}
	    	
	    			
			
			
			return data;
			
		}
	    
	    
}
	
}