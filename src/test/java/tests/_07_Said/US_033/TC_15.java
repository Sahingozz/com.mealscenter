package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Date;

public class TC_15 {

    //    After pressing the Delete button, the Delete confirmation
    //    By selecting Delete, it must be confirmed that the Size we added has
    //    been deleted.
    @Test
    public void TC013() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        merchant_dashboard.couponLink.click();

        Assert.assertTrue(merchant_dashboard.deleteButton.isEnabled());
        Assert.assertTrue(merchant_dashboard.deleteButtonIcon.isEnabled());
        merchant_dashboard.deleteButtonIcon.click();
        ReusableMethods.wait(2);
        merchant_dashboard.deleteButton.click();
        ReusableMethods.wait(2);

        Driver.closeDriver();
    }

}
