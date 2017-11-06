package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.OnlineJewelleryShoppingPage;
import com.bluestone.page.ViewMoreAtBottomPage;

public class ViewMoreTest extends BaseTest
{
	@Test
	public void view() throws InterruptedException
	{
	
    OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
    
	ViewMoreAtBottomPage vm=new ViewMoreAtBottomPage(driver);
	
	String email = ExcelData.getDatas(path, "Sheet1", 0, 0);
	
	String pass= ExcelData.getDatas(path, "Sheet1", 0, 1);
	
	op.clickOnLogin();
	op.enterEmailId(email);
	op.enterPassword(pass);
	op.clickToLogin();
	
	
	
	
	Thread.sleep(1000);
	
	
	
	driver.navigate().back();
	
	Thread.sleep(1000);
	
	vm.viewMoreCollections();
	
	Thread.sleep(2000);
	
	op.verifyTitleOfPage("Our Collections | BlueStone.com");
	
	
	
	Thread.sleep(2000);
	}
	
}
