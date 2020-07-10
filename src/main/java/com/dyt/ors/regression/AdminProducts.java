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
	/*
	@Test
	public static void TC001_verifymainmenu() {
		VerifyHomepage verifyhomepage= PageFactory.initElements(driver, VerifyHomepage.class);
		VerifyHomepage.Mainmenu();
		
		
	}
	*/
	/*
	@Test
	public static void TC002_Verifylogin()
	{		
		String[] data = ExcelLib.getRowData("TC002_Verifylogin", Regression_Sheet);
		Home home = PageFactory.initElements(driver, Home.class);
		
		VerifyLoginpage verifyLoginpage = PageFactory.initElements(driver, VerifyLoginpage.class);
		
		
		Home.navLoginpage();
		
		VerifyLoginpage.loginpage(data[0],data[1]);
		
	}
	
	
	@Test
	public static void TC003_Login()
	{	
		String[] data = ExcelLib.getRowData("TC003_Login", Regression_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		
		Home.navLoginpage();
		
		login.loginApp(data[0],data[1]);
	}
	
	
	}

	
	

	@Test
	public static void TC001_addMainCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		MainCategories AddMainCategories=PageFactory.initElements(driver,MainCategories.class);
		Editmaincategories editmaincategory = PageFactory.initElements(driver,Editmaincategories.class);
		
		
		//Step 1: Login as an admin
		
		Home.navLoginpage();
		
		login.loginApp("admin","admin@123");
		
		//Step 2: Navigate to Main Category page
		
		 dashboard.navMainCategories();
		
		 MainCategories.AddMainCategories("cold", "D","value");
		Editmaincategories.editmaincategories("cold Act","Z","value");
		
		
		
		// Step n : Logout		
	}
	*/
	
	//=============================================

	@Test
	public static void TC004_addSubCategory()
	{	
		String[] data = ExcelLib.getRowData("TC004_addSubCategory", Regression_Sheet);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		//Subcategory AddSubCategories = PageFactory.initElements(driver, Subcategory.class);
		//EditSubCategory editsubcategory = PageFactory.initElements(driver, EditSubCategory.class);
		//VerifySubcategory verifysubcategorypage = PageFactory.initElements(driver, VerifySubcategory.class);
		VerifyDeleteSubcategory selectDeleteicon = PageFactory.initElements(driver, VerifyDeleteSubcategory.class);
		
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp(data[0],data[1]);
		
		//Step 2: navigate to Subcategory page
		
		dashboard.navSubCategories();
		//VerifySubcategory.verifysubcategorypage();
		
		
		 //Subcategory.AddSubCategories("cold", "fever", "D");
		//EditSubCategory.selectEditicon(data[2]);
		 //EditSubCategory.editsubcategory(data[3], data[4], data[5]);
		VerifyDeleteSubcategory.selectDeleteicon(data[2]);
		VerifyDeleteSubcategory.Alertanddismiss();
		
	
		 
		
	}
}
	//=============================================
	/*
	@Test
	public static void TC003_addProduct()
	{		
		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		AddProducts navAddProducts = PageFactory.initElements(driver, AddProducts.class);
		
		//Step 1: Login as an admin
		
				Home.navLoginpage();
				login.loginApp("admin","admin@123");
				
				//Step 2: navigate to Product page
				
				dashboard.navProducts();
				
				// step 3 add products
				
				AddProducts.addProducts("dolofar","tab-25" ,"1567", "pain relief", "22", "1000", "B", "pain killer", "1","4321", "100","5432","G", "ProductImage");
				
				
		
		
		
	}

	//=============================================
	
	@Test
	public static void TC004_EditProductDetails()
	{
		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		AddProducts navAddProducts = PageFactory.initElements(driver, AddProducts.class);
		EditProducts editproduct = PageFactory.initElements(driver, EditProducts.class);
		
		//Step 1: Login as an admin
		
				Home.navLoginpage();
				login.loginApp("admin","admin@123");
				
				//Step 2: navigate to Product page
				
				dashboard.navProducts();
				
				// step 3 edit  products
		EditProducts.editproduct("Acetonicpoly", "sample","1457","tab-30", "56", "1000","D", "tablet", "6598", "50","10", "A12E", "D", "ProductImage");
		
	}
	//=============================================
	
	
	
}
*/
