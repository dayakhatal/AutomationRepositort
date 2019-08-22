package fileHandler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteinExcel {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		String filepath="D:\\AutomationRepositort\\BasiCoreJava\\src\\fileHandler\\Testdata.xls";

		FileInputStream file =new FileInputStream(filepath);

		//workbook
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		//Work sheet
		HSSFSheet sheet =wb.getSheet("Sheet1");
		
		//Row
		HSSFRow row = sheet.getRow(11);
		if(row==null)
			row=sheet.createRow(11);
		
		//Cell 
		HSSFCell cell=row.getCell(2);
		if(cell==null)
			cell=row.createCell(2);
		cell.setCellValue("Dayanand");
		
		FileOutputStream fileout= new FileOutputStream(filepath);
		
		wb.write(fileout);
	
		
		
		
	}

}
