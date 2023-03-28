package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.PublicKey;
import java.util.ResourceBundle;

public class TC_02 {

    //    Under the Attributes tab, select Size, Ingredients,
    //    It must be confirmed that there are Cooking Reference tabs.


       @Test
    public void TC02(){
           ReusableMethods.merchantLoginHasan();
           Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
           merchant_dashboard.attributesLink.click();
           ReusableMethods.wait(2);
           Assert.assertTrue(merchant_dashboard.attributesSizeLink.isDisplayed());
           Assert.assertTrue(merchant_dashboard.attributesIngredientsLink.isDisplayed());
           Assert.assertTrue(merchant_dashboard.attributesCookingReferenceLink.isDisplayed());

           Driver.closeDriver();
       }
}
