package com.project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Loginblue extends Basepage
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
	
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	
	
	
	 public Loginblue(WebDriver driver) 
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
	 public void clickout()
	 {
		 signout.click();
	 }

	
	
	
	
	
}
