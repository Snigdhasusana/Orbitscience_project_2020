package com.dyt.ors.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class VerifyHomepage extends WebLibrary {
	
	public static void Mainmenu()   {
		boolean bStatus;
		
		bStatus = ClickElement("//a[@class='nav-link']");
		
		if (bStatus)
		{
			Reporter.log(bStatus, "Home link clicked", "Home link not clicked");
			
			
			//Step 3 of the TC, verify the elements presence on page
			if(Exist("//li[@class='nav-item']") ) {
				Reporter.log(bStatus, "AboutOrbit is Exists", "AboutOrbit is not Exists");
			}
			if( Exist("//a[text()='Products']")) {
				Reporter.log(bStatus, "products is Exists", "products is not Exists");
				
			}
			if(Exist("//a[text()='COA']")) {
				Reporter.log(bStatus, "COA is Exists", "COA is not Exists"); 
				}
			if(Exist("//a[text()='Literatures']")) {
				Reporter.log(bStatus, "Literatures is Exists", "Literatures is not Exists");
					
				}
			if( Exist("//a[@class='nav-link']/following::li/a[text()='Contact Us']"))
				{
								
			Reporter.log(bStatus, "Contact Us tabs are clicked", "Contact Us  tabs are not clicked");
			     }
				
			if(Exist("//a[text()='Login']") ) {
			Reporter.log(bStatus, "login link Exists", "login link  is not Exists");
			}
			if(Exist("//a[text()= ='Register']") ) {
				Reporter.log(bStatus, "register link Exists", "register link  is not Exists");
				}
	}
	
     
	bStatus = ClickElement("//li[@class='nav-item']");
	Reporter.log(bStatus, "About orbit tab clicked", "About orbit tab not  clicked");
	if(Exist("//input[@name='searchRecord']")&&Exist("//i[@class='fa fa-search']")) {
	Reporter.log(bStatus, "search bar is available", "search bar is  not available");
		
	}
	
	
}
}
		
