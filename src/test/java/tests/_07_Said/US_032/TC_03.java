package tests._07_Said.US_032;

import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.util.ResourceBundle;

public class TC_03 extends TestBaseReport {

    //    Size List page when we click on the Size tab
    //    it must be verified that it has been opened.

    @Test
    public void TC03() {
        extentTest = extentReports.createTest("US_032_TC_03", "ilgili alana gidildigi dogrulanmali");
        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");

        merchant_dashboard.attributesSizeLink.click();
        extentTest.info("Attributes sekmesinin altinda size linki oldugu dogrulandi.");

        ReusableMethods.wait(2);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.mealscenter.com/backoffice/attrmerchant/size_list";
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Dogru Url'e gidildigi dogrulandi");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}
