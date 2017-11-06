package com.bluestone.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public abstract class BaseTest implements AutoConstant
                                                                                                                                                                                                                                                                                                                                
{

	public static WebDriver driver;
	
	@BeforeMethod
	public void preConditions() throws InterruptedException

	{
		
		
		System.setProperty(chrome_Key, chrome_Value);
		
		driver=new ChromeDriver();
		
		driver.get("http://www.bluestone.com/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	
	@AfterMethod
	public void postConditions()
	{
		driver.close();
	}
}
