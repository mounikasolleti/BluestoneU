package com.project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Basepage;

public class Shippingaddress  extends Basepage
{
	
	@FindBy(xpath="//span[text()='Log In']")
	private WebElement login;

	@FindBy(id="email-id")
	private WebElement typeun;
	
	@FindBy(id="password")
	private WebElement typepwd;
	
	
	@FindBy(id="edit-login-account")
	private WebElement button;
	
	@FindBy(id="search_query_top") 
	private WebElement search;
	
	@FindBy(xpath="//span[text()='kusum']")
	private WebElement hsout;
	
	
	@FindBy(xpath="//span[text()='Shipping Address']")
	private WebElement sshipp;
	
	
	
	@FindBy(id="postcode_delivery")
	private WebElement Enterzip;
	
	
	@FindBy(id="fullname_delivery")
	private WebElement name;
	
	@FindBy(id="stateId_delivery")
	private WebElement dropdownn;
	
	@FindBy(id="submit")
	private WebElement button1;
	
	
	
	@FindBy(xpath="//a[@title='Personal Information']")
	private WebElement linkps;
	
	@FindBy(xpath="//span[text()='Offers ']")
	private WebElement offer;
	
	
	 public Shippingaddress(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
			this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	public void verifyTitle(String eTitle)
	 {
		 verifyTitle(eTitle);
	 }
	 public void clicksignin()
	 {
		 login.click();
	 }
	 
	 public void enterun(String UN)
	 {
		 typeun.sendKeys(UN);
	 }
	 public void enterpwd(String pwd)
	 {
		 typepwd.sendKeys(pwd);
	 }
	 
	 
	 public void clickcreate()
	 {
		 button.click();
	 }
	 
	
	public void sout()
	{
		hsout.click();
	}
	public void ship()
	{
		sshipp.click();
	}
	public void Enterzip1(String abc)
	{
		Enterzip.sendKeys(abc);
	}
	
	public void Entername(String abc1)
	{
		name.sendKeys(abc1);
	}
	public void dropdn()
	{
		Select se=new Select(dropdownn);
				se.selectByValue("17");
		
	}
	public void click1()
	{
		button1.click();
		
	}
	
	public void pclick()
	{
	linkps.click();
	}
	
	public void poffer()
	{
	offer.click();
	}

}
