package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException 
	{
	
		String filepath="D:\\AutomationRepositort\\BasiCoreJava\\src\\fileHandler\\Testdata.xls";

		FileInputStream file =new FileInputStream(filepath);

		//workbook
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet =wb.getSheet("Sheet1");
		
		//Row
		HSSFRow row = sheet.getRow(10);
		
		//Cell
		HSSFCell cell=row.getCell(0);
		
		String value=cell.getStringCellValue();
		
		System.out.println(value);
		
		System.out.println(row.getLastCellNum());
		System.out.println(sheet.getLastRowNum());
		
	}

}
