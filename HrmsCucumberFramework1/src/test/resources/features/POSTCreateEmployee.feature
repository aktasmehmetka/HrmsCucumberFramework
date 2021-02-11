Feature: Validating Syntax HRMS API's
Background:
Given user generates token

@APITEST
Scenario: This test will check to see if an Employee is created
Given user calls createEmployee API
When User retrieves response 
Then status code is 201
Then user validates employee is created

@TestAPI
Scenario: This test will delete specific employee
Given user calls deleting employye API
When user retrieves delete response 
Then status code is 200
Then Then user validates employee is deleted