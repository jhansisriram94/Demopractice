package org.programs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitlywaitconcept {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To delete all the cookies
		driver.manage().deleteAllCookies();
		
		
		//To page load out completely
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//dynamic waits 1.implicitily wait for all the elements in webpage-if we give time here and if its 
		//2.find out the element within 20 secs it wont wait
		//3.for complete time it will ignore remaining time and continue
		//Thread.sleep(); if we given time the execution will stop untill that time 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//To launch the URL
		driver.get("https://jqueryui.com/droppable/");
		
		
		
	}

}
