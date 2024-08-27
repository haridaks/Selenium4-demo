package Selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateDemo1 {

	public static void main(String[] args) throws Exception {
		
		//To setup the webdriver manager(chrome driver)
		WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().fullscreen();
		
		driver.navigate().to("https://www.selenium.dev/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
