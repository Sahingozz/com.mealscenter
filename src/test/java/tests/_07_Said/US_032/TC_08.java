package tests._07_Said.US_032;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_08 {

     //"Ingredients List page after clicking the Ingredients2 tab
    //    it must be verified that it opens.
     @Test
     public void TC08() {
         ReusableMethods.merchantLoginHasan();
         Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

         merchant_dashboard.attributesLink.click();
         merchant_dashboard.attributesIngredientsLink.click();
         Assert.assertTrue(merchant_dashboard.attributesIngredientsLink.isDisplayed());

         Driver.closeDriver();





     }
}
