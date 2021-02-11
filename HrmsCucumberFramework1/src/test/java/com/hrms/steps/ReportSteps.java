package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.ReportPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReportSteps extends CommonMethods{

	ReportPageElements report=new ReportPageElements();
			
			
;	@Given("I navigated to the Reports Page")
	public void i_navigated_to_the_Reports_Page() throws InterruptedException {
	   click(report.PIM);
	   Thread.sleep(3000);
	   click(report.reports);
	}

	@When("I enter invalid report")
	public void i_enter_invalid_report() {
	   sendText(report.search, "ahmetKaya");
	}

	@When("I click search button")
	public void i_click_search_button() {
	   click(report.sBton);
	}

	@Then("I see no record found message")
	public void i_see_no_record_found_message() {
	  boolean msg=report.message.isDisplayed();
	  System.out.println(msg);
	}

	@When("I enter valid report")
	public void i_enter_valid_report() {
	 sendText(report.search, "PIM Sample Report");
	}

	@Then("I see the search report is displayed")
	public void i_see_the_search_report_is_displayed() {
	  String actual=report.message.getText();
	  Assert.assertEquals(actual, "PIM Sample Report");
	}
}
