package com.bluestone.page;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;
import com.bluestone.generic.GenericUtils;

public class OnlineJewelleryShoppingPage extends BasePage
{
	//Declaration
	
	@FindBy(xpath="//span[.='Log In']")
	private WebElement LogInBtn;
	
	@FindBy(id="email-id")
	private WebElement emailID;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="edit-login-account")
	private WebElement Login;


	@FindBy(name="search_query")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@name='submit_search']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//div/span[@class='inner user-name']")
	private WebElement user;
	
	//@FindBy(xpath="//input[@place='Eg: Salwar Suit, Lehnga, Kurtis']")
	//private WebElement placeholder;
	
	//@FindBy(xpath="//span[.='Sign In']")
	//private WebElement SignInBtn;
	
	//@FindBy(xpath="//button[@data-dismiss='modal']")
	//private WebElement closeSignIn;
	
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement signOut;
	

	
	
	

	
    //initialisation

	public OnlineJewelleryShoppingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	
	//utilisation
	
	public void verifyTitleOfPage(String eTitle)
	{   
		verifyTitle(eTitle);
	}
	
	
	public void clickOnLogin()
	{
		LogInBtn.click();
	}
	
	
	public void enterEmailId(String email)
	{
		emailID.sendKeys(email);
	}
	
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickToLogin()
	{
		Login.click();
	}
	public void moveToUser()
	{
		//GenericUtils.moveToElementsUser(this.driver, user);
		user.click();
		
	}
	
	public void moveToSignOut()
	{
		GenericUtils.moveToElementsUser(this.driver, signOut);
	}
	public void clickOnSignout()
	{
		GenericUtils.moveToElementsUser(this.driver, signOut);
		signOut.click();
	}
	
	
	public void enterSearchText(String sText) throws AWTException
	{
		searchbox.sendKeys(sText);
        GenericUtils.keyPressing();
        searchbox.clear();
	}
	
    public void enterSearchTextClickOnBtn(String sText) throws AWTException
	{
		searchbox.sendKeys(sText);
		searchBtn.click();
	}
	
	/*public void placeHolderVisibility()
	{
	verifyElementPresent(placeholder);
     }*/
	
	/*public void clickOnSignIn()
	{
		SignInBtn.click();
	}
	
	public void CartPresent()
	{
		verifyElementPresent(CartLink);
		
	}
	
	public void clickOnCart()
	{
		CartLink.click();
	}
	
	public void clickOnCloseSignIn()
	{
		closeSignIn.click();
	}
	*/
	


}
