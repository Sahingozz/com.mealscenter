package tests._09_Zafer_Harun.US_038;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();
    /*Verify that after logging in to admin section, in "All order" menu,
    total value of the orders is displayed */

    @Test
    public void TC_05_TotalValueOfOrders(){
        ReusableMethods.adminLoginZafer();
        adminLogin.adminOrderLink.click();
        adminLogin.adminAllOrderLink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminLogin.totalValueOfOrdersText.isDisplayed()
                               && adminLogin.totalValueOfOrders.isDisplayed());
        Driver.closeDriver();
    }
}
