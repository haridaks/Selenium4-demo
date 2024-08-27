package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws Exception {
		
		    WebDriverManager.chromedriver().setup();
			
			//To launch the chrome driver
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/context_menu");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			WebElement element1 = driver.findElement(By.id("hot-spot"));
			
			Actions act = new Actions(driver);
			
			//rightclick on the specific WebElement
			act.contextClick(element1).build().perform();

	}

}
