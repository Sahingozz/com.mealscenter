package tests._09_Zafer_Harun.US_039;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /* Verify that after logging in to admin panel, then clicking "Earnings" link,
    and clicking "Merchant Earnings" link, Merchant balances are displayed */
    @Test
    public void TC_01_merchantEarnings (){
        ReusableMethods.adminLoginZafer();
        adminLogin.earningsButton.click();
        adminLogin.merchantEarningsButton.click();

        Assert.assertTrue(adminLogin.merchantEarningsText.isDisplayed()
                        && adminLogin.balanceText.isDisplayed());

        Driver.closeDriver();
}
}