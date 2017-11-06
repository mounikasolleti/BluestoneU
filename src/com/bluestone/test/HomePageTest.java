package com.bluestone.test;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.OnlineJewelleryShoppingPage;


public class HomePageTest extends BaseTest 
{
	@Test
	public void testValidLogin() throws AWTException, InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
		
		
		
		String em = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 0);
		
		String pw = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 1);
		
		String HTitle = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "sheet1", 0, 2);
		
		String Stext = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "sheet1", 0, 3);
		
		String HTitle2 = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 1, 2);
		
		op.verifyTitleOfPage(HTitle);
		
		Thread.sleep(1000);
		
		op.clickOnLogin();
		
		Thread.sleep(1000);
		
		op.enterEmailId(em);
		
		
		op.enterPassword(pw);
		
		Thread.sleep(1000);
		
		op.clickToLogin();
		
		Thread.sleep(2000);
		
        op.enterSearchTextClickOnBtn(Stext);
        
        Thread.sleep(1000);
        
        op.moveToUser();
       
      //  op.moveToSignOut();
        
        Thread.sleep(1000);
        
        op.clickOnSignout();
        
     
        
        op.verifyTitleOfPage(HTitle2);
        

		//op.clickOnSignIn();
		
	    //op.clickOnCloseSignIn();
		 
        //op.verifyTitleOfPage("Bluestone");
		
		//op.enterSearchTextClickOnBtn("kurtis");
		
		//op.CartPresent();
		
		//op.clickOnCart();
		//op.placeHolderVisibility();
		
		
        
  
       
		
		
	}
	

	
}
