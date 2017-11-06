package com.project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Basepage;

public class wishlistwoselect extends Basepage

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
	
	@FindBy(id="search_query_top")
	private WebElement search;  
	
	
	@FindBy(xpath="//input[@name='submit_search']")
	private WebElement submit;
	
	@FindBy(xpath="//img[@alt='The Qoraal Cuff Bangle']")
	private WebElement bangle;
	
	
	
	//input[@value='Buy Now']
	
	
	@FindBy(xpath="//input[@value='Buy Now']")
	private WebElement buynow;
	
	
	
			@FindBy(className="formErrorContent")
	private WebElement errmsg;
	
	
	public wishlistwoselect(WebDriver driver)
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
	 
	 public void searchenter(String se)
	 {
		 search.sendKeys(se);
	 }
	 
	 public void submitclick()                        
	 {
		 submit.click();
	 }
	 
	 public void bangleclick()
	 {
		 bangle.click();
	 }
	 
	 public void buynow1click()
	 {
		 buynow.click();
	 }
	 public void errormsg()
	 {
		 errmsg.isDisplayed();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
