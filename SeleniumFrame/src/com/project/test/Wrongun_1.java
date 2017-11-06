package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Cart;
import com.project.page.Wrongun;

import generic.Basetest;

public class Wrongun_1 extends Basetest
{

	
	@Test
	public void Wrongun_12 () throws InterruptedException 
	{
		Wrongun  wt2=new Wrongun (driver);
		wt2.clicksignin();
		wt2.enterun("kusumverma101@gmail.com");
		wt2.enterpwd("1234");
		Thread.sleep(1000);
		wt2.clickcreate();
		Thread.sleep(3000);
		wt2.check();
}}
