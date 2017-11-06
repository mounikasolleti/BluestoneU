package com.bluestone.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;
import com.bluestone.generic.GenericUtils;

public class collectionsPage extends BasePage
{

	@FindBy(xpath="(//img[@class='img-responsive-c lazy-img'])[2]")
	private WebElement ShardsCollections;
	
	@FindBy(xpath="(//img[@class='img-responsive-c lazy-img'])[3]")
	private WebElement ShardsClass;
	
	@FindBy(xpath="(//a[@class='p-image'])[1]")
	private WebElement Shardsfirst;
	
	@FindBy(id="buy-now")
	private WebElement buyShard;
	
	@FindBy(xpath="(//a[@class='btn btn-block btn-lg'])[1]")
	private WebElement placeOrder;
	
	@FindBy(id="countryId_delivery")
	private WebElement selectCountry;
	
	@FindBy(xpath="//input[@id='postcode_delivery']")
	private WebElement pin;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	
	
	@FindBy(xpath="//textarea[@id='cityName_delivery']")
	private WebElement city;
	

	@FindBy(xpath="//input[@class='btn btn-lg btn-block']")
	private WebElement continueOrder;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public collectionsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void shardsCollections()
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		ShardsCollections.click();	
	}
	
	public void shardsselect()
	
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		ShardsClass.click();
	}
	
	public void selectShard1()
	{
		Shardsfirst.click();
	}
	
	public void buyShard()
	{
		buyShard.click();
	}
	
	public void placeOrder()
	{
		placeOrder.click();
	}

	public void selectCountry()
	{
		GenericUtils.selectByVisibleText(selectCountry, "United Kingdom");
	 
	}
	public void enterPin()
	{
		pin.sendKeys("7897");
	 
	}
	
	public void enterAdress()
	{
		address.sendKeys("7897");
	 
	}
	
	public void enterCity()
	{
		city.sendKeys("7897");
	 
	}
	

	public void proceedToBuy()
	{
		continueOrder.click();
	
	 
	}


}
