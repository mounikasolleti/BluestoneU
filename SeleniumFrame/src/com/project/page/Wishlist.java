package com.project.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Basepage;

public class Wishlist extends Basepage

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
	
	
	
	//img[@alt='The Qoraal Cuff Bangle']
	
	
	@FindBy(xpath="//img[@alt='The Qoraal Cuff Bangle']")
	private WebElement bangle;
	
	
	
	//input[@value='Buy Now']
	
	
	@FindBy(xpath="//input[@value='Buy Now']")
	private WebElement buynow;
	
	
	
	@FindBy(id="ringselect")
	private WebElement dropdown;
	
	//@FindBy(xpath="//option[text()=' 2-2(2 2/16")']")
	//`private WebElement optiondd;
	
	
	public Wishlist(WebDriver driver)
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
	 
	 public void enterun(String un)
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
	 
	 public void selectdd()
	 {
		 Select s=new Select(dropdown);
		//List<WebElement> lp=driver.findElements(arg0)
		 
		 s.selectByValue("02");
		
		 
	 }
	 
	 public void buynow1click()
	 {
		 buynow.click();
	 }
	
	
	
}
