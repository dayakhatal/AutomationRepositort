package fileHandler;

import java.io.IOException;

public class TestXlsReader {

	public static void main(String[] args) throws IOException
	{
		
		Xls_Reader dk = new Xls_Reader("D:\\AutomationRepositort\\BasiCoreJava\\src\\fileHandler\\Testdata.xls");
		
		int rows=dk.getrowcount("Sheet1");
		int cols=dk.getcolumncount("Sheet1");
		
		System.out.println(rows);
		
		System.out.println(dk.getcolumncount("Sheet1"));

		
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
				
			{
				System.out.println(dk.getCellData("Sheet1",r,c));
				
				
			}
			
		}
		
		
	}

}
