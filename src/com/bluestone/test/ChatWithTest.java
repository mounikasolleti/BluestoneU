package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.ExcelData;
import com.bluestone.page.ChatPage;
import com.bluestone.page.OnlineJewelleryShoppingPage;



public class ChatWithTest extends BaseTest
{
  @Test
  public void Chat() throws InterruptedException
  {
	  
	  OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
		
		
		
		String em = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 0);
		
		String pw = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "Sheet1", 0, 1);
		
		String HTitle = ExcelData.getDatas("/home/tyss/Desktop/input.xlsx", "sheet1", 0, 2);
		
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
		
   
   
     
	  ChatPage cp=new ChatPage(driver);
	  
	  Thread.sleep(1000);
	 
	  cp.clickOnChat();
	 
	  cp.enterName("hi");
	  
	  
  }
		
}
