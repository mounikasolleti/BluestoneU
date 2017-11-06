package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.generic.GenericUtils;
import com.bluestone.page.DownloadAppPage;

public class DownloadAppTest extends BaseTest
{
	@Test
	public void download() throws InterruptedException
	{
		DownloadAppPage dap=new DownloadAppPage(driver);
	   
		dap.clickOnGoogle();
		
		Thread.sleep(2000);
		
		GenericUtils.windowHandle(driver, "BlueStone Jewellery Online – Android Apps on Google Play");
		
		dap.clickOnInstall();
		
		Thread.sleep(1000);
		
		
	
	
	}
	

}
