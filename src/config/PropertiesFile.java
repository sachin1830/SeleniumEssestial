package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties prop=new Properties();
	public static void main(String[] args) {
	
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}
	
	//This method is used for read properties file
	
	public static void readPropertiesFile()
	{
		
		try {
			
			InputStream in=
					new FileInputStream("/media/sachin/New Volume1/SeleniumTest/SeleniumProgram/src/config/config.properties");
			
			prop.load(in);
		
			System.out.println(	prop.getProperty("browser"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void writePropertiesFile()
	{
		try {
			OutputStream out=new FileOutputStream
					("/media/sachin/New Volume1/SeleniumTest/SeleniumProgram/src/config/config.properties");
			
			prop.setProperty("result","pass");
			
			prop.store(out, "comment");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
