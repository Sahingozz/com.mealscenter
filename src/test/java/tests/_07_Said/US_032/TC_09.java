package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_09 {


//    Click on the Add button on the "Ingredients" page
//    must be verified.

    @Test
    public void test09(){
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard =new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        merchant_dashboard.attributesIngredientsLink.click();
        Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
        merchant_dashboard.addNewButton.click();
        Driver.closeDriver();
    }
}
