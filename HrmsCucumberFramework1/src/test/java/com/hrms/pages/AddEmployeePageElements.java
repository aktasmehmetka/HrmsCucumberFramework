package com.hrms.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.utils.CommonMethods;



public class AddEmployeePageElements extends CommonMethods{


	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "middleName")
	public WebElement middleName;
	
	@FindBy(id = "lastName")
	public WebElement lastName;
	
	@FindBy(id = "chkLogin")
	public WebElement createLoginDetails;
	
	@FindBy(id = "user_name")
	public WebElement username;
	
	@FindBy(id = "user_password")
	public WebElement userPassword;
	
	@FindBy(id = "re_password")
	public WebElement confirmUserPassword;
	
	@FindBy(id = "btnSave")
	public WebElement saveBtn;
	
	@FindBy(id = "employeeId")
	public WebElement empId;
	
	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement personelDetail;
	
	@FindBy(name = "personal[txtEmployeeId]")
	public WebElement empIdSearch;
	
	@FindBy(xpath = "//span[@for='firstName']")
	public WebElement firstNameRequa;
	
	@FindBy(xpath = "//span[@for='lastName']")
	public WebElement lastNameRequa;
	
	public void personelDetail(String firstName1, String middleName1, String lastName1) {
		
		String actual=personelDetail.getText();
		String expected=firstName1+" "+middleName1+" "+lastName1;
		Assert.assertEquals(actual, expected);
	}

	public void personelDetail(WebElement firstName2, WebElement middleName2, WebElement lastName2) {
		
		String actual=personelDetail.getText();
		String expected=firstName2+" "+middleName2+" "+lastName2;
		Assert.assertEquals(actual, expected);
	}

}
