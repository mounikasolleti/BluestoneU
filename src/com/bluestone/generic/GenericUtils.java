package com.bluestone.generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class GenericUtils 
{
	
	//Selection and deselection
	
	public static void selectByIndex(WebElement element, int n)
	{
		Select sel=new Select(element);
		sel.selectByIndex(n);
		
	}
	

	public static void selectByValue(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
		
	}
	
	public static void selectByVisibleText(WebElement element, String visibleText)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
		
	}
	
	public static void deselectByIndex(WebElement element, int n)
	{
		Select sel=new Select(element);
		sel.deselectByIndex(n);
		
	}
	
	
	public static void deselectByValue(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.deselectByValue(value);
		
	}
	

	public static void deselectByVisibleText(WebElement element, String VisibleText)
	{
		Select sel=new Select(element);
		sel.deselectByVisibleText(VisibleText);
		
	}
	
	
	//mouse actions 
	
	
	public static void moveToElements(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	} 

	
	
	
	public static void windowHandle(WebDriver driver, String eTitle)
	{
		Set<String> winHandle=driver.getWindowHandles();
		Iterator<String> itr= winHandle.iterator();
		while(itr.hasNext())
		{
			String wh=itr.next();
			driver.switchTo().window(wh);
			
		}
	}
	public static void keyPressing() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public static void moveToElementsUser(WebDriver driver,WebElement e)
	{
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();;
	}
	
	
	
}
