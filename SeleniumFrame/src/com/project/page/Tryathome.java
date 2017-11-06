package com.project.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Tryathome extends Basepage
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
	
	
	
	
	@FindBy(xpath="//a[text()='Try at Home for Free']")
	private WebElement tryathome;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 public Tryathome(WebDriver driver) 
	 {
		// TODO Auto-generated constructor stub
		 
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
	 
	 public void clicktryathome()
	 {
		 tryathome.click();
	 }
	 
}
