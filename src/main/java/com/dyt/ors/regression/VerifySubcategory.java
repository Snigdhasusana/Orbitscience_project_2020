package com.dyt.ors.regression;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class VerifySubcategory extends WebLibrary{
	
	public static void verifysubcategorypage() {
		boolean bStatus;
		
		bStatus = ClickElement("//a[@class='d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm']");
		
		if(bStatus) {
			Reporter.log(bStatus, "AddSubcategory link clicked", "AddSubcategory  link not clicked");
			
			if(Exist("//select[@id='mainCatgDropdown']")){
				Reporter.log(bStatus, "Maincategory name   Exists", "Maincategory name not Exists");
			}
			if(Exist("//input[@id='subCatgName']")){
				Reporter.log(bStatus, "subcategory name   Exists", "subcategory name not Exists");
				
			}
					
			if( Exist("//select[@id='ors_sub_order']")) {
				
				Reporter.log(bStatus, "Assigned order  Exists", "Assigned order name not Exists");
			}
			
		}
		
		bStatus = ClickElement("//input[@type='submit']");
				
		bStatus = checkAlert_Accept("OK");
		Reporter.log(bStatus,"Alert message is displayed","Alert message is not displayed");
		
	}
	
	}
