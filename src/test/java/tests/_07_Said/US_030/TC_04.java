package tests._07_Said.US_030;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_04 extends TestBaseReport {


    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();

    @Test
    public void TC_04() {
        extentTest = extentReports.createTest("US_030_TC_04", "ilgili alana gidildigi dogrulanmali");


//        After opening the "Scheduled" page
//        "Scheduled" orders in the "Delivery Date/Time" section
//        date information must be verified as available.

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        merchantDashboard.merchantOrderLink.click();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");

        merchantDashboard.merchantScheduledLink.click();
        extentTest.info("Merchant Scheduled linki görüldü");

        String dateTimeInformation = merchantDashboard.merchantScheduledDeliveryDateTime.getText();
        Assert.assertTrue(dateTimeInformation.contains("Scheduled at"));
        extentTest.info("Scheduled yazisinin oldugu görüldü");

        ReusableMethods.wait(2);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }

}
