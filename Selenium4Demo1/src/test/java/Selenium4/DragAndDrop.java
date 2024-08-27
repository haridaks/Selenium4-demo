package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		
          WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
			WebElement element1 = driver.findElement(By.xpath("//div[@id='column-a']"));
			
			WebElement element2 = driver.findElement(By.xpath("//div[@id='column-b']"));
			
			Actions act = new Actions(driver);
			act.dragAndDrop(element1, element2);
			act.build().perform();
	}

}
