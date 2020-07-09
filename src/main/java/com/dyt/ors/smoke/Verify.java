package com.dyt.ors.smoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.generic.BaseClass;
import com.dyt.ors.screenpages.AddProducts;
import com.dyt.ors.screenpages.Dashboard;
import com.dyt.ors.screenpages.EditSubCategory;
import com.dyt.ors.screenpages.Home;
import com.dyt.ors.screenpages.Login;
import com.dyt.ors.screenpages.MainCategories;
import com.dyt.ors.screenpages.Subcategory;
import com.dyt.utilities.ExcelLib;


public class Verify extends BaseClass{
	
	@Test
	public static void TC001_navVerifyHomePage()
	{		
		
		Home home = PageFactory.initElements(driver, Home.class);
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		
		//Step 1: home page	
		homepage.navVerifyHomePage();
	}

	
	//================================================
	
	@Test
	public static void TC003_VerifyHomePage()
	{		
		
		Home home = PageFactory.initElements(driver, Home.class);
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		
		//Step 1: home page	
		homepage.navVerifyHomePage();
	}

	
	//================================================
	
	
	@Test
 	public static void TC008_AddProducts()
 	{		
    	String[] data = ExcelLib.getRowData("TC008_AddProducts", Smoke_Sheet);
 		Login login = PageFactory.initElements(driver, Login.class);
 		Home home = PageFactory.initElements(driver, Home.class);
 		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
 		AddProducts addProducts = PageFactory.initElements(driver, AddProducts.class);
 		AddProducts VerifyProduct = PageFactory.initElements(driver, AddProducts.class);
 		//Step 1: Login as an admin
 		
 				Home.navLoginpage();
 				login.loginApp(data[0],data[1]);
 				
 				//Step 2: navigate to Product page
 				
 				dashboard.navProducts();
 				
 				// step 3 add products
 				
 	
 				AddProducts.addProducts(data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15]);

 				AddProducts.VerifyProduct();
 	}
	
	
}
