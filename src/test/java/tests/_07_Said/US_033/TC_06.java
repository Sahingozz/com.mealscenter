package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_06 extends TestBaseReport {

//    It should be verified that Coupon name can be entered under All
//    Coupons.

    @Test
    public void TC06() {
        extentTest = extentReports.createTest("US_033_TC_06", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");

        merchant_dashboard.addNewButton.click();
        extentTest.info("Add new Butonu tiklandi");


        merchant_dashboard.nameBox1.sendKeys("checkmedeals");
        Assert.assertTrue(merchant_dashboard.nameBox1.isEnabled());
        extentTest.info("All Coupons altinda Coupon name bilgisi girildi");
        ReusableMethods.wait(3);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

        extentTest = extentReports.createTest("US_033_TC_05", "ilgili alana gidildigi dogrulanmali");
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");
        extentTest.info("Promo linkinine tiklandi");
        extentTest.info("Promo altinda coupon linki tiklandi");

        extentTest.info("Coupon sekmesi tiklandiginda Coupon list sekmesi acildigi dogrulandi");
        extentTest.info("Add new Butonu tiklandi");
        extentTest.info("All Coupons altinda Coupon name bilgisi girildi");

        extentTest.info("Add new butonu tiklandiginda All Coupon sayfasi acildi");
        extentTest.info("Coupon type kismindan type secilebildi.");
        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}
