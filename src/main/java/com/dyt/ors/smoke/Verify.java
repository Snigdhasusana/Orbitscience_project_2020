package com.dyt.ors.smoke;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.generic.BaseClass;
import com.dyt.ors.regression.VerifyLogout;
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
    	public static void TC0019_Logout()
    	{	
    		
    		Login login = PageFactory.initElements(driver, Login.class);
    		Home home = PageFactory.initElements(driver, Home.class);
    		VerifyLogout defaultview = PageFactory.initElements(driver, VerifyLogout.class);
    		
    		Home.navLoginpage();
    		
    		login.loginApp("admin","admin@123");
    		
    		VerifyLogout.defaultview();
    	}
        
	
	
}
