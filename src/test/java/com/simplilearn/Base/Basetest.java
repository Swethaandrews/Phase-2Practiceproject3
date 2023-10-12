package com.simplilearn.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;



public class Basetest {

	public static WebDriver driver;
		
	@BeforeSuite
	public static void openBrowser() throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		Thread.sleep(1000);

	}
	
	
	
	public static void closeBrowser() {
		System.out.println("Browser closed");
		driver.quit();
	}

	
}



