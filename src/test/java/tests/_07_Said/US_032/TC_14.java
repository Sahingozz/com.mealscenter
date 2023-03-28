package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_14 {
     //    Click the Add button on the Cooking Reference List page
    //    must be verified.
     @Test
     public void test14(){
         ReusableMethods.merchantLoginHasan();
         Merchant_Dashboard merchant_dashboard =new Merchant_Dashboard();
         merchant_dashboard.attributesLink.click();
         merchant_dashboard.attributesCookingReferenceLink.click();
         Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
         merchant_dashboard.addNewButton.click();
         Driver.closeDriver();
     }

}
