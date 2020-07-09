package com.dyt.ors.smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Searchproducts extends WebLibrary {
	
	@FindBy(xpath="//input[@name='searchRecord']")
	public static WebElement entervalue;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	public static WebElement clicksearchicon;
	
	
	
	@FindBy(xpath="//a[text()='chemical']")
	public static WebElement linkproductname;

//==================================

public static void productlist(String value) {
	
boolean bStatus;
	
	
	bStatus = setEditValue(entervalue,value);
	Reporter.log(bStatus, "value has entered", "value has not entered not clicked");
	
	
	bStatus = clickElement(clicksearchicon);
	Reporter.log(bStatus, "searchicon clicked", "searchicon not clicked");
	
	bStatus = clickElement(linkproductname);
	Reporter.log(bStatus, "product link is clicked", "productlink is  not clicked");
	
	
}
}

