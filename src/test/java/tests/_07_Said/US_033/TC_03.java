package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {

//    When Coupon tab is clicked, Coupon list tab opens
//    must be verified.

    @Test
    public void TC03() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        merchant_dashboard.couponLink.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.mealscenter.com/backoffice/merchant/coupon";
        Assert.assertEquals(actualUrl,expectedUrl);

        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}
