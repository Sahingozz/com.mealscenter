package tests._07_Said.US_030;

import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_02 extends TestBaseReport {

    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();

    @Test
    public void TC_02() {
        extentTest = extentReports.createTest("US_030_TC_02", "ilgili alana gidildigi dogrulanmali");
//        When we click on "Order" we can see that the "Scheduled"
//        tab is visible.
        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");
        merchantDashboard.merchantOrderLink.click();
        extentTest.info("Merchant order linkine tiklandi");
        Assert.assertTrue(merchantDashboard.merchantScheduledLink.isDisplayed());
        extentTest.info("Merchant order linki görünür oldugu test edildi");


        ReusableMethods.wait(2);
        Driver.closeDriver();
        extentTest.info("sayfa kapandi");

        extentTest.pass("basarili sekilde dogrulandi.");
    }
}