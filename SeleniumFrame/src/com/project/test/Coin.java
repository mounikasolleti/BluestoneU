package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Coins;
import com.project.page.wishlistwoselect;

import generic.Basetest;

public class Coin extends Basetest
{

	@Test
	public void w_wshlistwoselect1() throws InterruptedException 
	{
		Coins c1=new Coins(driver);
		c1.clicksignin();
		c1.enterun("kusumverma101@gmail.com");
		c1.enterpwd("bluestone@02");
		Thread.sleep(1000);
		c1.clickcreate();
		Thread.sleep(3000);
		c1.searchenter("bangles");
		Thread.sleep(2000);
		c1.submitclick();
		Thread.sleep(2000);
		c1.currency();
		Thread.sleep(2000);
	
}
}
