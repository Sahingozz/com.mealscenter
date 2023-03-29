package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_04 extends TestBaseReport {

    //    Add new button should be clickable on Coupon List page.


    @Test
    public void TC04() {
        extentTest = extentReports.createTest("US_033_TC_04", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");

        Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
        merchant_dashboard.addNewButton.click();
        extentTest.info("Add new Butonu tiklandi");
        ReusableMethods.wait(3);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }
}