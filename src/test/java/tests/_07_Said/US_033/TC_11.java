package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_11 {
//    It should be verified that the date can be selected from Expiration.
@Test
public void TC011() {
    ReusableMethods.merchantLoginHasan();
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
    merchant_dashboard.promoLink.click();
    merchant_dashboard.couponLink.click();
    merchant_dashboard.addNewButton.click();

    merchant_dashboard.expiration.click();
    ReusableMethods.wait(2);
    merchant_dashboard.expiration.sendKeys("2023-03-15");
    Assert.assertTrue(merchant_dashboard.expiration.isEnabled());
    Assert.assertTrue(merchant_dashboard.expiration17.isEnabled());

    ReusableMethods.wait(3);
    Driver.closeDriver();
}

}
