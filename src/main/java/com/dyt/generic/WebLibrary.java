package com.dyt.generic;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.dyt.ors.config.Config;
//================================================================
/*
Name			: WebLibrary
Description 	: It has all the reusable(generic) methods to work with web applications
Author			: DevelopYou Technologies
Date			: 08th June 2020
Modified Date	:
Modified By		:
*/
public class WebLibrary extends Config {	
	//================================================================	
	/*
	Name: setEditValue
	Description		: 	To set value to edit box
	Author			: 	DevelopYou Technologies
	Date			: 	08th June 2020
	Parameters		: 	elexpath -> edit box xpath, value -> Input value to edit box
	Modified Date	:	09th June 2020
	Modified By		:
	*/
	public static boolean setEditValue(WebElement element, String value) {
		boolean bStatus = true;
		try {
			highlight(element);
			element.sendKeys(value);
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//==================================================================
	public static boolean clickElement(WebElement element) {
		boolean bStatus = true;
		try {
			highlight(element);
			element.click();
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
	public static boolean verifyPageTitle(String expTitle) {
		boolean bStatus = false;
		try {
			String actTitle = driver.getTitle();
			if(actTitle.equals(actTitle)) bStatus = true;
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
	public static boolean verifycurrentURL(String expURL) {
		boolean bStatus = false;
		try {
			String actURL = driver.getCurrentUrl();
			if(actURL.equals(expURL)) bStatus = true;
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
	public static boolean verifyPagenameInURL(String pagename) {
		boolean bStatus = false;
		try {
			String currentURL = driver.getCurrentUrl();
			if(currentURL.contains(pagename)) bStatus = true;
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
		public static boolean mouseHover(WebElement element) {
			boolean bStatus = true;
			try {
				highlight(element);
				Actions act = new Actions(driver);				
				act.moveToElement(element).build().perform();
			}
			catch (Exception e) {
				bStatus = false;
			}
			return bStatus;
		}
	//=============================================================================
	public static boolean selectListItem(WebElement element, String item) {
		boolean bStatus = true;
		try {	
			highlight(element);		
			Select sc = new Select(element);
			sc.selectByVisibleText(item);
			
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//=============================================================================
		public static boolean selectListItemIndex(WebElement element, int index) {
			boolean bStatus = true;
			try {	
				highlight(element);
				Select sc = new Select(element);
				sc.selectByIndex(index);				
			}
			catch(Exception e) {
				bStatus = false;
			}
			return bStatus;
		}	
		
	//==================================================================================
		
		
		
	
		public static boolean selectListItemByValue(WebElement element, String value) {
			boolean bStatus = true;
			try {	
				highlight(element);
				Select sc = new Select(element);
				sc.selectByValue(value);
				
			}
			catch(Exception e) {
				bStatus = false;
			}
			return bStatus;
		}
	
	//==========================================================================================
	public static boolean setValueEscape(WebElement element,String value) {
		boolean bStatus = true;
		try {	
			highlight(element);
			element.clear();
			element.click();
			element.sendKeys(value);
			element.sendKeys(Keys.ESCAPE);			
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
	public static boolean verifyEditboxValue(WebElement element, String expValue) {
		boolean bStatus = false;
		try {
			highlight(element);
			String actValue = element.getAttribute("value");
			if ((actValue.equals(expValue))) {
				bStatus = true;
			}
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
	public static boolean verifyText(WebElement element) {
		boolean bStatus = false;
		try {
			highlight(element);
			boolean b = element.isDisplayed();
			if(b == true) bStatus = true;
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//================================================================================
	public static boolean isElementSelected(WebElement element, boolean expStatus) {
		boolean bStatus = false;
		try {
			highlight(element);
			boolean b = element.isSelected();
			if(b == expStatus) bStatus = true;
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//=============================================================================	
	public static boolean isElementDisplayed(WebElement element, boolean expStatus) {
		boolean bStatus = false;
		try {
			highlight(element);
			boolean b = element.isDisplayed();
			if(b == expStatus) bStatus = true;
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//=============================================================================
	public static boolean isElementEnabled(WebElement element, boolean expStatus) {
		boolean bStatus = false;
		try {
			highlight(element);
			boolean b = element.isEnabled();
			if(b == expStatus) bStatus = true;
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//=============================================================================
	/*
	Name: datePicker
	Description		: 	Open date picker and select date(month, year and day)
	Author			: 	DevelopYou Technologies
	Date			: 	08th June 2020
	Parameters		: 	imgElement -> image element to open date picker
					 	monthxpath -> month dropdown xpath
					 	yearxpath -> year dropdown xpath
					 	strdate -> date in format: dd-mmm-yyyy
	Modified Date	:	
	Modified By		:
	*/
	public static boolean datePicker(WebElement imgElement, String monthxpath, String yearxpath, String strdate) {
		boolean bStatus = false;
		try {			
			String[] arr = strdate.split("-");
			monthxpath = monthxpath+"/option[text()='"+arr[1]+"']";
			yearxpath = yearxpath+"/option[text()='"+arr[2]+"']";
			imgElement.click();			
			driver.findElement(By.xpath(monthxpath)).click();
			driver.findElement(By.xpath(yearxpath)).click();
			driver.findElement(By.xpath("//a[text()='"+arr[0]+"']")).click();			
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//=============================================================================
	public static boolean uploadFile(WebElement elementFile, WebElement elementupload, String filepath) {
		boolean bStatus = false;
		try {
			Actions act = new Actions(driver);			
			act.moveToElement(elementFile).click().build().perform();
					
			Thread.sleep(3000);			
			// create string object
			StringSelection strFile = new StringSelection(filepath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strFile, null);
			
			Robot robot = new Robot();
			
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    
		    Thread.sleep(3000);		    
			//Click on upload
		    elementupload.click();		
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	
	
	//=============================================================================	
	public static void highlight(WebElement element) {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;			
			   for (int iCnt=0; iCnt<3; iCnt++) 
			   {
			         js.executeScript("arguments[0].style.border='solid 4px black'", element);
			         Thread.sleep(200);
			         js.executeScript("arguments[0].style.border=''", element);
			         Thread.sleep(200);
			   }		
		}
		catch(Exception e) {
			System.out.println("Unable to highlight element" + element.getAttribute("name"));
		}
		
	}
	//=============================================================================
	public static boolean deleteCookies() {
		boolean bStatus = true;
		try {
			driver.manage().deleteAllCookies();		
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//=============================================================================
	public static String[] getListItems(WebElement element) {
		String[] arr = null;
		try {
			List<WebElement> items = element.findElements(By.tagName("option"));			
			int n = items.size();
			arr = new String[n];			
			for(int i=0; i<n; i++)
				arr[i] = items.get(i).getText();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	//=============================================================================
	public static boolean verifyListItems(WebElement element, String[] expItems) {
		boolean retval = false;
		
		
		return retval;		
	}
	//=============================================================================
	public static boolean dragAndDropElement(WebElement source, WebElement target) {
		boolean bStatus = true;
		try {
			Actions obj = new Actions(driver);
			obj.dragAndDrop(source, target).build().perform();		
		}
		catch(Exception e) {
			bStatus = false;
		}
		return bStatus;
	}
	//=============================================================================
	
	public static boolean swithToFrame(WebElement frame) {
		boolean bStatus = true;
		try {
			driver.switchTo().frame(frame);
		}
		catch(Exception e) {
			bStatus = false;
		}
		
		return bStatus;
	}
	
	
	//=============================================================================
	
	public static boolean fileUpload(WebElement element, String strvalue) {

		boolean bStatus = true;
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).click().build().perform();
		    Thread.sleep(4000);
			StringSelection strel = new StringSelection(strvalue);
			Thread.sleep(4000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strel, null);
			Thread.sleep(4000);
			//Create a object for robot class
			Robot robot = new Robot();
			//press CTRL+V 
			robot.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(4000);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			} 
		     catch (Exception e) 
		     {
			  bStatus = false;
		    } 
		   return bStatus;
	}
	
	//=================================================================================
	
	public static Boolean ClickElement(String ObjectXpath)
    {
        Boolean stepStatus = true;
        try
        {
        	Highlight(ObjectXpath);
        	driver.findElement(By.xpath(ObjectXpath)).click();
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        return stepStatus;
    }
	//===============================================================================
	public static void Highlight(String ObjectXpath)
	{
		try
		{
		   WebElement element = driver.findElement(By.xpath(ObjectXpath));
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   for (int iCnt = 0; iCnt < 2; iCnt++) 
		   {
		         js.executeScript("arguments[0].style.border='solid 4px black'", element);
		         Thread.sleep(200);
		         js.executeScript("arguments[0].style.border=''", element);
		         Thread.sleep(200);
		   }
		}
		catch(Exception e)
		{
			
		}
	}
	
	//================================================================================
	
	public static Boolean Exist(String ObjectXpath)
    {
        Boolean stepStatus = true;
        try
        {
        	driver.findElement(By.xpath(ObjectXpath));
        }
        catch (Exception e)
        {
            stepStatus = false;
        }
        return stepStatus;
    }
	
	//===================================================================================
	
	public static Boolean OpenUrl(String URL)
    {
    	Boolean stepStatus = true;
    	try
    	{
    		driver.get(URL);
    		driver.manage().window().maximize();
    	}
    	catch(Exception e)
    	{
    		stepStatus = false;
    	}
    	String CurrentUrl = driver.getCurrentUrl();
    	if (!CurrentUrl.contains(URL))
    	{
    		stepStatus = false;
    	}
    	return stepStatus;
    }
	
	//===========================================================================
	
	public static boolean checkAlert_Accept(String string) {
		
		
        try {
        Alert a = driver.switchTo().alert();
        String str = a.getText();
        a.accept();
        //a.dismiss();
        return true;

        } catch (Exception e) {

        return false;
        }
	}
  //=================================================================================
        
	public static boolean checkAlert_Dismiss(String string) {
		try {
		Alert a = driver.switchTo().alert();
		String str = a.getText();
		System.out.println(str);

		a.dismiss();
		return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	//========================End WebLibrary========================================
	
}

