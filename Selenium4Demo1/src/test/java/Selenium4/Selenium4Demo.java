package Selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4Demo {

	public static void main(String[] args) {
		// Automating using selenium4
		
		//To setup the webdriver manager(chrome driver)
		WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().fullscreen();
		
		System.out.println(driver.getTitle());
	
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
