package com.dyt.ors.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class EditProducts extends WebLibrary {
	@FindBy(xpath="//a[text()='Products']")
	public static WebElement link_Products;
	
	@FindBy(xpath="//table[@id='dataTable']/tbody/tr[8]/td[15]/a[1]/i")
	public static WebElement clickediticon;
	
	

	@FindBy(xpath="//select[@id='ors_mc_id']")
	public static WebElement Select_MainCatergories;		
	
	@FindBy(xpath="//select[@name='ors_sub_id']")
	public static WebElement Select_SubCategories;

	@FindBy(xpath="//input[@id='catNo']")
	public static WebElement enter_CatNo;		

	@FindBy(xpath="//input[@id='prdDesc']")
	public static WebElement edit_ProductDescription;
	
	@FindBy(xpath="//input[@id='prdGrade']")
	public static WebElement edit_ProductGrade;
	
	@FindBy(xpath="//input[@id='prdSynon']")
	public static WebElement edit_Synonyms;
	
	@FindBy(xpath="//input[@id='prdCasNo']")
	public static WebElement edit_CasNo;
	
	@FindBy(xpath="//input[@id='prdMake']")
	public static WebElement edit_EnterMake;	
			
	@FindBy(xpath="//input[@id='prdPack']")
	public static WebElement edit_EnterPacSize;
	
	@FindBy(xpath="//input[@id='ors_prds_avalibility']")
	public static WebElement edit_Available;
	
	@FindBy(xpath="//input[@name='ors_prds_HS_code']")
	public static WebElement edit_EnterHSCode;
	
	@FindBy(xpath="//input[@id='prdPrize']")
	public static WebElement edit_ProductPrice;		
	
	@FindBy(xpath="//select[@name='ors_prds_orderBy']")
	public static WebElement edit_Assignedorder;
	
	@FindBy(xpath="//input[@name='prdImage']")
	public static WebElement ADD_ProductImage;
	
	@FindBy(xpath="//input[@value='Submit']")
	public static WebElement Submit_button;

	
	//================================================================================
	
	public static void  editproduct(String MainCatergories,String  OrderValue, String CatNo, String ProductDescription,String EnterMake, String Prize,String ProductGrade,
            String Synonyms, String CasNo , String EnterPacSize, String Available,String HSCode , String Assignedorder , String ProductImage) {
		boolean bStatus;
		
	bStatus = clickElement(clickediticon);
	Reporter.log(bStatus, "edit icon clicked", "edit icon  not clicked");
		
	bStatus = setEditValue(Select_MainCatergories,MainCatergories);
	Reporter.log(bStatus, "Main category Value entered", "Main category Value not entered");
	
	bStatus = setEditValue(Select_SubCategories,OrderValue);
	Reporter.log(bStatus, "SubCategories Value Selected", "SubCategories Value not Selected");
	
	bStatus = setValueEscape(enter_CatNo, CatNo);
	Reporter.log(bStatus, "CatNo is entered", "CatNo is not entered");
	
	bStatus = setValueEscape(edit_ProductDescription, ProductDescription );
	Reporter.log(bStatus, "ProductDescription is entered", "ProductDescription is not entered");
	
	bStatus = setValueEscape(edit_ProductGrade, ProductGrade);
	Reporter.log(bStatus, "ProductGrade is entered", "ProductGrade is not entered");
	
	bStatus = setValueEscape(edit_Synonyms, Synonyms);
	Reporter.log(bStatus, "Synonyms is entered", "Synonyms is not entered");
	
	bStatus = setValueEscape(edit_CasNo, CasNo);
	Reporter.log(bStatus, "CasNo is entered", "CasNo is not entered");

	bStatus = setValueEscape(edit_EnterMake, EnterMake );
	Reporter.log(bStatus, "EnterMake is entered", "EnterMake is not entered");
	
	bStatus = setValueEscape(edit_EnterPacSize, EnterPacSize );
	Reporter.log(bStatus, "EnterPacSize is entered", "EnterPacSize is not entered");
	
	bStatus = setValueEscape(edit_Available, Available );
	Reporter.log(bStatus, "Available is entered", "Available is not entered");
	
	bStatus = setValueEscape(edit_EnterHSCode,HSCode );
	Reporter.log(bStatus, "HSCode is entered", "HSCode is not entered");
	
	bStatus = setValueEscape(edit_ProductPrice, Prize );
	Reporter.log(bStatus, "Prize is entered", "Prize is not entered");
	
	bStatus = selectListItem(edit_Assignedorder, Assignedorder);
	Reporter.log(bStatus, "Assignedorder Value Selected", "Assignedorder Value not Selected");
	
	//bStatus = uploadFile(Choose_Image,ADD_ProductImage, ProductImage);
	//Reporter.log(bStatus, "ProductImage Uploaded", "ProductImage not Uploaded");
		
				
	bStatus = clickElement(Submit_button);
	Reporter.log(bStatus, "submit button clicked", "submit button not clicked");

	}
}
