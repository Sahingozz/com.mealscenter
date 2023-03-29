package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_14 extends TestBaseReport {

    //    It should be confirmed that the Save button can be clicked.
    @Test
    public void TC013() {
        extentTest = extentReports.createTest("US_033_TC_14", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        Assert.assertTrue(merchant_dashboard.promoLink.isDisplayed());

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.mealscenter.com/backoffice/merchant/coupon";
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Coupon sekmesi tiklandiginda Coupon list sekmesi acildigi dogrulandi");


        Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
        merchant_dashboard.addNewButton.click();
        extentTest.info("Add new Butonu tiklandi");


        merchant_dashboard.nameBox1.sendKeys("checkmedeals");
        Assert.assertTrue(merchant_dashboard.nameBox1.isEnabled());
        extentTest.info("All Coupons altinda Coupon name bilgisi girildi");


        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByIndex(1);
        String actualCouponType = select.getFirstSelectedOption().getText();
        String expextedCouponType = "percentage";
        Assert.assertEquals(actualCouponType, expextedCouponType);
        extentTest.info("Coupon type kismindan type secilebildi.");


        merchant_dashboard.nameBox2.clear();
        merchant_dashboard.nameBox2.sendKeys("20.222");
        Assert.assertTrue(merchant_dashboard.nameBox2.isEnabled());
        extentTest.info("Amount kismindan veri girildi");


        merchant_dashboard.nameBox3.clear();
        merchant_dashboard.nameBox3.sendKeys("3");
        Assert.assertTrue(merchant_dashboard.nameBox3.isEnabled());
        extentTest.info("Min order kismindan veri girildi");

        merchant_dashboard.daysAvailableBox.sendKeys("Monday" + Keys.ENTER);
        Assert.assertTrue(merchant_dashboard.daysAvailableBox.isEnabled());
        extentTest.info("Days Available kismindan gün secildi");


        merchant_dashboard.expiration.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(merchant_dashboard.expiration.isEnabled());
        extentTest.info("expiration sekmesi tiklandi");


        merchant_dashboard.expiration17.click();
        Assert.assertTrue(merchant_dashboard.expiration17.isEnabled());
        extentTest.info("Expirationdan kismindan tarih secildi");


        Select select1 = new Select(merchant_dashboard.couponOptions_ddmX);
        select1.selectByIndex(1);
        String actualresult = select1.getFirstSelectedOption().getText();
        String expectedresult = "Use only once";
        Assert.assertEquals(actualresult, expectedresult);
        Select select2 = new Select(merchant_dashboard.ddm2);
        select2.selectByIndex(1);
        extentTest.info("Cupan Options daki seceneklerin secilebilir oldugu dogrulandi");


        actualresult = select2.getFirstSelectedOption().getText();
        expectedresult = "Pending for review";
        Assert.assertEquals(actualresult, expectedresult);
        extentTest.info("Status olarak Pending for review secildi");


        Assert.assertTrue(merchant_dashboard.saveButton.isEnabled());
        ReusableMethods.wait(2);
        merchant_dashboard.saveButton.click();
        extentTest.info("save butonu tiklandi");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}