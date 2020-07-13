package com.dyt.ors.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.generic.BaseClass;
import com.dyt.ors.screenpages.AddProducts;
import com.dyt.ors.screenpages.Dashboard;
import com.dyt.ors.screenpages.EditProducts;
import com.dyt.ors.screenpages.EditSubCategory;
import com.dyt.ors.screenpages.Editmaincategories;
import com.dyt.ors.screenpages.Home;
import com.dyt.ors.screenpages.Login;
import com.dyt.ors.screenpages.MainCategories;
import com.dyt.ors.screenpages.Subcategory;
import com.dyt.ors.smoke.Searchproducts;
import com.dyt.utilities.ExcelLib;

public class AdminProducts extends BaseClass {
	
	@Test
	public static void TC001_verifymainmenu() {
		VerifyHomepage verifyhomepage= PageFactory.initElements(driver, VerifyHomepage.class);
		VerifyHomepage.Mainmenu();
		
		
	}
	
	//===============================================================
	
	@Test
	public static void TC002_Verifylogin()
	{		
		String[] data = ExcelLib.getRowData("TC002_Verifylogin", Regression_Sheet);
		Home home = PageFactory.initElements(driver, Home.class);
		
		VerifyLoginpage verifyLoginpage = PageFactory.initElements(driver, VerifyLoginpage.class);
		
		
		Home.navLoginpage();
		
		VerifyLoginpage.loginpage(data[0],data[1]);
		
	}
	
	//===========================================================================
	
	@Test
	public static void TC003_Login()
	{	
		String[] data = ExcelLib.getRowData("TC003_Login", Regression_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		
		Home.navLoginpage();
		
		login.loginApp(data[0],data[1]);
	}
	
	
	//======================================================================
	@Test
	public static void TC004_VerifyMainCategoryPage()
	{		
		
		String[] data = ExcelLib.getRowData("TC004_addMainCategory", Regression_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		VerifyMainCategory VerifyMainCategories = PageFactory.initElements(driver, VerifyMainCategory.class);
		
        Home.navLoginpage();
		
		login.loginApp(data[0],data[1]);
		
		//Step 2: Navigate to Main Category page
		
		 dashboard.navMainCategories();
		 
		 VerifyMainCategory.VerifyMainCategories();
		 
		 
		
		
	}

	//==============================================================================
	
	@Test
	public static void TC005_addMainCategory()
	{		
		
		String[] data = ExcelLib.getRowData("TC005_addMainCategory", Regression_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		MainCategories maincategories = PageFactory.initElements(driver, MainCategories.class);
		MainCategories addmaincategories=PageFactory.initElements(driver,MainCategories.class);
		MainCategories verifymaincategories = PageFactory.initElements(driver, MainCategories.class);		
		//Step 1: Login as an admin
		
		Home.navLoginpage();
		
		login.loginApp(data[0],data[1]);
		
		//Step 2: Navigate to Main Category page
		
		 dashboard.navMainCategories();
		
		maincategories.AddMainCategories(data[2],data[3],data[4]);
		maincategories.VerifyMainCategories();
		
	}
//======================================================================================================		
	@Test
	public static void TC006_Editmaincategories()
		{		
			
			String[] data = ExcelLib.getRowData("TC006_Editmaincategories", Regression_Sheet);
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
			MainCategories maincategories = PageFactory.initElements(driver, MainCategories.class);
			Editmaincategories editmaincategories=PageFactory.initElements(driver,Editmaincategories.class);
			Editmaincategories VerifyeditMainCategories = PageFactory.initElements(driver,Editmaincategories.class);
			
			Home.navLoginpage();
			
			//Step 1: Login as an admin
			
			login.loginApp(data[0],data[1]);
			
			//Step 2: Navigate to Main Category page
			
			 dashboard.navMainCategories();
			 
			 Editmaincategories.selectmaincategoryEditicon(data[2]);
			 
			 
			 Editmaincategories.editmaincategories(data[2],data[3],data[4]);
		     
			 Editmaincategories.VerifyeditMainCategories();
	
		}
			
	
	//======================================================================================================	
	
	@Test
	public static void TC007_verifyingDuplicateRecord()
	{		
		
		String[] data = ExcelLib.getRowData("TC007_verifyingDuplicateRecord", Regression_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		MainCategories maincategories = PageFactory.initElements(driver, MainCategories.class);
		DuplicateAddMC duplicatemaincategories = PageFactory.initElements(driver,DuplicateAddMC.class);
		
        Home.navLoginpage();
		
		login.loginApp(data[0],data[1]);
		
		//Step 2: Navigate to Main Category page
		
		 dashboard.navMainCategories();
		 DuplicateAddMC.duplicatemaincategories(data[0], data[1]);
		
		
	}
		
		
	//======================================================================================================
	@Test
	public static void TC008_Deletemaincategories()
		{		
			
			String[] data = ExcelLib.getRowData("TC008_Deletemaincategories", Regression_Sheet);
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
			MainCategories maincategories = PageFactory.initElements(driver, MainCategories.class);
			VerifyDeletemaincategory selectmaincategoryDeleteicon=PageFactory.initElements(driver,VerifyDeletemaincategory.class);
			
			Home.navLoginpage();
			
			//Step 1: Login as an admin
			
			login.loginApp(data[0],data[1]);
			
			//Step 2: Navigate to Main Category page
			
			 dashboard.navMainCategories();
			 
			 VerifyDeletemaincategory.selectmaincategoryDeleteicon(data[2]);
			 VerifyDeletemaincategory.Alertanddismiss();
			 
		
	
		}
	//=============================================================================================	
	
	@Test
	public static void TC009_AVerifySubCategoryPage()
		{		
			
			String[] data = ExcelLib.getRowData("TC009_AddSubCategory", Regression_Sheet);
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
			VerifySubcategory verifysubcategorypage = PageFactory.initElements(driver, VerifySubcategory.class);
			Home.navLoginpage();
			
			login.loginApp(data[0],data[1]);
			
			//Step 2: Navigate to Main Category page
			
			 dashboard.navMainCategories();
			
			VerifySubcategory.verifysubcategorypage();
		}
	
	//==============================================================================================
	@Test
	public static void TC0010_AddSubCategory()
		{		
			
			String[] data = ExcelLib.getRowData("TC0010_AddSubCategory", Regression_Sheet);
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
			Subcategory AddSubCategories = PageFactory.initElements(driver, Subcategory.class);
			Subcategory VerifySubCategories = PageFactory.initElements(driver, Subcategory.class);
			
			Home.navLoginpage();
			
			login.loginApp(data[0],data[1]);
			
			dashboard.navSubCategories();
			
			Subcategory.AddSubCategories(data[2],data[3],data[4]);
			Subcategory.VerifySubCategories();
			
}
//========================================================================================================

     @Test
   public static void TC0011_EditSubCategory()
    {		
	
	String[] data = ExcelLib.getRowData("TC0011_EditSubCategory", Regression_Sheet);
	Login login = PageFactory.initElements(driver, Login.class);
	Home home = PageFactory.initElements(driver, Home.class);
	Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
	Subcategory AddSubCategories = PageFactory.initElements(driver, Subcategory.class);
	EditSubCategory editsubcategory = PageFactory.initElements(driver, EditSubCategory.class);
	EditSubCategory VerifyeditSubCategories = PageFactory.initElements(driver, EditSubCategory.class);
	
	Home.navLoginpage();
	
	login.loginApp(data[0],data[1]);
	
	dashboard.navSubCategories();
	
	EditSubCategory.selectEditicon(data[3]);
	EditSubCategory.editsubcategory(data[2],data[3],data[4]);
	
	EditSubCategory.VerifyeditSubCategories();
	
}
     
//===============================================================================================================
     
     @Test
 	public static void TC0012_DuplicateSubCategoryRecord()
 		{		
 			
 			String[] data = ExcelLib.getRowData("TC0012_DuplicateSubCategoryRecord", Regression_Sheet);
 			Login login = PageFactory.initElements(driver, Login.class);
 			Home home = PageFactory.initElements(driver, Home.class);
 			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
 			DuplicateAddSC duplicateSubCategories = PageFactory.initElements(driver, DuplicateAddSC.class);
 			
            Home.navLoginpage();
			
			login.loginApp(data[0],data[1]);
			
			dashboard.navSubCategories();
			
			DuplicateAddSC.duplicateSubCategories(data[2], data[3],data[4]);
 			
 		}
   //===============================================================================================================  
     
     
     @Test
  	public static void TC0013_DeleteSubCategory()
  		{		
  			
  			String[] data = ExcelLib.getRowData("TC0013_DeleteSubCategory", Regression_Sheet);
  			Login login = PageFactory.initElements(driver, Login.class);
  			Home home = PageFactory.initElements(driver, Home.class);
  			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
  			
             VerifyDeleteSubcategory selectDeleteicon=PageFactory.initElements(driver,VerifyDeleteSubcategory.class);
			
			Home.navLoginpage();
			
			//Step 1: Login as an admin
			
			login.loginApp(data[0],data[1]);
			
			//Step 2: Navigate to Main Category page
			
			 dashboard.navMainCategories();
			 
			 VerifyDeleteSubcategory.selectDeleteicon(data[2]);
			 VerifyDeleteSubcategory.Alertanddismiss();
  		}
     //============================================================================================================
     @Test
  	public static void TC0014_VerifyProductsPage()
  	{		
     	String[] data = ExcelLib.getRowData("TC0014_VerifyProductsPage", Regression_Sheet);
  		Login login = PageFactory.initElements(driver, Login.class);
  		Home home = PageFactory.initElements(driver, Home.class);
  		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
  		VerifyProducts VerifyaddProducts = PageFactory.initElements(driver, VerifyProducts.class);
  		Home.navLoginpage();
		
		//Step 1: Login as an admin
		
		login.loginApp(data[0],data[1]);
		
		//Step 2: Navigate to Main Category page
		
		 dashboard.navMainCategories();
  		
  		VerifyProducts.VerifyaddProducts();
  	}
     
  //==================================================================================================================   
     @Test
 	public static void TC0015_AddProducts()
 	{		
    	String[] data = ExcelLib.getRowData("TC0015_AddProducts", Regression_Sheet);
 		Login login = PageFactory.initElements(driver, Login.class);
 		Home home = PageFactory.initElements(driver, Home.class);
 		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
 		AddProducts addProducts = PageFactory.initElements(driver, AddProducts.class);
 		AddProducts  VerifyProduct = PageFactory.initElements(driver, AddProducts.class);
 		
 		//Step 1: Login as an admin
 		
 				Home.navLoginpage();
 				login.loginApp(data[0],data[1]);
 				
 				//Step 2: navigate to Product page
 				
 				dashboard.navProducts();
 				
 				// step 3 add products
 				
 				AddProducts.addProducts(data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15]);
 				AddProducts.VerifyProduct();
 	}
//===============================================================================================================================
     
     @Test
 	public static void TC0016_EditProducts()
 	{
    	String[] data = ExcelLib.getRowData("TC0016_EditProducts", Regression_Sheet);
 		Login login = PageFactory.initElements(driver, Login.class);
 		Home home = PageFactory.initElements(driver, Home.class);
 		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
 		EditProducts selectproductEditicon = PageFactory.initElements(driver, EditProducts.class);
 		EditProducts editproduct = PageFactory.initElements(driver, EditProducts.class);
 		
 		
 		//Step 1: Login as an admin
 		
 				Home.navLoginpage();
                login.loginApp(data[0],data[1]);
 				
 				//Step 2: navigate to Product page
 				
 				dashboard.navProducts();
 				
 				// step 3 edit products
 				
 				EditProducts.selectproductEditicon(data[4]);
 				
 				EditProducts.editproduct(data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15]);
 				
 				EditProducts.VerifyeditProduct();
 	}


//==================================================================================================================
@Test
	public static void TC0017_DeleteProducts()
	{
	String[] data = ExcelLib.getRowData("TC0017_DeleteProducts", Regression_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);

        VerifyDeleteProducts selectproductDeleteicon=PageFactory.initElements(driver,VerifyDeleteProducts.class);
		
		Home.navLoginpage();
		
		//Step 1: Login as an admin
		
		login.loginApp(data[0],data[1]);
		
		//Step 2: Navigate to Main Category page
		
		 dashboard.navMainCategories();
		 
		 VerifyDeleteProducts.selectproductDeleteicon(data[4]);
		 VerifyDeleteProducts.Alertanddismiss();
	}
 	
//==============================================================================================================

          @Test
          public static void TC0018_verifyProductDetailPage() {
        	  
	      String[] data = ExcelLib.getRowData("TC0018_verifyProductDetailPage", Regression_Sheet);
	      
	      VerifyHomepage verifyhomepage= PageFactory.initElements(driver, VerifyHomepage.class);
	      
	      Searchproducts productlist =  PageFactory.initElements(driver, Searchproducts.class);
	      
	      VerifySearchproducts verifyproductname = PageFactory.initElements(driver, VerifySearchproducts.class);
	      
	      VerifyLot lotnumber = PageFactory.initElements(driver, VerifyLot.class);
	      
	      Searchproducts.productlist(data[0]);
	      
	      VerifySearchproducts.verifyproductname();
	      
	      VerifyLot.lotnumber(data[1]);
	      
	      
  }
 //===============================================================================================================
          @Test
      	public static void TC0019_Logout()
      	{	
      		String[] data = ExcelLib.getRowData("TC0019_Logout", Regression_Sheet);
      		Login login = PageFactory.initElements(driver, Login.class);
      		Home home = PageFactory.initElements(driver, Home.class);
      		VerifyLogout defaultview = PageFactory.initElements(driver, VerifyLogout.class);
      		
      		Home.navLoginpage();
      		
      		login.loginApp(data[0],data[1]);
      		
      		VerifyLogout.defaultview();
      	}
          
          
  
  }
