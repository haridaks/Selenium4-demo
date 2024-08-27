package POMTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPages.FacebookSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebokkSearchPageTest {

	public static void main(String[] args) {
		
		facebooklogin();
		
	}
    
	public static void facebooklogin() {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		FacebookSearchPage.Email_field(driver).sendKeys("akshaya@gmail.com");
		
		FacebookSearchPage.Password_field(driver).sendKeys("1234");
		
		FacebookSearchPage.ClickLoginbutton(driver).click();
		
		driver.close();
	}
}
