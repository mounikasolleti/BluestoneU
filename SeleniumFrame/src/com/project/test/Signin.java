package com.project.test;

import org.testng.annotations.Test;

import com.project.page.Loginblue;
import com.project.page.Onlineshoppingpage;

import generic.Basetest;

public class Signin extends Basetest
{
	
@Test
public void Signin1() throws InterruptedException
{
	Onlineshoppingpage op=new Onlineshoppingpage(driver);
	Thread.sleep(1000);
	op.clicksignin();
	
	Thread.sleep(1000);
	op.enterun("kusumverma101@gmail.com");
	Thread.sleep(1000);
	op.enterpwd("bluestone@02");
	Thread.sleep(1000);
	op.clickcreate();
	Thread.sleep(2000);
	
	
}


}
