package com.project.page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basetest;

public class Cart extends Basetest

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
	
	
	
	@FindBy(xpath="//span[text()='Bangles ']")
	private WebElement icon;
	
	 
	 @FindBy(xpath="//span[text()='Diamond Bangles']")
		private WebElement option;
	
	public Cart(WebDriver driver)
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
	 public void icon2()
	 {
		 Actions act=new Actions(driver);
		 act.moveToElement(icon).perform();
		 
		option.click();
		 
	 }
	 
	 
	 
}
