package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;

public class ChatPage extends BasePage
{
    //Declaration 
	@FindBy(xpath="//span[@id='open-label']")
	private WebElement chat;
	
	
	@FindBy(className="floating-nav-inner")
	private WebElement scroll;
	
	@FindBy(xpath="//form//input[@id='name']")
	private WebElement chatEnterName;
	
    //Initialisation
	public ChatPage(WebDriver driver) 
	{	super(driver);
	
		PageFactory.initElements(driver, this);
	
	}
	
	
	//Utilisation
	
	public void clickOnChat()
	{
		driver.switchTo().frame("livechat-compact-view");
		chat.click();
		
		
	}
	public void enterName(String n)
	{
		
		chatEnterName.sendKeys(n);
	
	
	}
	


}
