package tests._07_Said.US_031;

import com.beust.ah.A;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.util.Arrays;

public class TC_04 extends TestBaseReport {


//    On the page that opens, under the Order history text, click Order
//    it must be verified that the quantity is greater than 0

    @Test
    public void TC04() {
        extentTest = extentReports.createTest("US_031_TC_04", "ilgili alana gidildigi dogrulanmali");
        Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();
        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        merchantDashboard.merchantOrderLink.click();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        ReusableMethods.wait(2);
        merchantDashboard.merchantAllOrdersLink.click();
        extentTest.info("Merchant order linkine tiklandi");

        ReusableMethods.wait(2);
        String entries = merchantDashboard.showingEntries.getText();
        String[] entriesSplit = entries.split(" ");
        int num = Integer.parseInt(entriesSplit[5]);
        Assert.assertTrue(num > 0);
        extentTest.info("Order history altinda yer alan Orders'larin miktarinin 0 dan büyük oldugunu dogrulandi");

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");
    }
}
