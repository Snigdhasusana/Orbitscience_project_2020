package com.dyt.ors.screenpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class EditSubCategory extends WebLibrary{
	
	//@FindBy(xpath="//table[@id='dataTable']/tbody/tr[11]/td[5]/a[1]/i")
	//public static WebElement clickediticon;
	
	@FindBy(xpath="//select[@id='mainCatgDropdown']")
	public static WebElement input_MainCategoryName;
	
	@FindBy(xpath="//input[@id='subCatgName']")
	public static WebElement entersubcategory;
	
	@FindBy(xpath="//select[@id='ors_sub_order']")
	public static WebElement select_AssignedOrder;
	
	@FindBy(xpath="//input[@value='Submit']")
	public static WebElement btn_submit;
	
	//=========================================================
	
	public static boolean selectEditicon(String expValue) {
		boolean bStatus = false;
		try {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
		int trcount=rows.size();
		//System.out.println(trcount);
		
		for(int i=1; i<=trcount; i++) {
		String actValue=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+"]/td[2]")).getText();
		System.out.println(actValue);
		if ((actValue.equals(expValue)))  {
			driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+"]/td[5]/a[1]/i")).click();
			break;
			}
		}
		}
		
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
		
		
	}
	//===================================================================================================
	public static void editsubcategory(String MainCategory, String SubCategory, String AssignedOrder) {
		boolean bStatus;
		
		//bStatus = clickElement(clickediticon);
		//Reporter.log(bStatus, "edit icon clicked", "edit icon  not clicked");
		
		bStatus = selectListItem(input_MainCategoryName, MainCategory);
		Reporter.log(bStatus, "Main Categories name entered", "Main Categories name  not entered");
		
		bStatus =setValueEscape(entersubcategory, SubCategory);
		Reporter.log(bStatus, "Main Categories name entered", "Main Categories name  not entered");
		
		bStatus = selectListItem(select_AssignedOrder, AssignedOrder);
		Reporter.log(bStatus, "Assigned value is selected", "Assigned value is not selected");
		
		bStatus = clickElement(btn_submit);
		Reporter.log(bStatus, "submit button has clicked ", "submit button not clicked");
		
		
	}
	
 //==============================================================================================
	public static void VerifyeditSubCategories() {
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


