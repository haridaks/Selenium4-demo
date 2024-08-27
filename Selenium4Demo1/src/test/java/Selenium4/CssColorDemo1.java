package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssColorDemo1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String Expectedhexcolor = "#ff7b1d";
		
		Thread.sleep(3000);
		
		String BGcolor = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("background-color");
		
		Thread.sleep(3000);
		
		System.out.println(BGcolor);
		
		Thread.sleep(200);
		
		Color BGhexvalue = Color.fromString(BGcolor);
		
		String Actualhexcolor = BGhexvalue.asHex();
		
		if (Expectedhexcolor.equals(Actualhexcolor)) {
			
			System.out.println("Validation sucessful");
			
		} else {
			
			System.out.println("validation unsucessful");
		}
		
		
		
		
	}

}
