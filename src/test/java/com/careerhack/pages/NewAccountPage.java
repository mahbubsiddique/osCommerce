package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
	
	
	WebDriver driver;
	
	public NewAccountPage(WebDriver driver){		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="(//input[@name='gender'])[1]")
	WebElement genderMale;
	
	public void selectMale() {
		genderMale.click();
	}

}
