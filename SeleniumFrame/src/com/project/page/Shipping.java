package com.project.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping 
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
	
	
	@FindBy(xpath="//span[text(),'Lifetime Exchange']")//span[contains(text(),'Shipping & Returns')]")
	private WebElement products;
	
	

	
	@FindBy(xpath="//span[text()='Shipping & ']")
	private WebElement ppage;
	
	
	
	public Shipping(WebDriver driver)
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
	 public void scroll()
	 {
		 JavascriptExecutor je=(JavascriptExecutor)driver;
		 int x=products.getLocation().getX();
		 int y=products.getLocation().getY();
		 je.executeScript("window.scrollBy(x,y)");
		 
	 }
	 
	 public void products1()
	 {
		 products.click();
	 }
	 
	 public void productspage()
	 {
		 ppage.isDisplayed();
	 }
	 

}
