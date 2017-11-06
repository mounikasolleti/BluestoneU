package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.BanglesSel;
import com.bluestone.page.OnlineJewelleryShoppingPage;

public class BanglesTest extends BaseTest
{
	
	@Test
	public void bangles() throws InterruptedException
	{
		
		
		OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
		
		BanglesSel bs=new BanglesSel(driver);
		
		
		
		String em = ExcelData.getDatas(path, "Sheet1", 0, 0);
		
		String pw = ExcelData.getDatas(path, "Sheet1", 0, 1);
		
		String HTitle = ExcelData.getDatas(path, "sheet1", 0, 2);
		
		//String Stext = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "sheet1", 0, 3);
		
		//String HTitle2 = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 1, 2);
		
		op.verifyTitleOfPage(HTitle);
		
		Thread.sleep(1000);
		
		op.clickOnLogin();
		
		Thread.sleep(1000);
		
		op.enterEmailId(em);
		
		
		op.enterPassword(pw);
		
		Thread.sleep(1000);
		
		op.clickToLogin();
		
		Thread.sleep(2000);
		
		
		
		
		bs.moveToBangles();
		Thread.sleep(2000);
		
		bs.clickDiamondBangles();
		Thread.sleep(2000);
		
		bs.filterByPrice();
		
		Thread.sleep(1000);
		
		bs.clickOnRange1();

		Thread.sleep(1000);
		
		  
	     
		
		
	}

}
