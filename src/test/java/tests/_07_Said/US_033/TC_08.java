package tests._07_Said.US_033;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_08 {
//    It should be verified that a number can be entered under Amount.

    @Test
    public void TC08() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        merchant_dashboard.couponLink.click();
        merchant_dashboard.addNewButton.click();

        merchant_dashboard.nameBox2.clear();
        merchant_dashboard.nameBox2.sendKeys("2.2");
        Assert.assertTrue(merchant_dashboard.nameBox2.isEnabled());
        ReusableMethods.wait(3);
        Driver.closeDriver();

    }

}
