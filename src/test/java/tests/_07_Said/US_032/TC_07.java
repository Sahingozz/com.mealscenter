package tests._07_Said.US_032;

import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_07 extends TestBaseReport {

    //    Confirm that the Save button is clickable.
    @Test
    public void TC07() {
        extentTest = extentReports.createTest("US_032_TC_07", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");

        merchant_dashboard.attributesSizeLink.click();
        extentTest.info("Attributes sekmesinin altinda size linki oldugu dogrulandi.");

        merchant_dashboard.addNewButton.click();
        extentTest.info("add new Button'un tiklanabilir oldugu dogrulandi.");

        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantSize"));
        extentTest.info("All Size\" altindaki \"Size Name\" kutusuna bilgi girilebilir oldugunu dogrular");

        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByVisibleText("Publish");
        extentTest.info("- Kullanici \"All Size\" altindaki \"Publish\" seceneginin secilebilir oldugunu dogrular.");

        Assert.assertTrue(merchant_dashboard.saveButton.isEnabled());
        merchant_dashboard.saveButton.click();
        extentTest.info("Save butonunun tiklanabilir oldugu dogrulandi.");

        ReusableMethods.wait(2);

        //delete
        Assert.assertTrue(merchant_dashboard.deleteButton.isEnabled());
        Assert.assertTrue(merchant_dashboard.deleteButtonIcon.isEnabled());
        merchant_dashboard.deleteButtonIcon.click();
        extentTest.info("Delete iconunun tiklanabilir oldugu dogrulandi");
        ReusableMethods.wait(2);

        merchant_dashboard.deleteButton.click();
        extentTest.info("Delete butonunun tiklanabilir oldugu dogrulandi");
        ReusableMethods.wait(2);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }
}
