package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {

//    When the All Coupon page opens when the Add new button is clicked
//    must be verified.


    @Test
    public void TC05() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        merchant_dashboard.couponLink.click();
        merchant_dashboard.addNewButton.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.mealscenter.com/backoffice/merchant/coupon_create";
        Assert.assertEquals(actualUrl,expectedUrl);

        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}
