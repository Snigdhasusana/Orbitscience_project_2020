package com.dyt.ors.regression;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class VerifyLogout extends WebLibrary {
	
	public static void defaultview() {
		
		boolean bStatus;
		ClickElement("//span[text()='Welcome, Admin']");
		
		bStatus= ClickElement("//a[@class='dropdown-item']/i[@class='fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400']");
		
		bStatus = ClickElement("//a[@class='btn btn-primary']");
		Reporter.log(bStatus,"successfully loggedout","successfully not loggedout");
		
	}

	
}
