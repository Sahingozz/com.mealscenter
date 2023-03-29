package tests._07_Said.US_032;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_13 extends TestBaseReport {

    //    After clicking the Cooking Reference tab, click Cooking Reference List
//    page must be confirmed to open.
    @Test
    public void TC13() {
        extentTest = extentReports.createTest("US_032_TC_13", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");

        merchant_dashboard.attributesCookingReferenceLink.click();
        extentTest.info("Attributes sekmesinin altinda Cooking Reference linki oldugu dogrulandi.");


        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.mealscenter.com/backoffice/attrmerchant/cookingref_list";
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("Attributes sekmesinin altinda Cooking Reference linki oldugu dogrulandi.");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}
