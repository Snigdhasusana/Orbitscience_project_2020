package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Editmaincategories extends WebLibrary {
	
	@FindBy(xpath="//table[@id='dataTable']/tbody/tr[10]/td[5]/a[1]/i")
	public static WebElement clickediticon;
	
	@FindBy(xpath="//input[@id='ors_mc_category_name']")
	public static WebElement input_MainCategoryName;
	
	@FindBy(xpath="//select[@id='ors_order']")
	public static WebElement select_AssignedOrder;
	
	@FindBy(xpath="//input[@name='catgImage']")
	public static WebElement edit_choosefile;
	
	@FindBy(xpath="//input[@value='Submit']")
	public static WebElement btn_submit;
	
	//===================================================
	
	public static void editmaincategories(String MainCategory,String OrderValue,String strvalue) {
		
		boolean bStatus;
		
		bStatus = clickElement(clickediticon);
		Reporter.log(bStatus, "edit icon clicked", "edit icon  not clicked");
		
		bStatus = setValueEscape(input_MainCategoryName, MainCategory);
		Reporter.log(bStatus, "Main Categories name entered", "Main Categories name  not entered");
		
		bStatus = setValueEscape(input_MainCategoryName, MainCategory);
		Reporter.log(bStatus, "Main Categories name entered", "Main Categories name  not entered");
		
		bStatus = selectListItem(select_AssignedOrder, OrderValue);
		Reporter.log(bStatus, "Assigned value is selected", "Assigned value is not selected");
		
		//bStatus = uploadFile(WebElement elementFile, WebElement elementupload, String filepath);
		//Reporter.log(bStatus, "file has uploaded", "file has not uploaded");
		
		bStatus = clickElement(btn_submit);
		Reporter.log(bStatus, "submit button has clicked ", "submit button not clicked");

		
		
		
	}

}
