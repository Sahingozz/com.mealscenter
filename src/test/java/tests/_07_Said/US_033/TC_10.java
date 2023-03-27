package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_10 {
//    It should be verified that days can be selected from Days Available.
@Test
public void TC010() {
    ReusableMethods.merchantLoginHasan();
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
    merchant_dashboard.promoLink.click();
    merchant_dashboard.couponLink.click();
    merchant_dashboard.addNewButton.click();

    merchant_dashboard.daysAvailableBox.sendKeys("Monday"+ Keys.ENTER);
   Assert.assertTrue(merchant_dashboard.daysAvailableBox.isEnabled());
    ReusableMethods.wait(3);
    Driver.closeDriver();
}
}
