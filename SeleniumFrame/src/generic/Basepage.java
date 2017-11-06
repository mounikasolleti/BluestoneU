package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class Basepage
{
   public WebDriver driver;
   
  /* public Basepage(WebDriver driver)
   {
           this.driver=driver;
   }

*/
   //to verify the title of the page

   public void verifyTitle(String eTitle)
   {
           try
           {
                   WebDriverWait wait = new WebDriverWait(driver,10);
                   wait.until(ExpectedConditions.titleIs(eTitle));
                   Reporter.log("Title is matching:"+eTitle,true);

           }


           catch(Exception e)
           {
                   Reporter.log("Title is not matching:"+eTitle,true);
                   Assert.fail();
           }
   }



   //To verify the elements
           public void verifyElementPresent(WebElement element)
           {
                   try
                   {
                           WebDriverWait wait = new WebDriverWait(driver,10);
                           wait.until(ExpectedConditions.visibilityOf(element));
                           Reporter.log("element is matching:"+element,true);

                   }


                   catch(Exception e)
                   {
                           Reporter.log("element is not matching:"+element,true);
                           Assert.fail();
                   }





   }




}
