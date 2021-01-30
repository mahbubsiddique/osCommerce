package com.careerhack.steps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.careerhack.common.OSComBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Manufacturers extends OSComBase {

	@Given("^I am on OS Commerce HomePage$")
	public void i_am_on_OS_Commerce_HomePage() {

		launchBrowser();

	}

	@When("^I select Manufacturers dropdown$")
	public void i_select_Manufacturers_dropdown() {

	}

	@Then("^I see \"([^\"]*)\" text$")
	public void i_see_text(String arg1) {

	}

	@Then("^I find \"([^\"]*)\" list$")
	public void i_find_list(String mansList) {

		Select select = new Select(driver.findElement(By.name("manufacturers_id")));
		List<WebElement> op = select.getOptions();

		List<String> itemsList = new ArrayList<>();


		for (int i = 0; i < op.size(); i++) {
			String options = op.get(i).getText();
			//System.out.println(options);
			itemsList.add(options);
		}

		String[] itemsArray = new String[itemsList.size()];
		itemsArray = itemsList.toArray(itemsArray);
		System.out.println("===========Actual Content of the Dropdown =================");
		System.out.println(Arrays.toString(itemsArray));

		System.out.println("===========Expected Result before split =================");
		System.out.println(mansList);
		System.out.println("===========Expected Result after split =================");

		String[] cmansList = mansList.split(", ");
		System.out.println(Arrays.toString(cmansList));
		System.out.println("===========done split =================");
		
		Assert.assertEquals(itemsArray, cmansList);
	}

}
