package com.dyt.ors.screenpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class Editmaincategories extends WebLibrary {
	
	
	
	@FindBy(xpath="//input[@id='ors_mc_category_name']")
	public static WebElement input_MainCategoryName;
	
	@FindBy(xpath="//select[@id='ors_order']")
	public static WebElement select_AssignedOrder;
	
	@FindBy(xpath="//input[@name='catgImage']")
	public static WebElement edit_choosefile;
	
	@FindBy(xpath="//input[@value='Submit']")
	public static WebElement btn_submit;
	
	
	//===================================================
	public static boolean selectmaincategoryEditicon(String expValue) {
		boolean bStatus = false;
		try {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
		int trcount=rows.size();
		//System.out.println(trcount);
		
		for(int i=1; i<=trcount; i++) {
		String actValue=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+"]/td[3]")).getText();
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
	//=========================================================================================
	public static void editmaincategories(String MainCategory,String OrderValue,String strvalue) {
		
		boolean bStatus;
		
		
		
		
		bStatus = setValueEscape(input_MainCategoryName, MainCategory);
		Reporter.log(bStatus, "Main Categories name entered", "Main Categories name  not entered");
		
		bStatus = selectListItem(select_AssignedOrder, OrderValue);
		Reporter.log(bStatus, "Assigned value is selected", "Assigned value is not selected");
		
		//bStatus = uploadFile(WebElement elementFile, WebElement elementupload, String filepath);
		//Reporter.log(bStatus, "file has uploaded", "file has not uploaded");
		
		bStatus = clickElement(btn_submit);
		Reporter.log(bStatus, "submit button has clicked ", "submit button not clicked");
	}


      //======================================================================
	public static void VerifyeditMainCategories() {
		int rowcount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr")).size();
		 System.out.println("size" + rowcount);
		 boolean bStatus = false;
		 
		 for (int i=1;i<rowcount;i++) {
			 String MainCategory = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[" + i + "]/td[3]")).getText();
		 if (MainCategory.trim().equalsIgnoreCase("arthritis")) {
			 System.out.println("MainCategory is added" +  MainCategory);
			 bStatus = true;
			 break;
		 }
		 }
	}
}
		
