package com.dyt.ors.screenpages;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	import com.dyt.generic.WebLibrary;
	import com.dyt.reports.Reporter;
	
	
	public class AddProducts extends WebLibrary{
	 
				
				@FindBy(xpath="//a[text()='Products']")
				public static WebElement link_Products;
				
				@FindBy(xpath="//a[text()=' Add Products']")
				public static WebElement button_AddProducts;
			
				@FindBy(xpath="//select[@id='ors_mc_id']")
				public static WebElement Select_MainCatergories;		
				
				@FindBy(xpath="//select[@id='subCatg']")
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
				
				@FindBy(xpath="//input[@id='prdImage']")
				public static WebElement edit_prdImage;
				
				@FindBy(xpath="//input[@id='prdSDS']")
				public static WebElement edit_prdSDS;
				
				@FindBy(xpath="//input[@id='prdPSS']")
				public static WebElement edit_prdPSS;
				
				@FindBy(xpath="//input[@id='ors_cao_lotNo']")
				public static WebElement edit_caolotNo;
				
				@FindBy(xpath="//input[@id='coaPDF']")
				public static WebElement edit_coaPDF;
				
				@FindBy(xpath="//input[@class='btn btn-success']")
				public static WebElement btn_submit;
				
							
			
			//=================Add Products methods=========================
			
			public static void addProducts(String MainCatergories,String  OrderValue, String CatNo, String ProductDescription,String EnterMake, String Prize,String ProductGrade,
					                       String Synonyms, String CasNo , String EnterPacSize, String Available,String HSCode , String Assignedorder , String ProductImage, String SDS, String PDS,String lotnum, String lotpdf) {
					                       
					                       
				boolean bStatus;
				
				
				bStatus = clickElement(button_AddProducts);
				Reporter.log(bStatus, "AddProducts link clicked", "AddProducts link not clicked");	
				
				bStatus = setEditValue(Select_MainCatergories,MainCatergories);
				Reporter.log(bStatus, "Main category Value entered", "Main category Value not entered");
				
				bStatus = setEditValue(Select_SubCategories,OrderValue);
				Reporter.log(bStatus, "SubCategories Value Selected", "SubCategories Value not Selected");
				
				bStatus = setEditValue(enter_CatNo, CatNo);
				Reporter.log(bStatus, "CatNo is entered", "CatNo is not entered");
				
				bStatus = setEditValue(edit_ProductDescription, ProductDescription );
				Reporter.log(bStatus, "ProductDescription is entered", "ProductDescription is not entered");
				
				bStatus = setEditValue(edit_ProductGrade, ProductGrade);
				Reporter.log(bStatus, "ProductGrade is entered", "ProductGrade is not entered");
				
				bStatus = setEditValue(edit_Synonyms, Synonyms);
				Reporter.log(bStatus, "Synonyms is entered", "Synonyms is not entered");
				
				bStatus = setEditValue(edit_CasNo, CasNo);
				Reporter.log(bStatus, "CasNo is entered", "CasNo is not entered");
			
				bStatus = setEditValue(edit_EnterMake, EnterMake );
				Reporter.log(bStatus, "EnterMake is entered", "EnterMake is not entered");
				
				bStatus = setEditValue(edit_EnterPacSize, EnterPacSize );
				Reporter.log(bStatus, "EnterPacSize is entered", "EnterPacSize is not entered");
				
				bStatus = setValueEscape(edit_Available, Available );
				Reporter.log(bStatus, "Available is entered", "Available is not entered");
				
				bStatus = setEditValue(edit_EnterHSCode,HSCode );
				Reporter.log(bStatus, "HSCode is entered", "HSCode is not entered");
				
				bStatus = setValueEscape(edit_ProductPrice, Prize );
				Reporter.log(bStatus, "Prize is entered", "Prize is not entered");
				
				bStatus = selectListItem(edit_Assignedorder, Assignedorder);
				Reporter.log(bStatus, "Assignedorder Value Selected", "Assignedorder Value not Selected");
				
				//bStatus = fileUpload(WebElement element, String strvalue);
				//Reporter.log(bStatus, "ProductImage Uploaded", "ProductImage not Uploaded");
				
				bStatus = fileUpload(edit_prdSDS, SDS);
				Reporter.log(bStatus, "SDS has  Uploaded", "SDS has not Uploaded");
				
				bStatus = fileUpload(edit_prdPSS, PDS);
				Reporter.log(bStatus, "SDS has  Uploaded", "SDS has not Uploaded");
				
				bStatus = setEditValue(edit_caolotNo,lotnum );
				Reporter.log(bStatus, "HSCode is entered", "HSCode is not entered");
				
				
				bStatus = fileUpload(edit_coaPDF, lotpdf);
				Reporter.log(bStatus, "lotno is   Uploaded", "lotno is  not Uploaded");
																				
				bStatus = clickElement(btn_submit);
				Reporter.log(bStatus, "submit button clicked", "submit button not clicked");

}

	
	
	//==================================================================================
			
			public static void VerifyProduct() {
				
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