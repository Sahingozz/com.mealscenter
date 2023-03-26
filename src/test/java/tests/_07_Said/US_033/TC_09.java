package tests._07_Said.US_033;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ReusableMethods;

public class TC_09 {
//    It should be verified that data can be entered in the Min order section.

    @Test
    public void TC09() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        merchant_dashboard.couponLink.click();
        merchant_dashboard.addNewButton.click();

        merchant_dashboard.nameBox1.sendKeys("checkmedeals");
        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByIndex(1);
        merchant_dashboard.nameBox2.clear();
        merchant_dashboard.nameBox2.sendKeys("20.222");

        merchant_dashboard.nameBox3.clear();
        merchant_dashboard.nameBox3.sendKeys("3");

        Assert.assertTrue(merchant_dashboard.nameBox3.isEnabled());
        ReusableMethods.wait(3);
    }
}