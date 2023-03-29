package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.security.PublicKey;
import java.util.ResourceBundle;

public class TC_02 extends TestBaseReport {

    //    Under the Attributes tab, select Size, Ingredients,
    //    It must be confirmed that there are Cooking Reference tabs.


    @Test
    public void TC02() {
        extentTest = extentReports.createTest("US_032_TC_02", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");
        ReusableMethods.wait(2);

        Assert.assertTrue(merchant_dashboard.attributesSizeLink.isDisplayed());
        extentTest.info("Attributes sekmesinin altinda size linki oldugu dogrulandi.");
        Assert.assertTrue(merchant_dashboard.attributesIngredientsLink.isDisplayed());
        extentTest.info("Attributes sekmesinin altinda Ingredients linki oldugu dogrulandi.");
        Assert.assertTrue(merchant_dashboard.attributesCookingReferenceLink.isDisplayed());
        extentTest.info("Attributes sekmesinin altinda Cooking Referencelinki oldugu dogrulandi.");


        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");
    }
}
