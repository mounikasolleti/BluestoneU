package com.bluestone.page;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.bluestone.generic.BasePage;

public class ViewMoreAtBottomPage extends BasePage 
{
	
		@FindBy(xpath="//a[.='View More Collections']")
		private WebElement viewmore;
		
		public ViewMoreAtBottomPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		public void viewMoreCollections()
		{
			viewmore.click();
		}
		
	}


