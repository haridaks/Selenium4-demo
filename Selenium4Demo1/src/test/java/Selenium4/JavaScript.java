package Selenium4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) {
		// Automating using selenium4
		
				//To setup the webdriver manager(chrome driver)
				WebDriverManager.chromedriver().setup();
				
				//To launch the chrome driver
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/login/");
				
				driver.manage().window().fullscreen();
				
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				
				

	}

}
