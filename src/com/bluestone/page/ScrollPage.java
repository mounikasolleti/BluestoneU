package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;

public class ScrollPage extends BasePage
{
	
	 @FindBy(className="floating-nav-inner")
	 private WebElement sc;
	 
	 @FindBy(xpath="//div[@data-month='aug']")
	 private WebElement month1;
	 
	 @FindBy(xpath="//div[@data-month='sep']")
	 private WebElement month2;
	 
	 @FindBy(xpath="//div[@data-month='oct']")
	 private WebElement month3;
	 
	 
	 

	public ScrollPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickScroll()
	{
		sc.click();
	}
	
	public void clickMonth1()
	{
		month1.click();
	}

	
	public void clickMonth2()
	{
		month2.click();
	}
	
	public void clickMonth3()
	{
		month3.click();
	}
}
