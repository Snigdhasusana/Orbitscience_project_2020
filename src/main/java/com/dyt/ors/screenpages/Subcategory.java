package com.dyt.ors.screenpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Subcategory extends WebLibrary {
	
	@FindBy(xpath="//span[text()='Products']")
	public static WebElement navlink_Products;	
	
	@FindBy(xpath="//a[text()='Sub Categories']")
	public static WebElement link_SubCategories;
	
	@FindBy(xpath="//a[@class='d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm']")
	public static WebElement button_AddSubCategories;
	
	@FindBy(xpath="//select[@id='mainCatgDropdown']")
	public static WebElement select_mainCatgDropdown;
	
	@FindBy(xpath="//input[@id='subCatgName']")
	public static WebElement edit_subCatgName;
	
	@FindBy(xpath="//select[@id='ors_sub_order']")
	public static WebElement select_Assignedorder;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement button_submit;
	
	//================ Add Sub Categories Methods ====================
	public static void AddSubCategories(String mainCatgName, String subCatgName,String Assignedorder) {
		boolean bStatus;
		
		//bStatus = clickElement(navlink_Products);
		//Reporter.log(bStatus, "Products nav link clicked", "Products nav link not clicked");
		
		//bStatus = clickElement(link_SubCategories);
		//Reporter.log(bStatus, "Sub Categories link clicked", "Sub Categories link not clicked");
		
		bStatus = clickElement(button_AddSubCategories);
		Reporter.log(bStatus, "Add Sub Categories link clicked", "Add Sub Categories link not clicked");
		
		bStatus = setEditValue(select_mainCatgDropdown,mainCatgName);
		Reporter.log(bStatus, "mainCatgDropdown selected", "mainCatgDropdown not selected");
		
		bStatus = setEditValue(edit_subCatgName,subCatgName);
		Reporter.log(bStatus, "subCatgName entered", "subCatgName not entered");
		
		bStatus = selectListItem(select_Assignedorder,Assignedorder);
		Reporter.log(bStatus, "orssuborder selected", "orssuborder not selected");
		
		bStatus = clickElement(button_submit);
		Reporter.log(bStatus, "submit button is clicked", "submit button not clicked");


}
	//=========================================================================
	public static void VerifySubCategories() {
		int rowcount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr")).size();
		 System.out.println("size" + rowcount);
		 boolean bStatus = false;
		 
		 for (int i=1;i<rowcount;i++) {
			 String Subcategorytext = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[" + i + "]/td[3]")).getText();
		 if (Subcategorytext.trim().equalsIgnoreCase("arthritis")) {
			 System.out.println("Subcategory is added" +  Subcategorytext);
			 bStatus = true;
			 break;
		 }
			 
		 }
		
		
	}
}

