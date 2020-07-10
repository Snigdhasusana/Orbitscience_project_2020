package com.dyt.ors.screenpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class EditProducts extends WebLibrary {
	
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
	
	public static boolean selectproductEditicon(String expValue) {
		boolean bStatus = false;
		try {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
		int trcount=rows.size();
		//System.out.println(trcount);
		
		for(int i=1; i<=trcount; i++) {
		String actValue=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+"]/td[6]")).getText();
		System.out.println(actValue);
		if ((actValue.equals(expValue)))  {
			driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+"]/td[15]/a[1]/i")).click();
			break;
			}
		}
		}
		
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
		
		
	}
	//===============================================================================
	public static void  editproduct(String CatNo, String ProductDescription,String EnterMake, String Prize,String ProductGrade,
            String Synonyms, String CasNo , String EnterPacSize, String Available,String HSCode , String Assignedorder , String ProductImage) {
		boolean bStatus;
		
		 	
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
	//=================================================================================
	public static void VerifyeditProduct() {
		
		int rowCount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr")).size();
		boolean bTag = false;
		String nextButtonClassName;
               //using next button 
		while (rowCount != 0) {
			nextButtonClassName = driver.findElement(By.id("dataTable_next")).getAttribute("class");
			for (int i = 1; i <= rowCount; i++) {
				String catText = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[" + i + "]/td[6]"))	.getText();
				if (catText.trim().equalsIgnoreCase("1234")) {
					bTag = true;
					break;
				} 

			} 

			if (bTag == false) {
				if (nextButtonClassName.contains("disabled")) {
					break;
				} else {

					// click on next button
					driver.findElement(By.xpath("//li[@id='dataTable_next']")).click();
					// again count the no. of rows
					rowCount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr")).size();
				}

			} else {
				break;
			}

		} 

		if (bTag == true)
			System.out.println("Result displayed in result table");
		else
			System.out.println("No result displayed in result table");

	}
		  
}

