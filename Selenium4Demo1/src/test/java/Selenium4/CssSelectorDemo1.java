package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorDemo1 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		
		//To select year from drop down
		
		driver.get("https://www.facebook.com/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Using tag and id cssselector
		
		driver.findElement(By.cssSelector("#email")).sendKeys("akshayaharii@gmail.com");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("1234");
		
		

	}

}
