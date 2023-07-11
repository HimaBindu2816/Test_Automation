package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Loginpage;

public class LoginPageStepDef {
	
	Loginpage loginpage = new Loginpage();

	@Given("user navigates to the Flipkart application")
	public void user_navigates_to_the_flipkart_application() {
		loginpage.intialization();
	}

	@Then("User verify and enters username and password")
	public void user_verify_and_enters_username_and_password() {
	   
	}

	@Then("User verify and click login button")
	public void user_verify_and_click_login_button() {
	   
	}

	@Then("login must be successful.")
	public void login_must_be_successful() {
	   
	}

}
