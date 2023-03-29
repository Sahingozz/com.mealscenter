package tests._07_Said.US_031;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.sql.ResultSet;

public class TC_02 extends TestBaseReport {
    //When we click on Order, it must be verified that
    // the All orders tab is present.

    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();

    @Test
    public void TC02() {
        extentTest = extentReports.createTest("US_031_TC_02", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        merchantDashboard.merchantOrderLink.click();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        ReusableMethods.wait(2);
        Assert.assertTrue(merchantDashboard.merchantAllOrdersLink.isDisplayed());
        extentTest.info("Merchant order linkine tiklandi");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}
