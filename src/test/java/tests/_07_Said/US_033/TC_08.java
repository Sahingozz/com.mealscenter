package tests._07_Said.US_033;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_08 extends TestBaseReport {
//    It should be verified that a number can be entered under Amount.

    @Test
    public void TC08() {
        extentTest = extentReports.createTest("US_033_TC_08", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");

        merchant_dashboard.addNewButton.click();
        extentTest.info("Add new Butonu tiklandi");


        merchant_dashboard.nameBox2.clear();
        merchant_dashboard.nameBox2.sendKeys("2.2");
        Assert.assertTrue(merchant_dashboard.nameBox2.isEnabled());
        extentTest.info("Amount kismindan sayi girildi");
        ReusableMethods.wait(3);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }

}
