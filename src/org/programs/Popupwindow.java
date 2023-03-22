package org.programs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popupwindow {
	public static void main(String[] args)
	{
		
	
        System.setProperty("webdriver.edge.driver", "d://geckodriver.exe");
        WebDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.flipkart.com/");
        
       // driver.findElement(By.xpath("//a[text()='Login']")).click();
         Set<String> handler=driver.getWindowHandles();
         Iterator<String> it = handler.iterator();
         
         String parentwindow=it.next();
         System.out.println(parentwindow);
         
         
         String childwindow=it.next();
         System.out.println(childwindow);
         
         driver.switchTo().window(childwindow);
         driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9879879879");
//(//input[@type='text'])[2]
}
}