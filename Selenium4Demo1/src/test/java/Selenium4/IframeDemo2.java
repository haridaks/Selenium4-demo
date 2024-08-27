package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo2 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		Thread.sleep(300);
		
		//switching to frame
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		Thread.sleep(300);
		
		//finding element in that frame
		
		WebElement text1  = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		Thread.sleep(300);
		System.out.println(text1.getText());
		
		Thread.sleep(300);
		WebElement text2  = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		System.out.println(text2.getText());
		
		Thread.sleep(300);
		WebElement text3  = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		System.out.println(text3.getText());
		
		//Switching to bottom frame
		
	    //driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
		
		//WebElement text4  = driver.findElement(By.name("frame-bottom"));
		
		
		//System.out.println(text4.getText());
		
		
		
		

	}

}
