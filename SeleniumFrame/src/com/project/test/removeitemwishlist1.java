package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Removeitemwishlist;
import com.project.page.wishlistwoselect;

import generic.Basetest;

public class removeitemwishlist1  extends Basetest
{
	@Test
	public void removeitemwishlist12() throws InterruptedException 
	{
		Removeitemwishlist wt2=new Removeitemwishlist(driver);
		wt2.clicksignin();
		wt2.enterun("kusumverma101@gmail.com");
		wt2.enterpwd("bluestone@02");
		Thread.sleep(1000);
		wt2.clickcreate();
		Thread.sleep(2000);
		wt2.icon1();
		Thread.sleep(2000);
}
}

