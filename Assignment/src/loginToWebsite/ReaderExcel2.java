package loginToWebsite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaderExcel2 {

String filepath=null;
	
	public ReaderExcel2(String filepath)
	{
		
		this.filepath=filepath;
		
	}
	
	
	public String getCellData(String sheetName,int rownum,int columnum) throws IOException
	
	{
	
		FileInputStream file =new FileInputStream(filepath);

		//workbook
		
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		//Work sheet
		XSSFSheet sheet =wb.getSheet(sheetName);
		
		//Row
		XSSFRow row = sheet.getRow(rownum-1);
		
		//Cell
		XSSFCell cell=row.getCell(columnum-1);
		
		String value=cell.getStringCellValue();
		
		return value;
		
		
	}
	
	public void setCellData(String sheetName,int rownumm,int columnnum, String value) throws IOException
	{
		

		FileInputStream file =new FileInputStream(filepath);

		//workbook  
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		//Work sheet
		XSSFSheet sheet =wb.getSheet(sheetName);
		
		
		
		//Row
		XSSFRow row = sheet.getRow(rownumm-1);
		if(row==null)
			row=sheet.createRow(3);
	
		//Cell 
		XSSFCell cell=row.getCell(columnnum-1);
		if(cell==null)
			cell=row.createCell(1);
		cell.setCellValue("Dayanand");
	//	cell.setCellValue("dayanand");
		FileOutputStream fileout= new FileOutputStream(filepath);
		
		wb.write(fileout);
		fileout.close();
	
		
		
	}
	
	public int getrowcount(String sheetName ) throws IOException
	{
		
		FileInputStream file =new FileInputStream(filepath);

		//workbook
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		//Work sheet
		XSSFSheet sheet =wb.getSheet(sheetName);
		
		return sheet.getLastRowNum()+1;
		
		
		
	}
	public int getcolumncount(String sheetName) throws IOException
	{
		
		FileInputStream file =new FileInputStream(filepath);

		//workbook
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		//Work sheet
		XSSFSheet sheet =wb.getSheet(sheetName);
		
		return sheet.getRow(0).getLastCellNum();
		
		
		
	}
	

}
