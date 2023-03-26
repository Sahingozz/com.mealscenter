package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {

//    It should be verified that there are Coupon and Offers tabs under Promo.

    @Test
    public void TC02(){
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
         merchant_dashboard.promoLink.click();
         Assert.assertTrue(merchant_dashboard.couponLink.isDisplayed());
         Assert.assertTrue(merchant_dashboard.offersLink.isDisplayed());
        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}
