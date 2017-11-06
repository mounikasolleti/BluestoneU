package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.CartPage;
import com.bluestone.page.OnlineJewelleryShoppingPage;


public class CartTest extends BaseTest
{
	
	@Test
	public void view() throws InterruptedException
	
	{
		
		
	
		CartPage cp=new CartPage(driver);
		
		OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
		String email = ExcelData.getDatas(path, "Sheet1", 0, 0);
			
		String pass= ExcelData.getDatas(path, "Sheet1", 0, 1);
			
			op.clickOnLogin();
			op.enterEmailId(email);
			op.enterPassword(pass);
			op.clickToLogin();
			Thread.sleep(1000);
		
		driver.navigate().back();
			
			Thread.sleep(1000);
		
		
		cp.moveToEarrings();
		
		Thread.sleep(2000);
		
		cp.moveToNavaratna();
		
		Thread.sleep(2000);
		
		cp.selectProd1();
		
		cp.buynow();
		
		cp.placenow();
		
		cp.backToBag();
		
		cp.backToHome();
		
		cp.cartcount();
		
		Thread.sleep(5000);
	}

}
