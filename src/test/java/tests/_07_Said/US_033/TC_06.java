package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {

//    It should be verified that Coupon name can be entered under All
//    Coupons.

    @Test
    public void TC06() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        merchant_dashboard.couponLink.click();
        merchant_dashboard.addNewButton.click();

       merchant_dashboard.nameBox1.sendKeys("checkmedeals");
        Assert.assertTrue(merchant_dashboard.nameBox1.isEnabled());
        ReusableMethods.wait(3);
        Driver.closeDriver();
}}
