package tests._07_Said.US_032;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_11 extends TestBaseReport {


    //    It should be verified that "Draft" can be selected as Status.
    @Test
    public void test11() {
        extentTest = extentReports.createTest("US_032_TC_11", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");

        merchant_dashboard.attributesIngredientsLink.click();
        extentTest.info("Attributes sekmesinin altinda Ingredients linki oldugu dogrulandi.");


        merchant_dashboard.addNewButton.click();
        extentTest.info("add new Button'un tiklanabilir oldugu dogrulandi.");

        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantIngredients"));
        Assert.assertTrue(merchant_dashboard.ddm1.isEnabled());
        extentTest.info("All Ingredient altindaki Ingredient Name kutusuna bilgi girilebilir oldugunu dogrularndi");

        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByVisibleText("Draft");
        Assert.assertTrue(merchant_dashboard.ddm1.isEnabled());
        extentTest.info("All Ingredient altindaki Draft seceneginin secilebilir oldugunu dogrulandi.");


        ReusableMethods.wait(2);
        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }
}
