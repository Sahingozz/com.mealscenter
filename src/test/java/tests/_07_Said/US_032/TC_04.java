package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_04 extends TestBaseReport {

    //    Click the Add button on the Size List page
    //    is verified.
    @Test
    public void TC04() {
        extentTest = extentReports.createTest("US_032_TC_04", "ilgili alana gidildigi dogrulanmali");
        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");

        merchant_dashboard.attributesSizeLink.click();
        extentTest.info("Attributes sekmesinin altinda size linki oldugu dogrulandi.");


        Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
        extentTest.info("add new Button'un tiklanabilir oldugu dogrulandi.");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");
    }
}
