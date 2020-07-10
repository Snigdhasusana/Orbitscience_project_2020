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
	public static void TC004_addMainCategory()
	{		
		
		String[] data = ExcelLib.getRowData("TC004_addMainCategory", Smoke_Sheet);
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
	public static void TC005_Editmaincategories()
		{		
			
			String[] data = ExcelLib.getRowData("TC005_Editmaincategories", Smoke_Sheet);
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
			MainCategories maincategories = PageFactory.initElements(driver, MainCategories.class);
			Editmaincategories editmaincategories=PageFactory.initElements(driver,Editmaincategories.class);
			
			Home.navLoginpage();
			
			//Step 1: Login as an admin
			
			login.loginApp(data[0],data[1]);
			
			//Step 2: Navigate to Main Category page
			
			 dashboard.navMainCategories();
			 
			 Editmaincategories.editmaincategories(data[0],data[1],data[2]);
		
	
		}
			
	
	//======================================================================================================	
	
	@Test
	public static void TC006_Deletemaincategories()
		{		
			
			String[] data = ExcelLib.getRowData("TC005_Editmaincategories", Smoke_Sheet);
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
	public static void TC006_AddSubCategory()
		{		
			
			String[] data = ExcelLib.getRowData("TC006_AddSubCategory", Smoke_Sheet);
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
			Subcategory AddSubCategories = PageFactory.initElements(driver, Subcategory.class);
			
			Home.navLoginpage();
			
			login.loginApp(data[0],data[1]);
			
			dashboard.navSubCategories();
			
			Subcategory.AddSubCategories(data[2],data[3],data[4]);
			
}
//========================================================================================================

     @Test
   public static void TC007_EditSubCategory()
    {		
	
	String[] data = ExcelLib.getRowData("TC007_EditSubCategory", Smoke_Sheet);
	Login login = PageFactory.initElements(driver, Login.class);
	Home home = PageFactory.initElements(driver, Home.class);
	Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
	Subcategory AddSubCategories = PageFactory.initElements(driver, Subcategory.class);
	EditSubCategory editsubcategory = PageFactory.initElements(driver, EditSubCategory.class);
	Home.navLoginpage();
	
	login.loginApp(data[0],data[1]);
	
	dashboard.navSubCategories();
	
	EditSubCategory.editsubcategory(data[2],data[3],data[4]);
	
}
     
//===============================================================================================================
     
     @Test
 	public static void TC008_AddProducts()
 	{		
    	String[] data = ExcelLib.getRowData("TC008_AddProducts", Smoke_Sheet);
 		Login login = PageFactory.initElements(driver, Login.class);
 		Home home = PageFactory.initElements(driver, Home.class);
 		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
 		AddProducts addProducts = PageFactory.initElements(driver, AddProducts.class);
 		
 		//Step 1: Login as an admin
 		
 				Home.navLoginpage();
 				login.loginApp(data[0],data[1]);
 				
 				//Step 2: navigate to Product page
 				
 				dashboard.navProducts();
 				
 				// step 3 add products
 				
 				AddProducts.addProducts(data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15]);

 	}
//===============================================================================================================================
     
     @Test
 	public static void TC009_EditProducts()
 	{
    	String[] data = ExcelLib.getRowData("TC009_EditProducts", Smoke_Sheet);
 		Login login = PageFactory.initElements(driver, Login.class);
 		Home home = PageFactory.initElements(driver, Home.class);
 		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
 		EditProducts editproduct = PageFactory.initElements(driver, EditProducts.class);
 		
 		//Step 1: Login as an admin
 		
 				Home.navLoginpage();
                login.loginApp(data[0],data[1]);
 				
 				//Step 2: navigate to Product page
 				
 				dashboard.navProducts();
 				
 				// step 3 edit products
 				
 				AddProducts.addProducts(data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15]);
}
}
