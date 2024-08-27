package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabAndEnter {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
			//To launch the chrome driver
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			driver.findElement(By.id("email")).sendKeys("akshaya@gmail.com");
			
			//Using tab keyboard operations to switch tab
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			
			//Using enter keyboard operations to press enter
			driver.switchTo().activeElement().sendKeys("12345" + Keys.ENTER);
			
			
	}

}
