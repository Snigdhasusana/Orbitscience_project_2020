  
package com.dyt.ors.smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class HomePage extends WebLibrary{
	
	//Elements
						
			@FindBy(xpath="//a[@class='nav-link']")
			public static WebElement navlink_Home;	
			
			@FindBy(xpath="//li[@class='nav-item']")
			public static WebElement link_AboutOrbit;
			
			@FindBy(xpath="//a[text()='Products']")
			public static WebElement link_Products;
			
			@FindBy(xpath="//a[text()='COA']")
			public static WebElement link_COA;
			
			@FindBy(xpath="//a[text()='Literatures']")
			public static WebElement link_Literatures;
			
			@FindBy(xpath="//a[@class='nav-link']/following::li/a[text()='Contact Us']")
			public static WebElement link_ContactUs;
			
			@FindBy(xpath="//a[text()='Register']")
			public static WebElement link_register;
			
			@FindBy(xpath="//a[text()='Login']")
			public static WebElement link_login;
			
			
			
			
			
			
			//================ Verify Home Page ====================
			
			public static void navVerifyHomePage() {
				boolean bStatus;
				
				
				bStatus = clickElement(navlink_Home);
				Reporter.log(bStatus, "Home link clicked", "Home link not clicked");
				
				bStatus = clickElement(link_AboutOrbit);
				Reporter.log(bStatus, "AboutOrbit link clicked", "AboutOrbit link not clicked");
				
				bStatus = clickElement(link_Products);
				Reporter.log(bStatus, "Products link clicked", "Products link clicked");
			
				bStatus = clickElement(link_COA);
				Reporter.log(bStatus, "COA link clicked", "COA link not clicked");
				
				bStatus = clickElement(link_Literatures);
				Reporter.log(bStatus, "Literatures link clicked", "Literatures link not clicked");
				
				bStatus = clickElement(link_ContactUs);
				Reporter.log(bStatus, "ContactUs link clicked", "ContactUs link not clicked");
				
				bStatus = clickElement(link_register);
				Reporter.log(bStatus, "Register link clicked", "Register link not clicked");
				
				bStatus = clickElement(link_login);
				Reporter.log(bStatus, "login link  clicked", "login link not clicked");
				
				
				
			
				

			}

	}



