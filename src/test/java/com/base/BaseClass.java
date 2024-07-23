package com.base;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	
	public void launchBrowser() {
		
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	}
	
	public void loadurl() {
		driver.get("https://www.flipkart.com/");
	}
	
	public void inputKeys( WebElement element,String data) {
		
		element.sendKeys(data);
		
	}
	
	public void click(WebElement element) {
		element.click();
	}

}
