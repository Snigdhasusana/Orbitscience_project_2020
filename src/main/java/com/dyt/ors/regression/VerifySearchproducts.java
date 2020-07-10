package com.dyt.ors.regression;

import org.openqa.selenium.By;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class VerifySearchproducts extends WebLibrary{
	
	public static void verifyproductname() {
		
		boolean bStatus;
		bStatus = ClickElement("//i[@class='fa fa-search']");
		if(bStatus) {
			Reporter.log(bStatus, "search icon clicked", "search icon  not clicked");
		
		if(Exist("//table/tbody/tr/td[text()='Product Name']")){
			Reporter.log(bStatus, "product name   Exists", "product name not Exists");
		}
		if(Exist("//table/tbody/tr[2]/td[text()='Grade']")){
			Reporter.log(bStatus, "grade   Exists", "grade  not Exists");
		}
		if(Exist("//table/tbody/tr[3]/td[text()='Availability']")){
			Reporter.log(bStatus, "Availability Exists", "Availability not Exists");
		}
		
		bStatus= ClickElement("//a[text()='yyyyyyyyy']");
		
		if(Exist("//span[text()='Synonym: ']")){
			Reporter.log(bStatus, "Synonym Exists", "Synonym not Exists");
		}
		
		if(Exist("//span[text()='CAS Number: ']")){
			Reporter.log(bStatus, "CAS Number Exists", "CAS Number not Exists");
		}
		
		if(Exist("//table[@class='table table-hover']/thead/tr/th[1]")&&Exist("//table[@class='table table-hover']/thead/tr/th[2]")&&Exist("//table[@class='table table-hover']/thead/tr/th[3]")
				&&Exist("//table[@class='table table-hover']/thead/tr/th[4]")&&Exist("//table[@class='table table-hover']/thead/tr/th[5]")&&Exist("//table[@class='table table-hover']/thead/tr/th[6]"))
		{
			Reporter.log(bStatus, "s.no,cat no,packing unit, price, availablity,quantity Exists", "s.no,cat no,packing unit, price, availablity,quantity not Exists");
		}
		
		bStatus= ClickElement("//a[text()='123D1']");
		Reporter.log(bStatus, "link is clicked ", "click is not clicked ");
		
		bStatus= ClickElement("//a[text()='FAAVIPIRAVIRES']");
		Reporter.log(bStatus, "link is clicked ", "click is not clicked ");
		
		if(Exist("//table/tbody/tr[1]/td/i[@class='fas fa-download']"));
		Reporter.log(bStatus, "SDS(PDF) exists", "SDS(PDF) not exists");
		
		if(Exist("//table/tbody/tr[2]/td/i[@class='fas fa-download']"));
		Reporter.log(bStatus, "Specification exists", "Specification not exists");
		
		if(Exist("//span[text()='COA (Certificate of Analysis)']"));
		Reporter.log(bStatus, "COA exists", "COA not exists");
		
		if(Exist("//i[@class='fas fa-search']"));
		Reporter.log(bStatus, "COA search exists", "COA search not exists");
		
		bStatus= ClickElement("//a[@href='/ORS_SIT/resources/pdf/products/SDS/_SDS.pdf ']");
		Reporter.log(bStatus, "link is clicked ", "click is not clicked ");
		
		bStatus= ClickElement("//a[@href='/ORS_SIT/resources/pdf/products/PSS/_PSS.pdf']");
		Reporter.log(bStatus, "link is clicked ", "click is not clicked ");
		
		
		
		
	}

	}
}
