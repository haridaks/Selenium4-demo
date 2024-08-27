package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookSearchPage {

	public static WebElement Email_field(WebDriver driver) {
		
		WebElement element1 = driver.findElement(By.id("email")); ////we can also input values here please go through the screenshot and practice
		return element1;
	}
	
	public static WebElement Password_field(WebDriver driver) {
		
		WebElement element2 = driver.findElement(By.id("pass"));  //we can also input values here please go through the screenshot and practice
		return element2;
	}
	
	public static WebElement ClickLoginbutton(WebDriver driver) {
		
		WebElement element3 = driver.findElement(By.id("loginbutton"));
        return element3;
	}
}
