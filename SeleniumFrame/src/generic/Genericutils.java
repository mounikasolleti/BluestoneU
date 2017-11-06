package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Genericutils 
{
public static void selectByIndex(WebElement element, int n)
{
	Select sel=new Select(element);
	sel.selectByIndex(n);
}



public static void selectByValue(WebElement element,String value)
{
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public static void VisibleText(WebElement element,String value)
{
	Select sel=new Select(element);
	sel.selectByValue(value);
}

public static void deselectByValue(WebElement element,String value)
{
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public static void moveToelement(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}

}

