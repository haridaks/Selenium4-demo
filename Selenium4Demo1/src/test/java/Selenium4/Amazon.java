package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Exception {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.co.za/dp/0062994476/");
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		String element1 = driver.findElement(By.xpath("//span[contains(@class,'priceToPay')]")).getText();
		
		//String element2 = driver.findElement(By.xpath("//span[contains(@class,'priceToPay')]")).getText().tr
		
		WebElement element2 = driver.findElement(By.xpath("//div[contains(@id,'tmm-grid-swatch-PAPERBACK')]//span[contains(@class,'slot-price')]"));
		
		System.out.println(element1);
	
		System.out.println(element2);
		
		if(element1.contains(element2)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
		
		//| //span[contains(@class,'a-price-symbol')] | //span[contains(@class,'a-price-whole')] | //span[contains(@class,'a-price-decimal')] 
		
		// //span[contains(@class,'aok-relative')] | //span[contains(@class,'priceToPay')]

	}

}
