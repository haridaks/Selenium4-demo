package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumOperationsDemo1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/login/");
        
        System.out.println(driver.getTitle());
        
        System.out.println(driver.getCurrentUrl());
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("email")).sendKeys("akshayahari10@gmail.com");
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("pass")).sendKeys("123456");
         
	}

}
