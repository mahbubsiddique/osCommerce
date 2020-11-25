package com.careerhack.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OSComBase {
	
	public WebDriver driver;
	
	
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}//launchBrowser
	
	public void closeBrowser() {
		driver.close();			
	}//closeBrowser
	
	public void closeAllBrowsers() {
		driver.quit();		
	}//closeAllBrowsers

}
