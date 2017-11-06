package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Shipping;

import generic.Basetest;

public class Shipping_1 extends Basetest

{
	@Test
	public void Shipping_21 () throws InterruptedException 
	{

	Shipping s1=new Shipping(driver);
	s1.clicksignin();
	s1.enterun("kusumverma101@gmail.com");
	s1.enterpwd("bluestone@02");
	Thread.sleep(1000);
	s1.clickcreate();
	Thread.sleep(3000);
	s1.scroll();
	Thread.sleep(1000);
	s1.products1();
	s1.productspage();
	
	
	}
}

