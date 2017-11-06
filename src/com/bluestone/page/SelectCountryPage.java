package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bluestone.generic.BasePage;

public class SelectCountryPage extends BasePage
{ 
	@FindBy(xpath="(//span[@class='icon-ion-android-arrow-dropdown'])[2]")
	private WebElement country;
	
	@FindBy(xpath="//span[.='Canada']")
	private WebElement canada;
	
	@FindBy(xpath="//span[@class='cur-flag hs canada-flag']")
	private WebElement canadaFlag;
	
	
	
	
	

	public SelectCountryPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectCountry()
	{
		country.click();
	}
	
	public void selectCanada()
	{
		canada.click();
	}
	
	public void checkCanadaFlag()
	{
		verifyElementPresent(canadaFlag);
	}

}
