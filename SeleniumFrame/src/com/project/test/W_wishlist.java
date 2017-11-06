package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Wishlist;

import generic.Basetest;

public class W_wishlist extends Basetest

{
	
	@Test
	public void W_wishlist1() throws InterruptedException 
	{
		Wishlist wt=new Wishlist(driver);
		wt.clicksignin();
		wt.enterun("kusumverma101@gmail.com");
		wt.enterpwd("bluestone@02");
		Thread.sleep(1000);
		wt.clickcreate();
		Thread.sleep(2000);
		wt.searchenter("Bangles");
		wt.submitclick();
		Thread.sleep(1000);
		wt.bangleclick();
		Thread.sleep(2000);
		wt.selectdd();
		Thread.sleep(1000);
		wt.buynow1click();
		Thread.sleep(1000);
		
		
		
	}




}
