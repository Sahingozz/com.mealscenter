package tests._07_Said.US_033;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_07 extends TestBaseReport {

    //    It should be verified that the type can be selected from Coupon type.
    @Test
    public void TC07() {
        extentTest = extentReports.createTest("US_033_TC_07", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");

        merchant_dashboard.addNewButton.click();
        extentTest.info("Add new Butonu tiklandi");


        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByIndex(1);
        String actualCouponType = select.getFirstSelectedOption().getText();
        String expextedCouponType = "percentage";
        Assert.assertEquals(actualCouponType, expextedCouponType);
        extentTest.info("Coupon type kismindan type secilebildi.");
        ReusableMethods.wait(3);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }

}
