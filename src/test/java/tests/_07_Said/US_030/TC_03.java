package tests._07_Said.US_030;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.awt.dnd.DragGestureEvent;
import java.time.format.DateTimeFormatter;

public class TC_03 extends TestBaseReport {
    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();

    @Test
    public void TC_03() {
        extentTest = extentReports.createTest("US_030_TC_03", "ilgili alana gidildigi dogrulanmali");
//        When we click on the "Scheduled" tab,
//         we need to verify that it opens the "Orders Scheduled" page.

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");
        merchantDashboard.merchantOrderLink.click();
        extentTest.info("Merchant order linkine tiklandi");
        merchantDashboard.merchantScheduledLink.click();
        extentTest.info("Merchant Scheduled linki görüldü");
        ReusableMethods.wait(2);

        String actualURl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.mealscenter.com/backoffice/orders/scheduled";
        Assert.assertTrue(actualURl.contains(expectedUrl));
        extentTest.info("Dogru urlde oldugu dogrulandi");

        ReusableMethods.wait(2);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");
    }
}
