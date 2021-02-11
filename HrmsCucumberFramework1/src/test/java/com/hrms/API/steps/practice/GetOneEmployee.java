package com.hrms.API.steps.practice;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetOneEmployee {

	@Test
	public void getOneEployee() {
		
		Response response=RestAssured.given().param("employee_id", "3552").contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4MjIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODAyMiwidXNlcklkIjoiMzAwIn0.3u4XTaPjhqqhMsTlL6Ebug_3Lstsxqx1VNc2LBHTBKs")
				.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");
		
		response.prettyPeek();
		
	}
}
