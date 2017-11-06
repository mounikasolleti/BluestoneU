package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;

public class WishOnAllProductPage extends BasePage
{

	@FindBy(xpath="(//a[@title='Add to wishlist'])[1]")
	private WebElement wishlistProd1;
	
	public WishOnAllProductPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void wishOnProd1()
	{
		wishlistProd1.click();
	}
	
}
