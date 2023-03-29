package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.io.IOException;

public class TC_02 extends TestBaseReport {

//    It should be verified that there are Coupon and Offers tabs under Promo.

    @Test
    public void TC02() throws IOException {
        extentTest = extentReports.createTest("US_033_TC_02", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinin oldugu dogrulandi");
        ReusableMethods.wait(2);
        ReusableMethods.getScreenShotFullScreen(Driver.getDriver());
        extentTest.info("Hatanin ekran resmi alindi");
        Assert.assertTrue(merchant_dashboard.couponLink.isDisplayed());
        extentTest.info("Promo altinda coupon linki oldugu dogrulandi");
        Assert.assertTrue(merchant_dashboard.offersLink.isDisplayed());
        extentTest.info("Promo altinda offers linki oldugu dogrulandi");
        ReusableMethods.wait(3);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");
    }
}
