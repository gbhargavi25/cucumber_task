package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practice_hooks {

	@Given("^User opens the Application$")
	public void user_opens_the_application() {
		System.out.println("1.open the browser");
	}

	@When("^User enters valid product \"([^\"]*)\" into Search box field$")
	public void user_enters_valid_product_something_into_search_box_field(String validProduct) {
		System.out.println("entered valid product is:"+validProduct);
	}
	

	@And("^User clicks on Search button$")
	public void user_clicks_on_search_button() {
		System.out.println("clicked on search button");
	}

	@Then("^User should get valid product displayed in search results$")
	public void user_should_get_valid_product_displayed_in_search_results() {
		System.out.println("valid product is displayed");
	}

	@When("^User enters invalid product \"([^\"]*)\" into Search box field$")
	public void user_enters_invalid_product_something_into_search_box_field(String invalidProduct) {
		System.out.println("entered invalid product is:"+invalidProduct);
	}

	@Then("^User should get a message about no product matching$")
	public void user_should_get_a_message_about_no_product_matching() {
		System.out.println("displayed as no product found");
	}

	@When("^User dont enter any product name into Search box field$")
	public void user_dont_enter_any_product_name_into_search_box_field() {
		System.out.println("not entered any product");

	}
	@Then("User should close the application")
	public void User_should_close_the_application() {
		System.out.println("close the browser");
	}
}
