package com.dyt.ors.screenpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class MainCategories extends WebLibrary {
	
	@FindBy(xpath="//a[text()=' Add Main Categories']")
	public static WebElement button_addMainCategory;
	
	@FindBy(xpath="//input[@id='ors_mc_category_name']")
	public static WebElement input_MainCategoryName;
	
	@FindBy(xpath="//select[@id='ors_order']")
	public static WebElement select_AssignedOrder;
	
	@FindBy(xpath="//input[@id='catgImage']")
	public static WebElement link_image;
	
	@FindBy(xpath="//input[@value='Submit']")
	public static WebElement btn_submit;	

//================ Methods ====================

public static void  AddMainCategories(String MainCategory,String OrderValue,String strvalue)  {
	boolean bStatus;
	
	
	bStatus = clickElement(button_addMainCategory);
	Reporter.log(bStatus, "addMainCategory link clicked", "addMainCategories link not clicked");
	
	bStatus = setEditValue(input_MainCategoryName, MainCategory);
	Reporter.log(bStatus, "Main Categories name entered", "Main Categories name  not entered");
	
	bStatus = selectListItem(select_AssignedOrder, OrderValue);
	Reporter.log(bStatus, "Assigned value is selected", "Assigned value is not selected");
	
	bStatus = fileUpload(link_image,strvalue);
	Reporter.log(bStatus, "file has uploaded", "file has not uploaded");
	
	bStatus = clickElement(btn_submit);
	Reporter.log(bStatus, "submit button has clicked ", "submit button not clicked");
}

	
	//====================================================================
	
	public static void VerifyMainCategories() {
		
		int rowcount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr")).size();
		 System.out.println("size" + rowcount );
		 
		  boolean bStatus= false;
		  
		  for(int i= 1;i<rowcount;i++) {
			  String maincategorytext = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[" +i+ "]/td[3]")).getText();
			  
			  if(maincategorytext.trim().equalsIgnoreCase("")) {
				  System.out.println("maincategory added is " + maincategorytext);
				   bStatus= true;
				  break;
				  
 
			  }
		  }
			  
		  }
		  
		  
		  
}	
	     