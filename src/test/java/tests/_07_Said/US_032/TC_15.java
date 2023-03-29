package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_15 extends TestBaseReport {


//    Enter information in the "Name box" on the "All Cooking Reference" page
//    accessibility must be verified

    @Test
    public void test15() {
        extentTest = extentReports.createTest("US_032_TC_15", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        merchant_dashboard.attributesCookingReferenceLink.click();
        extentTest.info("Attributes sekmesinin altinda Cooking Reference linki oldugu dogrulandi.");

        merchant_dashboard.addNewButton.click();
        extentTest.info("add new Button'un tiklanabilir oldugu dogrulandi.");

        Assert.assertTrue(merchant_dashboard.nameBox1.isEnabled());
        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantIngredients"));
        extentTest.info("All Cooking Reference altindaki Cooking Reference Name kutusuna bilgi girilebilir oldugunu dogrularndi");

        ReusableMethods.wait(2);
        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");

    }
}
