package tests._07_Said.US_032;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.util.Arrays;

public class TC_17 extends TestBaseReport {


    //    When the Save button is clicked, the information we have written
    //    it must be confirmed that it was recorded.

    @Test
    public void test17() {
        extentTest = extentReports.createTest("US_032_TC_17", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");

        merchant_dashboard.attributesCookingReferenceLink.click();
        extentTest.info("Attributes sekmesinin altinda Cooking Reference linki oldugu dogrulandi.");

        merchant_dashboard.addNewButton.click();
        extentTest.info("add new Button'un tiklanabilir oldugu dogrulandi.");

        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantIngredients"));
        Assert.assertTrue(merchant_dashboard.ddm1.isEnabled());
        extentTest.info("All Cooking Reference altindaki Cooking Reference Name kutusuna bilgi girilebilir oldugunu dogrularndi");

        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByVisibleText("Draft");
        extentTest.info("All Cooking Reference altindaki Draft seceneginin secilebilir oldugunu dogrulandi.");

        merchant_dashboard.saveButton.click();
        extentTest.info("Save butonunun tiklanabilir oldugu dogrulandi.");

        String entries = merchant_dashboard.showingEntries.getText();
        String[] entriesSplit = entries.split(" ");
        System.out.println(Arrays.toString(entriesSplit));
        int num = Integer.parseInt(entriesSplit[5]);
        System.out.println("num = " + num);
        Assert.assertTrue(num > 0);
        extentTest.info("Save butonuna tiklandiginda yazmis oldugumuz bilgilerin kaydedildigi dogrulanmali.");

        //delete
        Assert.assertTrue(merchant_dashboard.deleteButton.isEnabled());
        Assert.assertTrue(merchant_dashboard.deleteButtonIcon.isEnabled());
        merchant_dashboard.deleteButtonIcon.click();
        extentTest.info("Delete iconunun tiklanabilir oldugu dogrulandi");

        ReusableMethods.wait(2);
        merchant_dashboard.deleteButton.click();
        extentTest.info("Kaydetmis oldugumuz Cooking Reference bilgisi silindi.");

        ReusableMethods.wait(2);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }
}
