package basiAnnotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Xls_Reader 
{

	String filepath=null;
	
	public Xls_Reader(String filepath)
	{
		
		this.filepath=filepath;
		
	}
	
	
	public String getCellData(String sheetName,int rownum,int columnum) throws IOException
	
	{
	
		FileInputStream file =new FileInputStream(filepath);

		//workbook
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet =wb.getSheet(sheetName);
		
		//Row
		HSSFRow row = sheet.getRow(rownum-1);
		
		//Cell
		HSSFCell cell=row.getCell(columnum-1);
		
		String value=cell.getStringCellValue();
		
		return value;
		
		
	}
	
	public void setCellData(String sheetName,int rownumm,int columnnum, String value) throws IOException
	{
		

		FileInputStream file =new FileInputStream(filepath);

		//workbook
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet =wb.getSheet(sheetName);
		
		//Row
		HSSFRow row = sheet.getRow(rownumm-1);
		if(row==null)
			row=sheet.createRow(rownumm-1);
		
		//Cell 
		HSSFCell cell=row.getCell(columnnum-1);
		if(cell==null)
			cell=row.createCell(columnnum-1);
		cell.setCellValue(value);
		
		//FileOutputStream fileout= new FileOutputStream(filepath);
		
		//wb.write(fileout);
	
		
		
	}
	
	public int getrowcount(String sheetName ) throws IOException
	{
		
		FileInputStream file =new FileInputStream(filepath);

		//workbook
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet =wb.getSheet(sheetName);
		
		return sheet.getLastRowNum()+1;
		
		
		
	}
	public int getcolumncount(String sheetName) throws IOException
	{
		
		FileInputStream file =new FileInputStream(filepath);

		//workbook
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet =wb.getSheet(sheetName);
		
		return sheet.getRow(0).getLastCellNum();
		
		
		
	}
	
}
