package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_14 extends TestBaseReport {
    //    Click the Add button on the Cooking Reference List page
    //    must be verified.
    @Test
    public void test14() {
        extentTest = extentReports.createTest("US_032_TC_14", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");


        merchant_dashboard.attributesCookingReferenceLink.click();
        extentTest.info("Attributes sekmesinin altinda Cooking ReferenceLink linki oldugu dogrulandi.");

        Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
        merchant_dashboard.addNewButton.click();
        extentTest.info("add new Button'un tiklanabilir oldugu dogrulandi.");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }

}
