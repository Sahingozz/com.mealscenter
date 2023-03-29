package tests._07_Said.US_033;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_13 extends TestBaseReport {


    //    It should be verified that publish can be selected as status.
    @Test
    public void TC014() {
        extentTest = extentReports.createTest("US_033_TC_05", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        extentTest.info("Promo linkinine tiklandi");

        merchant_dashboard.couponLink.click();
        extentTest.info("Promo altinda coupon linki tiklandi");

        merchant_dashboard.addNewButton.click();
        extentTest.info("Add new Butonu tiklandi");


        Select select2 = new Select(merchant_dashboard.ddm2);
        select2.selectByIndex(1);
        extentTest.info("Coupan Options daki seceneklerden bir tanesi secildi");

        String actualresult = select2.getFirstSelectedOption().getText();
        String expectedresult = "Pending for review";
        Assert.assertEquals(actualresult, expectedresult);
        extentTest.info("Status olarak Pending for review secildi");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}