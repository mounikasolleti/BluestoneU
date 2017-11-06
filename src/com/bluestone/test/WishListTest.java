package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.OnlineJewelleryShoppingPage;
import com.bluestone.page.WishListPage;

public class WishListTest extends BaseTest
{

	@Test
	public void selectWish() throws InterruptedException
	{
		WishListPage wp=new WishListPage(driver);
		
		OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
		
		String em = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 0);
		
		String pw = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 1);
		
		op.clickOnLogin();
		
		op.enterEmailId(em);
		
		op.enterPassword(pw);
		
		
		op.clickToLogin();
		
		Thread.sleep(2000);
		
	
		
		wp.clickOnWish();
		
		wp.clickOnWishExplore();
		
		wp.nextDayDelivery();
		
		wp.selectProd();
		
		wp.checkNextDay();
		
		
		Thread.sleep(1000);
	}
}
