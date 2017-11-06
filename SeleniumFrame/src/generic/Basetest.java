package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Basetest implements Auto_consta
{
public WebDriver driver;

static{
	System.setProperty(Firefox_key, Firefox_value);
}
@BeforeMethod
public void OpenApp()
{
	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com/");
}
@AfterMethod
public void CloseApp()
{
	driver.quit();
	
}
}


