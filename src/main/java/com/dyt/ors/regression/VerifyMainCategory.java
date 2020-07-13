package com.dyt.ors.regression;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class VerifyMainCategory extends WebLibrary {
	
	public static void VerifyMainCategories()   {
		boolean bStatus;
		
		bStatus = ClickElement("//a[text()=' Add Main Categories']");
	
		if (bStatus)
		{
			Reporter.log(bStatus, "add Main Categories link clicked", "add Main Categories link not clicked");
			
			
			//Step 3 of the TC, verify the elements presence on page
			if(Exist("//a[text()=' Add Main Categories']") ) {
				Reporter.log(bStatus, "Add Main Categories button is Exists", "Add Main Categories button is not Exists");
			}
			if(Exist("//input[@id='ors_mc_category_name']") ) {
				Reporter.log(bStatus, "MainCategoryName is Exists", "MainCategoryName is not Exists");
			}
			if(Exist("//select[@id='ors_order']") ) {
				Reporter.log(bStatus, "AssignedOrder is Exists", "AssignedOrder is not Exists");
			}
	
			
			bStatus = ClickElement("//input[@value='Submit']");
			Reporter.log(bStatus, "Submit button clicked", "Submit button not clicked");
			
			if(Exist("//span[@id='ors_mc_category_name.errors']"))
			Reporter.log(bStatus, "error message displayed", "error message not displayed");
			
}
	}
}


