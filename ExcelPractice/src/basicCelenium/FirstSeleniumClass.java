package basicCelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstSeleniumClass 
{
	
	
	int rownum=2;
	int colunm=3;

	@Test(dataProvider="getdata")
	public void login(String username, String Password) throws IOException
	{
	
		
		System.out.println(username+ " "+Password);
		
		
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/"); 
		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(Password);
		dr.findElement(By.name("login")).click();
		dr.close();
		String filepath="D:\\AutomationRepositort\\ExcelPractice\\src\\basicCelenium\\TestData.xls";
		
		Xls_Reader xl=new Xls_Reader(filepath);
		
		xl.setCellData("Sheet1", rownum, colunm, "Pass");
		rownum++;
	}
	
	
	@DataProvider
	
	public String[][] getdata() throws IOException
	{
		
		String filepath="D:\\AutomationRepositort\\ExcelPractice\\src\\basicCelenium\\TestData.xls";
		
		Xls_Reader xl=new Xls_Reader(filepath);
		
		int rows=xl.getrowcount("Sheet1");
		int cols=xl.getcolumncount("Sheet1");
		
		String[][] data=  new String[rows-1][cols-1];
		
		
		System.out.println(rows);
		System.out.println(cols);
		
		
		for(int r=2;r<=rows;r++)
			
		{
			for(int c=1;c<cols;c++)
			{
				
				System.out.println(xl.getCellData("Sheet1", r, c));		
				
				data[r-2][c-1]=xl.getCellData("Sheet1", r, c);
			}
			
			}
		
		return data;
		
		}
		
}
