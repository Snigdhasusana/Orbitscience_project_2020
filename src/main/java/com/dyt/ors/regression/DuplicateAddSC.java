package com.dyt.ors.regression;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class DuplicateAddSC extends WebLibrary{
	@FindBy(xpath="//a[@class='d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm']")
	public static WebElement button_AddSubCategories;
	
	@FindBy(xpath="//select[@id='mainCatgDropdown']")
	public static WebElement select_mainCatgDropdown;
	
	@FindBy(xpath="//input[@id='subCatgName']")
	public static WebElement edit_subCatgName;
	
	@FindBy(xpath="//select[@id='ors_sub_order']")
	public static WebElement select_Assignedorder;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement button_submit;
	
	//================ Add Sub Categories Methods ====================
	public static void duplicateSubCategories(String mainCatgName, String subCatgName,String Assignedorder) {
		boolean bStatus;
		
		bStatus = clickElement(button_AddSubCategories);
		Reporter.log(bStatus, "Add Sub Categories link clicked", "Add Sub Categories link not clicked");
		
		bStatus = setEditValue(select_mainCatgDropdown,mainCatgName);
		Reporter.log(bStatus, "mainCatgDropdown selected", "mainCatgDropdown not selected");
		
		bStatus = setEditValue(edit_subCatgName,subCatgName);
		Reporter.log(bStatus, "subCatgName entered", "subCatgName not entered");
		
		bStatus = selectListItem(select_Assignedorder,Assignedorder);
		Reporter.log(bStatus, "orssuborder selected", "orssuborder not selected");
		
		bStatus = clickElement(button_submit);
		Reporter.log(bStatus, "submit button is clicked", "submit button not clicked");

		if(Exist("//span[text()=' Error: Sub Category Name was already exist']"))
			Reporter.log(bStatus, "already exist message displayed", "already existr message not displayed");
		


}
}


