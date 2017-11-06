package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.BanglesSel;
import com.bluestone.page.OnlineJewelleryShoppingPage;
import com.bluestone.page.WishOnAllProductPage;

public class WishOnAllProdTest extends BaseTest
{
	@Test
	public void allWish() throws InterruptedException
	{

	WishOnAllProductPage wap=new WishOnAllProductPage(driver);
	
	BanglesSel bs=new BanglesSel(driver);
	
	OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
	
	String em = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 0);
	
	String pw = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 1);
	
	op.clickOnLogin();
	
	op.enterEmailId(em);
	
	op.enterPassword(pw);
	
	
	op.clickToLogin();
	
	Thread.sleep(2000);
	
	
	bs.moveToBangles();
	Thread.sleep(2000);
	
	bs.clickDiamondBangles();
	
	Thread.sleep(2000);
	
	
	
	wap.wishOnProd1();
	
	Thread.sleep(2000);
	
	}
}
