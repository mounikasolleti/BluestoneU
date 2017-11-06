package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;
import com.bluestone.generic.GenericUtils;

public class BanglesSel extends BasePage
{

	@FindBy(xpath="//span[.='Bangles ']")
	private WebElement bangl;
	
	
	@FindBy(xpath="//span[.=' Diamond Bangles ']")
	private WebElement diamondBng;
	
		
	@FindBy(xpath="//span[.='Price']")
	private WebElement Price;
	
	@FindBy(xpath="//a[@data-displayname='rs 20000 to rs 30000']")
	private WebElement range1;
	
	
	

	public BanglesSel(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void moveToBangles()
	{
		GenericUtils.moveToElements(driver, bangl);
	}
	
	public void clickDiamondBangles()
	{
		diamondBng.click();
	}
	
	public void filterByPrice()
	{
		GenericUtils.moveToElements(driver, Price);
	}
	
	public void clickOnRange1()
	{
		range1.click();
	}
	
	

}
