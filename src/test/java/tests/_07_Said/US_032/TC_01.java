package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_01 extends TestBaseReport {

    //    The Attributes tab under Dashboard
    //    and clickability must be verified.
    @Test
    public void TC01() {
        extentTest = extentReports.createTest("US_032_TC_01", "ilgili alana gidildigi dogrulanmali");
        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        Assert.assertTrue(merchant_dashboard.attributesLink.isDisplayed());
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");

        Assert.assertTrue(merchant_dashboard.attributesLink.isEnabled());
        extentTest.info("Attributes sekmesinin tiklanabilir oldugu dogrulandi.");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}
