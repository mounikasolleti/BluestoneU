package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.bluestone.generic.BasePage;
import com.bluestone.generic.GenericUtils;


public class CartPage extends BasePage
{
	@FindBy(xpath="//span[.='Earrings ']")
	private WebElement earrings;
	
	@FindBy(xpath="//span[.=' Navratna Earrings ']")
	private WebElement navaratna;
	
	@FindBy(xpath="(//a[@id='pid_2551'])[1]")
	private WebElement prod1;
	
	@FindBy(xpath="//input[@id='buy-now']")
	private WebElement buynow;
	
	@FindBy(xpath="(//a[@class='btn btn-block btn-lg'])[2]")
	private WebElement place;
	
	@FindBy(xpath="//a[.='< Back TO Shopping Bag']")
	private WebElement backtobag;
	
	@FindBy(xpath="//a[.='HOME']")
	private WebElement backtohome;
	
	@FindBy(xpath="//span[@class='cart-count']")
	private WebElement cartcount;
	
	@FindBy(xpath="//span[@class='icon-img hs cart-icon']")
	private WebElement carticon;
	
	
	@FindBy(xpath="(//i[@class='icon-ion-ios-close-empty'])[1]")
	private WebElement remove1;
	
	
	
	
	
	
	

	
	
	
	
	
	
	public CartPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	public void moveToEarrings()
	{
		GenericUtils.moveToElementsUser(driver, earrings);
	}
	
	public void moveToNavaratna()
	{
	
		GenericUtils.moveToElementsUser(driver, navaratna);
		navaratna.click();
	}
	public void selectProd1()
	{
		prod1.click();
		
	}
	
	public void buynow()
	{
		buynow.click();
		
	}
	
	public void placenow()
	{
		place.click();
		
	}
	
	public void backToBag()
	{
		backtobag.click();
		
	}
	
	public void backToHome()
	{
		backtohome.click();
		
	}
	
	public void cartcount()
	{
		checkVis(cartcount);
		//cartcount.getAttribute("cart-count"));
		System.out.println(cartcount.getText());
	}
	
	public void clickCart()
	{
		carticon.click();
	}
	
	public void removefromcart()
	{
		remove1.click();
	}
	
	

}
