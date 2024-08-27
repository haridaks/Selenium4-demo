package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws Exception {
		
		 WebDriverManager.chromedriver().setup();
			
			//To launch the chrome driver
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.selenium.dev/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
           WebElement element1 = driver.findElement(By.xpath("//*[@id='navbarDropdown']"));
           
           Actions act = new Actions(driver);
           Thread.sleep(3000);
           act.moveToElement(element1).click().build().perform();
           
           act.contextClick().build().perform();
                 
	}	
	}


