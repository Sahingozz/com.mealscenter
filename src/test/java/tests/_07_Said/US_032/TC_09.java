package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_09 extends TestBaseReport {


//    Click on the Add button on the "Ingredients" page
//    must be verified.

    @Test
    public void test09() {
        extentTest = extentReports.createTest("US_032_TC_09", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");

        merchant_dashboard.attributesIngredientsLink.click();
        Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
        extentTest.info("Attributes sekmesinin altinda Ingredients linki oldugu dogrulandi.");

        merchant_dashboard.addNewButton.click();
        extentTest.info("add new Button'un tiklanabilir oldugu dogrulandi.");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }
}
