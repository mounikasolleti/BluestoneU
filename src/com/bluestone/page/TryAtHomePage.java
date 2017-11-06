package com.bluestone.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bluestone.generic.BasePage;
import com.bluestone.generic.GenericUtils;


public class TryAtHomePage extends BasePage
{
	@FindBy(xpath="//span[@class='text']")
	private WebElement Tah;
	
	@FindBy(xpath="//input[@id='tahLpPhone']")
	private WebElement MobTAH;
	
	@FindBy(xpath="//input[@id='tahLpEmail']")
	private WebElement EmailTAH;
	
	@FindBy(xpath="(//input[@id='tahLpSubmit'])[1]")
	private WebElement scheduleTAH;
	
	@FindBy(xpath="//h2[.='So, when and where should we visit you?']")
	private WebElement detailsTAH;
	
	@FindBy(xpath="//span[.='tomorrow']")
	private WebElement selDate;
	
	@FindBy(xpath="//span[.='10 AM - 12 PM']")
	private WebElement selTime;
	
	@FindBy(xpath="	//input[@id='tahLpName']")
	private WebElement nameTAH;

	@FindBy(xpath="//input[@id='tahLpPin']")
	private WebElement pinTAH;
	
	@FindBy(xpath="//select[@id='tahLpCity']")
	private WebElement selCount;
	
	@FindBy(xpath="//textarea[@id='tahLpAddress']")
	private WebElement addressTAH;
	
	@FindBy(xpath="(//input[@id='tahLpSubmit'])[2]")
	private WebElement submitTAH;
	
	@FindBy(xpath="//span[@class='tah-success-msg']")
	private WebElement successTAH;
	
	


	
	

	public TryAtHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnTryHome()
	{
		Tah.click();
	}
	
	public void EnterMobileTryHome()
	{
		
		MobTAH.sendKeys("8801400933");
	}
	
	public void EnterEmailTryHome(String em)
	{
		
		EmailTAH.sendKeys(em);
	}
	
	public void clickOnSchedule()
	{
		scheduleTAH.click();
	}
 
	public void checkSchedule()
	{
		verifyElementPresent(detailsTAH);
	}
 
	public void selectDate()
	{
		selDate.click();
	}
	
	public void selectTime()
	{
		selTime.click();
	}
	
	public void enterNameTAH()
	{
		nameTAH.sendKeys("Shwetha");;
	}
	
	public void enterPinTAH()
	{
		pinTAH.sendKeys("560043");
	}
	
	public void selCountry()
	{
		GenericUtils.selectByValue(successTAH, "bangalore");
	}
	
	public void enterAddress()
	{
		addressTAH.sendKeys("bhydgjskpp");
	}
	
	public void clickDone()
	{
		submitTAH.click();
	}
	
	public void successMsg()
	{
		verifyElementPresent(successTAH);
	}


}
