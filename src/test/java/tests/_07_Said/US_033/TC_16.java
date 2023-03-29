package tests._07_Said.US_033;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.io.IOException;

public class TC_16 extends TestBaseReport {

//    Clicking on the Offers tab opens the "Offers list" tab
//    must be verified.

    @Test
    public void TC016() throws IOException {
        extentTest = extentReports.createTest("US_033_TC_05", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        ReusableMethods.wait(2);
        ReusableMethods.getScreenShotFullScreen(Driver.getDriver());
        merchant_dashboard.offersLink.click();
        extentTest.info("Promo altinda offers linki tiklandi");

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.mealscenter.com/backoffice/merchant/offers";

        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Offers sekmesi tiklandiginda Offers list sekmesi acildi");

    }
}
