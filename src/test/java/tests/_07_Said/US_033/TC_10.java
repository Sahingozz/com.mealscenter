package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_10 extends TestBaseReport {
    //    It should be verified that days can be selected from Days Available.
    @Test
    public void TC010() {
        extentTest = extentReports.createTest("US_033_TC_10", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");

        merchant_dashboard.addNewButton.click();
        extentTest.info("Add new Butonu tiklandi");


        merchant_dashboard.daysAvailableBox.sendKeys("Monday" + Keys.ENTER);
        Assert.assertTrue(merchant_dashboard.daysAvailableBox.isEnabled());
        extentTest.info("Days Available kismindan gün secildi");
        ReusableMethods.wait(3);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}
