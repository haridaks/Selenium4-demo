package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InlineFrame {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tickets.paytm.com/trains/");
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@class = 'yXYSb']")).click();
		Thread.sleep(300);
		//this is nested frame so first write the 1st frame then the another one
		//driver.switchTo().frame(0); //if you know the index of the element you can simply go with index
		//instead of index we can also write using webelement like
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@scrolling='no']")));
		//nested frame
		driver.switchTo().frame("oauth-iframe");
		Thread.sleep(300);
		driver.findElement(By.id("email_mobile_login")).sendKeys("8878976978");
		

	}

}
