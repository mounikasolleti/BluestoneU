package com.bluestone.test;


import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.TryAtHomePage;

public class TryHomeTest extends BaseTest
{
	@Test
	public void tryHome() throws InterruptedException 
	{
	
	TryAtHomePage tp=new TryAtHomePage(driver);
	
	tp.clickOnTryHome();
	
	String eTitle = ExcelData.getDatas(path, "sheet1", 2, 2);
	 //String mob = ExcelData.getDatas(path, "sheet1", 3, 0);
	 String em = ExcelData.getDatas(path, "sheet1", 3, 2);
		
	tp.verifyTitle(eTitle);
	
	Thread.sleep(1000);
	
	tp.EnterMobileTryHome();
	
	tp.EnterEmailTryHome(em);
	
	tp.clickOnSchedule();
	
	tp.checkSchedule();
	
	tp.selectDate();
	
	tp.selectTime();
	
	tp.enterNameTAH();
	
	tp.enterPinTAH();
	
	tp.selCountry();
	
	tp.enterAddress();
	
	tp.clickDone();
	
	tp.successMsg();

	Thread.sleep(2000);
	}
	
	

}
