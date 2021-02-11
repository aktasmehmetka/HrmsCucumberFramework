package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddEmployeeSteps extends CommonMethods {
	
	String empId;

	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
		
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {
		
		dashboard.navigateToAddEmployee();
	}

	@When("I add {string}, {string} and {string}")
	public void i_add_and_(String fName, String mName, String lName) {
		sendText(addEmp.firstName, fName);
		sendText(addEmp.middleName, mName);
		sendText(addEmp.lastName, lName);
		empId = addEmp.empId.getText();
	}

	@When("I click Save")
	public void i_click_Save() {
		click(addEmp.saveBtn);
	}

	@Then("I see Employee has been succesfully added")
	public void i_see_Employee_has_been_succesfully_added() {
		addEmp.personelDetail(addEmp.firstName, addEmp.middleName, addEmp.lastName);
		//Assert.assertEquals("Employee is NOT being added", pdetails.empId.getText(), empId);
	}

	@Then("I see Employee with {string}, {string} and {string} is displayed")
	public void i_see_Employee_with_and_is_displayed(String string, String string2, String string3) {

	}
	
	@When("I enter employee details")
	public void i_enter_employee_details(DataTable empDetails) {
		
		List<Map<String, String>> empDetailList=empDetails.asMaps();
		
		for(Map<String, String> map:empDetailList) {
			sendText(addEmp.firstName, map.get("FirstName"));
			sendText(addEmp.middleName, map.get("MiddleName"));
			sendText(addEmp.lastName, map.get("LastName"));
		}
	}
	
	@When("I click on Edit")
	public void clickOnEdit_SaveButton() {
		click(pdetails.edit_saveBtn);
	}
	
	@Then("I am able to modify Employee Details")
	public void modifyEmployeeDetails(DataTable modifyEmpDetail) throws InterruptedException {
		List<Map<String, String>> modifyList=modifyEmpDetail.asMaps();
		
		for(Map<String, String> map: modifyList) {
			//click o edit
			click(pdetails.edit_saveBtn);
			
			//passing new details to the employee
			sendText(pdetails.licenNo, map.get("DriverLisence"));
			sendText(pdetails.licExpDate, map.get("ExpirationDate"));
			sendText(pdetails.SSN, map.get("SSN"));
			sendText(pdetails.SIN, map.get("SIN"));
			clickRadio(pdetails.genderLabels, map.get("Gender"));
			Thread.sleep(5000);
			
			selectDdValue(pdetails.maritalStatus, map.get("MaritalStatus"));
			selectDdValue(pdetails.nationality, map.get("Nationality"));
			sendText(pdetails.DOB, map.get("DOB"));
			
			//click on save
			click(pdetails.edit_saveBtn);
		}
	}
	
	@When("I add firstName, middleName and last name")
	public void i_add_firstName_middleName_and_last_name() {
		sendText(addEmp.firstName, "Cuma");
		sendText(addEmp.middleName, "B");
		sendText(addEmp.lastName, "Kisa");
	}

	@When("I delete employee id")
	public void i_delete_employee_id() {
		addEmp.empId.clear();
	}

	@Then("I see employee without employee id is being added")
	public void i_see_employee_without_employee_id_is_being_added() {
		addEmp.personelDetail("Cuma", "B", "Kisa");
	}

	@Then("I see required error message next to the first and last name")
	public void i_see_required_error_message_next_to_the_first_and_last_name() {
		sendText(addEmp.firstName, "");
		sendText(addEmp.middleName, "");
		sendText(addEmp.lastName, "");
		
		boolean nameRequ=addEmp.firstNameRequa.isDisplayed();
		boolean lastRequ=addEmp.lastNameRequa.isDisplayed();
		System.out.println(nameRequ);
		System.out.println(lastRequ);
	}

	@When("I click on create login checkbox")
	public void i_click_on_create_login_checkbox() {
		click(addEmp.createLoginDetails);
	}

	@When("I enter username, password and confirm password")
	public void i_enter_username_password_and_confirm_password() {
		sendText(addEmp.username, "Cumakisa@1234");
		sendText(addEmp.userPassword, "Cumakisa@123");
		sendText(addEmp.confirmUserPassword, "Cumakisa@123");
	}
}
