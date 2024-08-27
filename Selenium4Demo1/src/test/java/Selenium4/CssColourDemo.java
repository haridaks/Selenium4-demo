package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssColourDemo {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			//To launch the chrome driver
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/");
			
			driver.manage().window().maximize();
			
		String Expectedhexcolor = "#0866ff";
		
			String backgroundcolor = driver.findElement(By.name("login")).getCssValue("background-color");
			System.out.println(backgroundcolor);
			
			Color Hexvalue = Color.fromString(backgroundcolor);
              
			String Actualhexcolor = Hexvalue.asHex();
			
		    System.out.println(Actualhexcolor);
		    
		    if (Expectedhexcolor.equals(Actualhexcolor)) {
		    	
		    	System.out.println("Validation is successful");
		    } else {
		    	
		    	System.out.println("Validation is unsucessful");
		    }
			
		
	}

}
