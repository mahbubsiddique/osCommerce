package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	//input[name='keywords']
	
	@FindBy(css="input[name='keywords']")
	WebElement edt_quickFind;
	
	public void enterQuickFind(String qSearch) {		
		edt_quickFind.sendKeys(qSearch);		
	}
	
	@FindBy(xpath="//input[@title=' Quick Find ']")
	WebElement btn_quickFind;
	
	public void clickQuickFind() {
		btn_quickFind.click();	
	}
	

}
