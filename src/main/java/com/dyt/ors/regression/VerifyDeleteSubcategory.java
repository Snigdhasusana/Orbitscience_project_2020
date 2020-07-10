package com.dyt.ors.regression;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.generic.WebLibrary;
import com.dyt.reports.Reporter;

public class VerifyDeleteSubcategory extends WebLibrary{
	
	
		public static boolean selectDeleteicon(String expValue) {
			boolean bStatus = false;
			try {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
			int trcount=rows.size();
			//System.out.println(trcount);
			
			for(int i=1; i<=trcount; i++) {
			String actValue=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(actValue);
			if ((actValue.equals(expValue)))  {
				driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+"]/td[5]/a[2]/i")).click();
				break;
				}
			}
			}
			
			catch(Exception e) {
				bStatus = false;
			}
			return bStatus;
			}
		


   public static void Alertanddismiss() {
	   boolean bStatus;
	   //bStatus = checkAlert_Accept("ok");
	//	Reporter.log(bStatus,"Alert message is displayed","Alert message is not displayed");
		bStatus = checkAlert_Dismiss("Cancel");
		Reporter.log(bStatus,"Alert message is displayed","Alert message is not displayed");
		
	   
   }
}
