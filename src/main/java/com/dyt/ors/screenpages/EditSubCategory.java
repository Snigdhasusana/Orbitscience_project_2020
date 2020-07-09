package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class EditSubCategory extends WebLibrary{
	
	@FindBy(xpath="//table[@id='dataTable']/tbody/tr[11]/td[5]/a[1]/i")
	public static WebElement clickediticon;
	
	@FindBy(xpath="//select[@id='mainCatgDropdown']")
	public static WebElement input_MainCategoryName;
	
	@FindBy(xpath="//input[@id='subCatgName']")
	public static WebElement entersubcategory;
	
	@FindBy(xpath="//select[@id='ors_sub_order']")
	public static WebElement select_AssignedOrder;
	
	@FindBy(xpath="//input[@value='Submit']")
	public static WebElement btn_submit;
	
	//=========================================================
	
	public static void editsubcategory(String MainCategory, String SubCategory, String AssignedOrder) {
		boolean bStatus;
		
		bStatus = clickElement(clickediticon);
		Reporter.log(bStatus, "edit icon clicked", "edit icon  not clicked");
		
		bStatus = selectListItem(input_MainCategoryName, MainCategory);
		Reporter.log(bStatus, "Main Categories name entered", "Main Categories name  not entered");
		
		bStatus =setValueEscape(entersubcategory, SubCategory);
		Reporter.log(bStatus, "Main Categories name entered", "Main Categories name  not entered");
		
		bStatus = selectListItem(select_AssignedOrder, AssignedOrder);
		Reporter.log(bStatus, "Assigned value is selected", "Assigned value is not selected");
		
		bStatus = clickElement(btn_submit);
		Reporter.log(bStatus, "submit button has clicked ", "submit button not clicked");
		
		
	}
	

}
