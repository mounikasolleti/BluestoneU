package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;

public class WishListPage extends BasePage
{
	@FindBy(xpath="//span[@class='icon-img hs wishlist-icon']")
	private WebElement wishlist;
	
	@FindBy(xpath="//a[.='START EXPLORING']")
	private WebElement wishlistExplore;
	
	@FindBy(xpath="//label[.='Next Day Delivery']")
	private WebElement nextday;
	
	@FindBy(xpath="(//img[@class='hc img-responsive center-block'])[1]")
	private WebElement product1;
	
	@FindBy(xpath="//span[text()='Guaranteed next day delivery']")
	private WebElement checkNextDayDelivery;
	
	
	
	
	
	
	

	public WishListPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnWish()
	{
		wishlist.click();
	}
	
	public void clickOnWishExplore()
	{
		wishlistExplore.click();
	}
	
	public void nextDayDelivery()
	{
		nextday.click();
	}
	
	public void selectProd()
	{
		product1.click();
	}
	
	public void checkNextDay()
	{
		verifyElementPresent(checkNextDayDelivery);
		
	}


}
