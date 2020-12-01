package com.careerhack.steps;

import com.careerhack.common.OSComBase;
import com.careerhack.pages.HomePage;
import com.careerhack.pages.NewAccountPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAccount extends OSComBase{
	
	HomePage hp;
	NewAccountPage nap;
	
	@Given("^I am on OS Commerce homepage$")
	public void i_am_on_OS_Commerce_homepage(){
		
		launchBrowser();

	}

	@When("^I click on My Account button$")
	public void i_click_on_My_Account_button(){
		hp = new HomePage(driver);
		hp.clickMyAccount();
		
	}

	@When("^I click on continue button from new customer section$")
	public void i_click_on_continue_button_from_new_customer_section() {
		hp.clickContinueNewCustomer();

	}

	@Then("^I see My Account Information Page$")
	public void i_see_My_Account_Information_Page()  {


	}

	@When("^I select Male or Female radio button$")
	public void i_select_Male_or_Female_radio_button()  {
		
		nap = new NewAccountPage(driver);
		nap.selectMale();

	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String arg1, String arg2, String arg3, String arg4)  {

	}

	@When("^I select a country from the drop down$")
	public void i_select_a_country_from_the_drop_down()  {

	}

	@When("^I click continue$")
	public void i_click_continue()  {

	}

	@Then("^I see a pop up error message$")
	public void i_see_a_pop_up_error_message()  {

	}


}//end of class
