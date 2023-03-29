package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_03 extends TestBaseReport {

//    When Coupon tab is clicked, Coupon list tab opens
//    must be verified.

    @Test
    public void TC03() {
        extentTest = extentReports.createTest("US_033_TC_03", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinin oldugu dogrulandi");
        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.mealscenter.com/backoffice/merchant/coupon";
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Coupon sekmesi tiklandiginda Coupon list sekmesi acildigi dogrulandi");

        ReusableMethods.wait(3);
        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");
    }
}

