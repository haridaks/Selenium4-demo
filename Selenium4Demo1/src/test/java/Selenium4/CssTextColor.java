package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssTextColor {

	public static void main(String[] args) throws Exception {

WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String Expectedhexcolor = "#fff";
		
		Thread.sleep(3000);
		
		String Textcolor = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("color");
		
		System.out.println(Textcolor);
		
		Thread.sleep(3000);
		
		Color Texthexvalue = Color.fromString(Textcolor);
		
		String Actualhexcolor = Texthexvalue.asHex();
		
		System.out.println(Actualhexcolor);
		
		if (Expectedhexcolor.equals(Actualhexcolor)) {
			
			System.out.println("Validation sucessful");
			
		} else {
			
			System.out.println("validation unsucessful");
		}
		
		
		
		
	}
	}


