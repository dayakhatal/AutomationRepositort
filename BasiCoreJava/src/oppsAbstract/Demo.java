package oppsAbstract;

import javax.activation.MailcapCommandMap;

public class Demo 
{

	public static void Main() {
		// TODO Auto-generated method stub

		
		//create the reference of parent class and object of child class
		ExcelApplication  obj =new Sprint3();

		//Sprint3 prn =new ExcelApplication(); cant create the reference of child class and object of parent class
		
		obj.spreadsheet();
		obj.save();
		obj.delete();
		obj.update();
		obj.filter();
		obj.format();
		
	
		
	}
	
}
