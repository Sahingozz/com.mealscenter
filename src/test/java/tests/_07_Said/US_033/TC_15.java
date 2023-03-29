package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.util.Date;

public class TC_15 extends TestBaseReport {

    //    After pressing the Delete button, the Delete confirmation
    //    By selecting Delete, it must be confirmed that the Size we added has
    //    been deleted.
    @Test
    public void TC15() {
        ReusableMethods.merchantLoginHasan();
        extentTest = extentReports.createTest("US_033_TC_15", "ilgili alana gidildigi dogrulanmali");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");


        Assert.assertTrue(merchant_dashboard.deleteButton.isEnabled());
        Assert.assertTrue(merchant_dashboard.deleteButtonIcon.isEnabled());
        merchant_dashboard.deleteButtonIcon.click();
        extentTest.info("delete icon tiklandi");
        ReusableMethods.wait(2);
        merchant_dashboard.deleteButton.click();
        extentTest.info("delete button tiklandi");
        ReusableMethods.wait(2);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }

}
