package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Shippingaddress;

import generic.Basetest;

public class Personal extends Basetest
{
	@Test
	public void abc() throws InterruptedException
	{
		

	Shippingaddress sa = new Shippingaddress(driver);
	sa.clicksignin();
	
	Thread.sleep(1000);
	sa.enterun("kusumverma101@gmail.com");
	Thread.sleep(1000);
	sa.enterpwd("bluestone@02");
	Thread.sleep(1000);
	sa.clickcreate();
	Thread.sleep(2000);
	
	
	sa.sout();
	Thread.sleep(1000);
	sa.ship();
	Thread.sleep(1000);
	sa.pclick();
	Thread.sleep(1000);
}
}
