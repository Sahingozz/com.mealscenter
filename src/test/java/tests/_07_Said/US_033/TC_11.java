package tests._07_Said.US_033;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_11 extends TestBaseReport {
    //    It should be verified that the date can be selected from Expiration.
    @Test
    public void TC011() {
        extentTest = extentReports.createTest("US_033_TC_11", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");

        merchant_dashboard.addNewButton.click();
        extentTest.info("Add new Butonu tiklandi");


        merchant_dashboard.expiration.click();
        extentTest.info("expiration sekmesi tiklandi");
        ReusableMethods.wait(2);
        merchant_dashboard.expiration17.click();
        Assert.assertTrue(merchant_dashboard.expiration.isEnabled());
        Assert.assertTrue(merchant_dashboard.expiration17.isEnabled());
        extentTest.info("Expirationdan kismindan tarih secildi");

        ReusableMethods.wait(3);
        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }

}
