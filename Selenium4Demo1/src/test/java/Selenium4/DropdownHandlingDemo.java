package Selenium4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandlingDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		
		//To select year from drop down
		
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> birthyear = driver.findElements(By.xpath("//select[@id='year']/option"));
		
		System.out.println("Total dropdown values: " + birthyear.size());
		
		WebElement by = driver.findElement(By.xpath("//select[@id='year']"));
		
		// slect class
		
		Select year = new Select(by);
		
		//By visible Text
		
		year.selectByVisibleText("1998");
		
		System.out.println(year.getFirstSelectedOption().getText());
		
		//By index
		
		year.selectByIndex(26);
		
		System.out.println(year.getFirstSelectedOption().getText());
		
		//By value
		
		year.selectByValue("25");
		
		System.out.println(year.getFirstSelectedOption().getText());
		
		// Checking whether it is multiple
		
		System.out.println(year.isMultiple());
		
		//driver.close();
		
	}

}
