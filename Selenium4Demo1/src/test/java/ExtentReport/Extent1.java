package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent1 {

		
		@Test
		
     public void Report( ) {
		
		//Initialize the Htmlreporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("DemoTests.html");
		
		//Initialize extentreports and attach htmlreporter
		
		ExtentReports extent = new ExtentReports();
		
		//Attach only HtmlReporter
		
		extent.attachReporter(htmlReporter);
		
		ExtentTest TC1 = extent.createTest("First TC");
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        TC1.log(Status.INFO, "Executing TC1");
        
        driver.get("https://en-gb.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("akshayahari10@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345");
        TC1.pass("Entererd details successfully");
        TC1.info("First TC completed");
        
        ExtentTest TC2 = extent.createTest("Second TC");
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        TC2.log(Status.INFO, "Executing TC2");
        
        driver.get("https://en-gb.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("akshayahari10@gm");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.id("loginbutton")).click();
        TC2.fail("Invalid username");
        TC2.info("Second TC completed");
        
        ExtentTest TC3 = extent.createTest("Third TC");
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        TC3.log(Status.INFO, "Executing TC3");
        
        driver.get("https://en-gb.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("akshayahari10@gmail.com");
        driver.findElement(By.id("pass")).sendKeys(".");
        driver.findElement(By.id("loginbutton")).click();
        TC3.pass("Entererd successfully");
        TC3.info("Second TC completed");
        
        /*public void closeAll() {
        	driver.quit();
        }*/
        
        extent.flush();
        
		
	}

		private void closeAll() {
			// TODO Auto-generated method stub
			
		}

}
