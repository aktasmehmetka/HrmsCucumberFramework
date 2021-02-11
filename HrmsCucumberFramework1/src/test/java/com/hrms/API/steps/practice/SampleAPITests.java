package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

import com.hrms.utils.APIConstants;

public class SampleAPITests {
	
	/**
	 * Below are hard coded examples using REST assured
	 * 
	 */

	// @Test
	public void getAllJobTitles() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTE3NjgzNjcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxMTgxMTU2NywidXNlcklkIjoiMjI0In0.MByfYnK_8rVB4yF5-ra8o9qlVxKJRe99EgCepou_I9Q")
				.when().get("http://3.237.189.167/syntaxapi/api/jobTitle.php");

		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

	// @Test
	public void getOneEmployee() {

		Response response = RestAssured.given().param("employee_id", "4355").contentType("application/json").header(
				"Authorization",
				SyntaxAPIAuthenticationSteps.Token)
				.when().get(APIConstants.GET_ONE_EMPLOYEE_URI);

		response.prettyPrint();

	}

	/*
	 * TASK: getAllEmployeeStatuses Pretty print print status code
	 * 
	 */

	 //@Test
	public void getALLEmployeeStatuses() {

		 Response response= RestAssured.given().contentType("application/json").header("Authorization",
				SyntaxAPIAuthenticationSteps.Token)
				.when().get(APIConstants.GET_EMPLOYEE_STATUS_URI);
		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();

		System.out.println(actualStatusCode);
	}

	@Test
	public void createEmployee() {

		Response response = RestAssured.given().urlEncodingEnabled(true).header("Authorization",
				SyntaxAPIAuthenticationSteps.Token)

		.param("emp_firstname", "newName")
		.param("emp_lastname", "employee")
		.param("emp_middle_name", "syntax")
		.param("emp_gender", "2")
		.param("emp_birthday", "1991-04-22")
		.param("emp_status", "Employee")
		.param("emp_job_title", "Developer")
		.contentType("application/json")
				.when().post(APIConstants.CREATE_EMPLOYEE_URI);

		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);

	}

}