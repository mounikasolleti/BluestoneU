package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Loginblue;

import generic.Basetest;

public class Logout extends Basetest

{
	@Test
	public void logoutTest() throws InterruptedException
	{
		
		Loginblue lb = new Loginblue(driver);
		
		lb.clicksignin();
		
		Thread.sleep(1000);
		lb.enterun("kusumverma101@gmail.com");
		Thread.sleep(1000);
		lb.enterpwd("bluestone@02");
		Thread.sleep(1000);
		lb.clickcreate();
		Thread.sleep(2000);
		
		
		lb.sout();
		Thread.sleep(1000);
		lb.clickout();
	}
}
