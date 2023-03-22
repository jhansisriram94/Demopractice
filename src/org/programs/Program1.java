package org.programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program1 {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*
		 * driver.get("https://www.facebook.com/");
		 * driver.findElement(By.cssSelector("#email")).sendKeys("jhansi");
		 * driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */
		/*
		 * driver.get("https://html.com/input-type-file/");
		 * driver.findElement(By.id("fileupload")).sendKeys(
		 * "\\Users\\cavin\\Desktop\\text.html");
		 * 
		 */
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions ac=new Actions(driver);
		
		WebElement addons=driver.findElement(By.xpath("//div[text()=\'Add-ons\']"));
		ac.moveToElement(addons).perform();
		driver.findElement(By.xpath("(//div[text()='Visa Services'])[1]")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
	}

}
