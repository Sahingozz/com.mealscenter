package tests._07_Said.US_030;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.dnd.DragGestureEvent;
import java.time.format.DateTimeFormatter;

public class TC_03 {
    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();

    @Test
    public void TC_03() {
//        When we click on the "Scheduled" tab,
//         we need to verify that it opens the "Orders Scheduled" page.

        ReusableMethods.merchantLoginHasan();
        merchantDashboard.merchantOrderLink.click();
        merchantDashboard.merchantScheduledLink.click();
        ReusableMethods.wait(2);

        String actualURl= Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.mealscenter.com/backoffice/orders/scheduled";
        Assert.assertTrue(actualURl.contains(expectedUrl));

        ReusableMethods.wait(2);

        Driver.closeDriver();
    }
}
