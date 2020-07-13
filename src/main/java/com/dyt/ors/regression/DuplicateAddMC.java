package com.dyt.ors.regression;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class DuplicateAddMC  extends WebLibrary {
	
	@FindBy(xpath="//input[@id='ors_mc_category_name']")
	public static WebElement input_MainCategoryName;
	
	@FindBy(xpath="//select[@id='ors_order']")
	public static WebElement select_AssignedOrder;
	
	@FindBy(xpath="//input[@name='catgImage']")
	public static WebElement edit_choosefile;
	
	@FindBy(xpath="//input[@value='Submit']")
	public static WebElement btn_submit;
	
	//===================================================
	
	public static void duplicatemaincategories(String MainCategory,String OrderValue) {
		
		boolean bStatus;
		
		bStatus = setValueEscape(input_MainCategoryName, MainCategory);
		Reporter.log(bStatus, "Main Categories name entered", "Main Categories name  not entered");
		
		bStatus = selectListItem(select_AssignedOrder, OrderValue);
		Reporter.log(bStatus, "Assigned value is selected", "Assigned value is not selected");
		
		//bStatus = uploadFile(WebElement elementFile, WebElement elementupload, String filepath);
		//Reporter.log(bStatus, "file has uploaded", "file has not uploaded");
		
		bStatus = clickElement(btn_submit);
		Reporter.log(bStatus, "submit button has clicked ", "submit button not clicked");

		if(Exist("//span[text()=' Error: Main Category Name was already exist']"))
			Reporter.log(bStatus, "already exist message displayed", "already existr message not displayed");
		
		
	}

}