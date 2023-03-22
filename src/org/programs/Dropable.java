package org.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions ac=new Actions(driver);
		WebElement frmae=driver.findElement(By.className("demo-frame"));
		//driver.switchTo().frame(0);
		driver.switchTo().frame(frmae);
		//1.driver.switchTo().frame("emial");-when we have id,name then only we need to take 
		//2.with String otherwise we have to 
		//3.choose webelement ref or index
		//1.How to identify the frame is present or not if its not locating the particular
		//2.webelement right click view page source+ctri+f+enter iframe 
		
		/* one way :::
		 * 
		 * WebElement src= driver.findElement(By.xpath("//div[@id='draggable']"));
		 * ////div[@id='droppable'] WebElement dest=
		 * driver.findElement(By.xpath("//div[@id='droppable']"));
		 * 
		 * ac.dragAndDrop(src, dest).perform();
		 */
		
		//second way  :: 
		
		ac.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.perform();
		//1.when we are taking that time we can take build and perform methods previously 
		//2.we were using both but we can take only perform method 
		
		
	}

}
