package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException 
	
	{ 
	
		
		Properties dp=new Properties();
		
		FileInputStream file= new FileInputStream((System.getProperty("user.dir")+"\\src\\fileHandler\\OR.Properties"));
		
		dp.load(file);
		
		System.out.println(dp.get("name"));
		System.out.println(System.getProperty("user.dir"));
		
	}

}
