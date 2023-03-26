package tests._09_Zafer_Harun.US_039;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class TC_02 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /* Verify that after logging in to admin panel and clicking "Earnings" link,
       and then "Earnings list", it is possible to sort out the merchant list
       according to Merchant and Balance and after clicking the Actions eye
       button, detailed info about the Merchant is displayed */
    @Test
    public void TC_02_merchantListSort() {
        ReusableMethods.adminLoginZafer();
        adminLogin.earningsButton.click();
        adminLogin.merchantEarningsButton.click();

        Assert.assertTrue(adminLogin.merchantText.isEnabled()
                             && adminLogin.balanceText.isEnabled());

        //pop-up sayfasında istenen bilginin gösterildiğinin testi
        adminLogin.actionsEyeButton.click();
        ReusableMethods.wait(4);
        Assert.assertTrue(adminLogin.merchantInfoText.getText().contains("Merchant Info"));

        Driver.quitDriver();
    }
}
