package com.step;

import com.base.BaseClass;
import com.object.ObjectManager;

import io.cucumber.java.en.*;

public class FirstPagetStep extends BaseClass {
	
	ObjectManager manager = new ObjectManager();

	@Given("User launches the browser")
	public void user_launches_the_browser() {

		launchBrowser();

	}

	@Given("User loads the Flipkart Page")
	public void user_loads_the_flipkart_page() {
		loadurl();
	}

	@When("User enters the value {string} in the search field")
	public void user_enters_the_value_in_the_search_field(String string) {
		
		manager.getFirstPage().searchbox(string);

	}

	@When("User clicks on the search button")
	public void user_clicks_on_the_search_button() {
		
		manager.getFirstPage().clickSearchButton();

	}

	@Then("validate the first product in the list and print the model")
	public void validate_the_first_product_in_the_list_and_print_the_model() {

	}

}
