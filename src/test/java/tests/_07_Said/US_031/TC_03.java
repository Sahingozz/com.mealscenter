package tests._07_Said.US_031;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_03 extends TestBaseReport {

    //    When we click on the All orders tab, it tells us that it opens the All orders page.
    //    must be verified.

    @Test
    public void TC03() {
        extentTest = extentReports.createTest("US_031_TC_03", "ilgili alana gidildigi dogrulanmali");

        Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();
        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        merchantDashboard.merchantOrderLink.click();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");


        ReusableMethods.wait(2);
        merchantDashboard.merchantAllOrdersLink.click();
        extentTest.info("Merchant order linkine tiklandi");


        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.mealscenter.com/backoffice/orders/history";
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Dogru Url'e gidildigi dogrulandi");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}
