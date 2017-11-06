package com.project.test;


import org.testng.annotations.Test;

import com.project.page.Nousername;

import generic.Basetest;

public class Nousername_1 extends Basetest

{
	@Test
public void nouser() throws InterruptedException

{
	
	Nousername n1=new Nousername(driver);
	n1.clicksignin();
	//n1.enterun("kusumverma101@gmail.com");
	n1.enterpwd("bluestone@02");
	Thread.sleep(1000);
	n1.clickcreate();
	Thread.sleep(3000);
	n1.nousern();
	
	}
}
