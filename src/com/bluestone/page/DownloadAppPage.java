package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;

public class DownloadAppPage extends BasePage
{ 
	@FindBy(xpath="//i[@class='app']")
	private WebElement googleapp;
	
	@FindBy(xpath="//span[.='Install']")
	private WebElement googleinstall;
	
	

	public DownloadAppPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGoogle()
	{
		googleapp.click();
	}
	
	public void clickOnInstall()
	{
		googleinstall.click();
	}

}
