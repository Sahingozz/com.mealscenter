package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

    //    The Attributes tab under Dashboard
    //    and clickability must be verified.
    @Test
    public void TC01(){
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard =new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.attributesLink.isDisplayed());
        Assert.assertTrue(merchant_dashboard.attributesLink.isEnabled());
        Driver.closeDriver();

    }
}
