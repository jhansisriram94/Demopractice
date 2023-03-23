package org.programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigationteps {
	
	public void test()
	{
		System.out.println("Testing the application");
	}
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Testing");
		
		Navigationteps c=new Navigationteps();
		c.test();
		
		//difference btw get() and navigate().to() methods
		//get-it will wait until the webpage is loaded completely and it will not maintain browser cookies
		//navigate().to()- it will not wait the till the webpage is loading completely.but it will
		//navigate to previous and next pages.
		
	}
	
	

}
