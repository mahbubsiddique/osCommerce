package com.careerhack.steps;

import com.careerhack.common.OSComBase;
import com.careerhack.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OSQuickFind extends OSComBase{
	
	HomePage hp;
	
	@Given("^I am on OSCommerce homepage$")
	public void i_am_on_OSCommerce_homepage() {
		
		launchBrowser();
		
	}

	@When("^I enter a \"([^\"]*)\"$")
	public void i_enter_a(String arg1) {
		
		hp = new HomePage(driver);
		hp.enterQuickFind(arg1);				

	}

	@When("^I click on quick find icon$")
	public void i_click_on_quick_find_icon() {
		
		hp.clickQuickFind();

	}

	@Then("^I see related product list$")
	public void i_see_related_product_list() {

	}

	@When("^I click on the product$")
	public void i_click_on_the_product(){

	}

	@Then("^I see details of the selected product$")
	public void i_see_details_of_the_selected_product() {

	}

}
