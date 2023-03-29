package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_10 extends TestBaseReport {

    // It should be verified that information can be entered in the "Ingredients Name Box".

    @Test
    public void test10() {
        extentTest = extentReports.createTest("US_032_TC_10", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");

        merchant_dashboard.attributesIngredientsLink.click();
        extentTest.info("Attributes sekmesinin altinda Ingredients linki oldugu dogrulandi.");

        merchant_dashboard.addNewButton.click();
        extentTest.info("add new Button'un tiklanabilir oldugu dogrulandi.");

        Assert.assertTrue(merchant_dashboard.nameBox1.isEnabled());
        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantIngredients"));
        extentTest.info("All Ingredient altindaki Ingredient Name kutusuna bilgi girilebilir oldugunu dogrularndi");

        ReusableMethods.wait(2);
        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }
}
