package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Tryathome;

import generic.Basetest;

public class Tryhome extends Basetest

{

	@Test
	public void Signin1() throws InterruptedException
	{
		
		Tryathome th=new Tryathome(driver);
		th.clicksignin();
		Thread.sleep(2000);
		th.enterun("kusumverma101@gmail.com");
		th.enterpwd("bluestone@02");
		Thread.sleep(1000);
		th.clickcreate();
		Thread.sleep(2000);
		th.clicktryathome();
		Thread.sleep(2000);
	}
}
