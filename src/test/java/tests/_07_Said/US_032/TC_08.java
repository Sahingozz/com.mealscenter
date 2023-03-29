package tests._07_Said.US_032;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_08 extends TestBaseReport {

    //"Ingredients List page after clicking the Ingredients2 tab
    //    it must be verified that it opens.
    @Test
    public void TC08() {
        extentTest = extentReports.createTest("US_032_TC_08", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

        merchant_dashboard.attributesLink.click();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        merchant_dashboard.attributesIngredientsLink.click();
        Assert.assertTrue(merchant_dashboard.attributesIngredientsLink.isDisplayed());
        extentTest.info("Attributes sekmesinin altinda Ingredients linki oldugu dogrulandi.");


        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }
}
