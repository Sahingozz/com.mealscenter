package tests._07_Said.US_030;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_01 extends TestBaseReport {

    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();

    @Test
    public void TC_01() {
        extentTest = extentReports.createTest("US_030_TC_01", "ilgili alana gidildigi dogrulanmali");
        //    Under "Dashboard" we need to verify that the "Orders"
        //    tab is present and clickable.
        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");
        merchantDashboard.merchantOrderLink.click();
        extentTest.info("Merchant order linkine tiklandi");


        Assert.assertTrue(merchantDashboard.merchantOrderLink.isDisplayed());
        extentTest.info("Merchant order linki görünür oldugu test edildi");
        Assert.assertTrue(merchantDashboard.merchantOrderLink.isEnabled());
        extentTest.info("Merchant order linki aktiv oldugu test edildi");
        ReusableMethods.wait(2);

        Driver.closeDriver();
        extentTest.info("sayfa kapandi");

        extentTest.pass("basarili sekilde dogrulandi.");


    }


}
