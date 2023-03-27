package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {

    //    Add new button should be clickable on Coupon List page.


    @Test
    public void TC04() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        merchant_dashboard.couponLink.click();
        Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
        merchant_dashboard.addNewButton.click();

        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}