package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TC_16 {

//    Clicking on the Offers tab opens the "Offers list" tab
//    must be verified.

    @Test
    public void TC016() throws IOException {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        ReusableMethods.wait(2);
        ReusableMethods.getScreenShotFullScreen(Driver.getDriver());
        merchant_dashboard.offersLink.click();

        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.mealscenter.com/backoffice/merchant/offers";

        Assert.assertEquals(actualUrl,expectedUrl);

        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}
