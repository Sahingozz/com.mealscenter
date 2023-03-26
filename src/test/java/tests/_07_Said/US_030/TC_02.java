package tests._07_Said.US_030;

import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {
    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();

    @Test
    public void TC_02() {
//        When we click on "Order" we can see that the "Scheduled"
//        tab is visible.
        ReusableMethods.merchantLoginHasan();
        merchantDashboard.merchantOrderLink.click();
        Assert.assertTrue(merchantDashboard.merchantScheduledLink.isDisplayed());


        ReusableMethods.wait(2);
        Driver.closeDriver();
    }
}