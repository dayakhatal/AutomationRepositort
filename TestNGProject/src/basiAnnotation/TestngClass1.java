package basiAnnotation;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngClass1 
{
    @Test(dataProvider="getData2")
	public void loginTestCase(String Username,String Password)
	{
		
		System.out.println(Username);
		System.out.println(Password);
		
	}
    
	/*
    @DataProvider
	public String[][] getData()
	{
		
		String[][] data= new String[3][2];
		
		//Row 1
		data[0][0]="User1";
		data[0][1]="Password1";
		
		
		//Row 2
		data[1][0]="User2";
		data[1][1]="Password2";
				
					
		//Row 3
		data[2][0]="User2";
		data[2][1]="Password3";
		
		return data;
		
	}
    */
    @DataProvider
	public String[][] getData2() throws IOException
	{
		
    	Xls_Reader dk = new Xls_Reader("D:\\AutomationRepositort\\TestNGProject\\src\\basiAnnotation\\Testdata.xls");
		
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
