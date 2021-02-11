package com.hrms.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement personelDetail;

	@FindBy(id = "empPic")
	public WebElement empPicture;

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement nameOnPicture;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement empId;

	@FindBy(id = "btnSave")
	public WebElement edit_saveBtn;

	@FindBy(xpath = "//input[@name='personal[optGender]']")
	public List<WebElement> gender;

	@FindBy(id = "personal_txtLicenNo")
	public WebElement licenNo;

	@FindBy(id = "personal_txtLicExpDate")
	public WebElement licExpDate;

	@FindBy(id = "personal_txtNICNo")
	public WebElement SSN;

	@FindBy(id = "personal_txtSINNo")
	public WebElement SIN;

	@FindBy(id = "personal_cmbMarital")
	public WebElement maritalStatus;

	@FindBy(id = "personal_cmbNation")
	public WebElement nationality;

	@FindBy(id = "personal_DOB")
	public WebElement DOB;

	@FindBy(xpath = "//label[contains(@for, 'personal_optGender')]")
	public List<WebElement> genderLabels;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void personelDetail(String firstName1, String middleName1, String lastName1) {

		String actual = personelDetail.getText();
		String expected = firstName1 + " " + middleName1 + " " + lastName1;
		Assert.assertEquals(actual, expected);
	}
}
