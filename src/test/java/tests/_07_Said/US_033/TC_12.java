package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.security.SecureRandom;
import java.util.Set;

public class TC_12 extends TestBaseReport {

    //    One of the options in Coupan Options can be selected
    //    is confirmed.

    @Test
    public void TC012() {
        extentTest = extentReports.createTest("US_033_TC_012", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");


        merchant_dashboard.addNewButton.click();
        extentTest.info("Add new Butonu tiklandi");


        Select select1 = new Select(merchant_dashboard.couponOptions_ddmX);
        select1.selectByIndex(1);
        String actualresult = select1.getFirstSelectedOption().getText();
        String expectedresult = "Use only once";
        Assert.assertEquals(actualresult, expectedresult);
        extentTest.info("Cupan Options daki seceneklerin secilebilir oldugu dogrulandi");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");
        ReusableMethods.wait(3);
    }
}
