package tests._07_Said.US_030;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();

    @Test
    public void TC_01() {
        //    Under "Dashboard" we need to verify that the "Orders"
        //    tab is present and clickable.
         ReusableMethods.merchantLoginHasan();
         merchantDashboard.merchantOrderLink.click();
        Assert.assertTrue(merchantDashboard.merchantOrderLink.isDisplayed());
        Assert.assertTrue(merchantDashboard.merchantOrderLink.isEnabled());
        ReusableMethods.wait(2);

        Driver.closeDriver();


    }


}
