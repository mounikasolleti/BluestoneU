package com.project.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.project.page.Wishlist;
import com.project.page.wishlistwoselect;

import generic.Basetest;

public class w_wshlistwoselect extends Basetest

{

	

	@Test
	public void w_wshlistwoselect1() throws InterruptedException 
	{
		wishlistwoselect wt1=new wishlistwoselect(driver);
		wt1.clicksignin();
		wt1.enterun("kusumverma101@gmail.com");
		wt1.enterpwd("bluestone@02");
		Thread.sleep(1000);
		wt1.clickcreate();
		Thread.sleep(2000);
		wt1.searchenter("Bangles");
		wt1.submitclick();
		Thread.sleep(1000);
		wt1.bangleclick();
		Thread.sleep(2000);
	wt1.buynow1click();
	Thread.sleep(2000);
		wt1.errormsg();
		Thread.sleep(1000);
		
		
}
}
