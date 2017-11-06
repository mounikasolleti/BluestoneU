package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.OnlineJewelleryShoppingPage;
import com.bluestone.page.ScrollPage;

public class ScrollTest extends BaseTest
{
	
	@Test
	public void scroll() throws InterruptedException
	{
		
OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
ScrollPage sp=new ScrollPage(driver);

		
		
		
		String em = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 0);
		
		String pw = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 1);
		
		String HTitle = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "sheet1", 0, 2);
		
		
		
		op.verifyTitleOfPage(HTitle);
		
		Thread.sleep(1000);
		
		op.clickOnLogin();
		
		Thread.sleep(1000);
		
		op.enterEmailId(em);
		
		
		op.enterPassword(pw);
		
		Thread.sleep(1000);
		
		op.clickToLogin();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
     
		
		sp.clickScroll();
		
		Thread.sleep(2000);
		
		sp.clickMonth1();
		
		Thread.sleep(2000);
		
		sp.clickMonth2();
		
		Thread.sleep(2000);
		
		sp.clickMonth3();
		
		Thread.sleep(2000);
		
	}

}
