package Selenium4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FacebookPropertiesFile {
	
	static Properties prop = new Properties();
	
	static String projectPath = System.getProperty("user.dir");
	

	public static void main(String[] args) throws Exception {
		
		getProperties();
		

	}
	
	public static void getProperties() throws Exception {
		
		FileInputStream input = new FileInputStream(projectPath+ "/src/test/java/facebook.properties");
		
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
	}

}
