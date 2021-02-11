package com.hrms.steps;

import org.junit.Assert;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {

	//LoginPageElements login= new LoginPageElements();

	@Given("I open bowser and navigated to the HRMS")
	public void i_open_bowser_and_navigated_to_the_HRMS() {
		BaseClass.setUp();
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		//login = new LoginPageElements();
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.loginBtn);
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
		System.out.println("I am logged in");
	}

	@When("I enter valid username invalid passowrd")
	public void i_enter_valid_username_invalid_passowrd() {
		//login = new LoginPageElements();
		sendText(login.username, "Admin");
		sendText(login.password, "5554");
	}

	@Then("I see error message")
	public void i_see_error_message() {
		boolean error = login.errorMsg.isDisplayed();
		Assert.assertTrue("Error message is not displayed", error);

	}

	@Then("I close browser")
	public void i_close_browser() {
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		sendText(login.username, string);
		sendText(login.password, string2);
	}

	@Then("I see {string}")
	public void i_see(String string) {
		String error = login.errorMsg.getText();
		Assert.assertEquals(string, error);
	}
}
