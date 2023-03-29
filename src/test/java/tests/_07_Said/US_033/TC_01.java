package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_01 extends TestBaseReport {

    //    It should be verified that there is a Promo tab under Dashboard.
    @Test
    public void TC01() {
        extentTest = extentReports.createTest("US_033_TC_01", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.promoLink.isDisplayed());
        extentTest.info("Dashboard altindaki Promo sekmesinin oldugu dogrulandi.");


        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");
    }
}
