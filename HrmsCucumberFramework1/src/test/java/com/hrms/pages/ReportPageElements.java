package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.utils.CommonMethods;

public class ReportPageElements extends CommonMethods{

	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	public WebElement reports;
	
	@FindBy(xpath="//*[@id=\"search_search\"]")
	public WebElement search;
	
	@FindBy(className="searchBtn")
	public WebElement sBton;
	
	@FindBy(xpath="//table/tbody/tr/td[2]")
	public WebElement message;
	
	
	
}
