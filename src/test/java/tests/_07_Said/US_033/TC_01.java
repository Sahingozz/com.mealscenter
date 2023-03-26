package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

//    It should be verified that there is a Promo tab under Dashboard.

    @Test
    public void TC01(){
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.promoLink.isDisplayed());
        Driver.closeDriver();
    }
}
