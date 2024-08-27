package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo1 {

	public static void main(String[] args) throws Exception {
		
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/login/");
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akshaya@gmail.com");
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");

	}

}
