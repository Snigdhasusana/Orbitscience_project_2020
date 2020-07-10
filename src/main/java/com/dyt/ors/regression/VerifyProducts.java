package com.dyt.ors.regression;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class VerifyProducts extends WebLibrary{
	public static void VerifyaddProducts()   {
		boolean bStatus;
		
		
		bStatus= ClickElement("//a[text()=' Add Products']");
		
	
		if (bStatus)
		{
			Reporter.log(bStatus, "add Products link clicked", "add Products link not clicked");
			
			if(Exist("//select[@id='ors_mc_id']") ) {
				Reporter.log(bStatus, "Main Categories is Exists", "Main Categories is not Exists");
			}
			if(Exist("//select[@id='subCatg']") ) {
				Reporter.log(bStatus, "subCategoryName is Exists", "subCategoryName is not Exists");
			}
			if(Exist("//input[@id='catNo']") ) {
				Reporter.log(bStatus, "catNo is Exists", "catNo is not Exists");
			}
			if(Exist("//input[@id='prdDesc']") ) {
				Reporter.log(bStatus, "prdDesc is Exists", "prdDesc is not Exists");
			}
			if(Exist("//input[@id='prdGrade']") ) {
				Reporter.log(bStatus, "prdGrade is Exists", "prdGrade is not Exists");
			}
			if(Exist("//input[@id='prdSynon']") ) {
				Reporter.log(bStatus, "prdSynon is Exists", "prdSynon is not Exists");
			}
			if(Exist("//input[@id='prdCasNo']") ) {
				Reporter.log(bStatus, "prdCasNo is Exists", "prdCasNo is not Exists");
			}
			if(Exist("//input[@id='prdMake']") ) {
				Reporter.log(bStatus, "prdMake is Exists", "prdMake is not Exists");
			}
			if(Exist("//input[@id='prdPack']") ) {
				Reporter.log(bStatus, "prdPack is Exists", "prdPack is not Exists");
			}
			if(Exist("//input[@id='ors_prds_avalibility']") ) {
				Reporter.log(bStatus, "avalibility is Exists", "avalibility is not Exists");
			}
			if(Exist("//input[@name='ors_prds_HS_code']") ) {
				Reporter.log(bStatus, "HS_code is Exists", "HS_code is not Exists");
			}
			if(Exist("//input[@id='prdPrize']") ) {
				Reporter.log(bStatus, "prdPrize is Exists", "prdPrize is not Exists");
			}
			if(Exist("//select[@name='ors_prds_orderBy']") ) {
				Reporter.log(bStatus, "orderBy is Exists", "orderBy is not Exists");
			}
			
			if(Exist("//input[@name='prdImage']") ) {
				Reporter.log(bStatus, "orderBy is Exists", "orderBy is not Exists");
			
			bStatus = ClickElement("//input[@value='Submit']");
			
			bStatus = checkAlert_Accept("OK");
			Reporter.log(bStatus,"Alert message is displayed","Alert message is not displayed");
			
			
			
		

}
}
}
}
	


