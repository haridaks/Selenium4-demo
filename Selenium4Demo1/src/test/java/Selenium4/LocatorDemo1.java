package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo1 {

	public static void main(String[] args) throws Exception  {
		
		//To setup the webdriver manager(chrome driver)
				WebDriverManager.chromedriver().setup();
				
				//To launch the chrome driver
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/login/");
				
				driver.manage().window().fullscreen();
				
				driver.findElement(By.id("email")).sendKeys("akshayahari10@gmail.com");
				
				driver.findElement(By.id("pass")).sendKeys("123456");
				
				Thread.sleep(3000);
				
				driver.close();

	}

}
