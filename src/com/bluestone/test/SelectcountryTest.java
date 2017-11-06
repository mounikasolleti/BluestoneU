package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.OnlineJewelleryShoppingPage;
import com.bluestone.page.SelectCountryPage;

public class SelectcountryTest extends BaseTest
{  
	@Test
	public void selectCount() throws InterruptedException
	{
	OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
	
	SelectCountryPage st=new SelectCountryPage(driver);
	
	String em = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 0);
	
	String pw = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 1);
	
	op.clickOnLogin();
	
	op.enterEmailId(em);
	
	op.enterPassword(pw);
	
	op.clickToLogin();
	
	Thread.sleep(2000);
	
	st.selectCountry();
	
	st.selectCanada();
	
	Thread.sleep(2000);
	
	st.checkCanadaFlag();
	
	Thread.sleep(1000);
	
	op.moveToSignOut();
	
	op.clickOnSignout();

	
	}

}
