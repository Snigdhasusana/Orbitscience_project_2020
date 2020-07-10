package com.dyt.ors.regression;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class VerifyLot extends WebLibrary {
	
	@FindBy(xpath="//input[@id='lotNo']")
	public static WebElement entervalue;
	
	@FindBy(xpath="//i[@class='fas fa-search']")
	public static WebElement clicksearchicon;
		
		
//=======================================================		
	

public static void lotnumber(String value) {
	
boolean bStatus;
	
	
	bStatus = setEditValue(entervalue,value);
	Reporter.log(bStatus, "value has entered", "value has not entered not clicked");
	
	
	bStatus = clickElement(clicksearchicon);
	Reporter.log(bStatus, "searchicon clicked", "searchicon not clicked");
	
	}
}

