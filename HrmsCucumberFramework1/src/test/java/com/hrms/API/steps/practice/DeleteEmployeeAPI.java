package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import com.hrms.utils.APIConstants;
import com.hrms.utils.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DeleteEmployeeAPI {

	private Response response;
	private static RequestSpecification request;
	
	@Given("user calls deleting employye API")
	public void user_calls_deleting_employye_API() {
	    request= given().param("employee_id", "3673").contentType(ContentType.JSON)
	    		.header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}

	@When("user retrieves delete response")
	public void user_retrieves_delete_response() {
	    response= request.delete(APIConstants.DELETE_URI);
	    response.prettyPrint();
	}

	@Then("Then user validates employee is deleted")
	public void then_user_validates_employee_is_deleted() {
	    boolean istrue=response.body().toString().contentEquals("Entry deleted");
	    Assert.assertTrue("Employee do not deleted", istrue);
	}
}
