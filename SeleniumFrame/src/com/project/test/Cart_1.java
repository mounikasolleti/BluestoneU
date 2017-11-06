package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Cart;
import com.project.page.wishlistwoselect;

import generic.Basetest;

public class Cart_1 extends Basetest

{
	@Test
	public void Cart_12 () throws InterruptedException 
	{
		Cart  wt2=new Cart(driver);
		wt2.clicksignin();
		wt2.enterun("kusumverma101@gmail.com");
		wt2.enterpwd("bluestone@02");
		Thread.sleep(1000);
		wt2.clickcreate();
		Thread.sleep(3000);
		wt2.icon2();
		Thread.sleep(2000);
		
}
}

