package com.project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Removeitemwishlist extends Basepage
{
public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Log In']")
	private WebElement login;

	@FindBy(id="email-id")
	private WebElement typeun;
	
	@FindBy(id="password")
	private WebElement typepwd;
	
	
	@FindBy(id="edit-login-account")
	private WebElement button;
	
	
	
	
	@FindBy(className="icon-img hs wishlist-icon")
	private WebElement icon;
	

	public Removeitemwishlist(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	 public void verifyTitle(String eTitle)
	 {
		 verifyTitle(eTitle);
	 }
	 public void clicksignin()
	 {
		 login.click();
	 }
	 
	 public void enterun(String un)//div[@class='formErrorContent']
	 {
		 typeun.sendKeys(un);
	 }
	 public void enterpwd(String pwd)
	 {
		 typepwd.sendKeys(pwd);
	 }
	 
	 
	 public void clickcreate()
	 {
		 button.click();
	 }
	 public void icon1()
	 {
		 icon.click();
	 }
	 
	 
}
