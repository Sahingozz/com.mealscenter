package tests._09_Zafer_Harun.US_038;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();
    /*Verify that after logging in to admin section, in "All order" menu,
total number of refunds is displayed */
    @Test
    public void TC_04_TotalNumberOfRefunds(){
        ReusableMethods.adminLoginZafer();
        adminLogin.adminOrderLink.click();
        adminLogin.adminAllOrderLink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminLogin.totalRefundText.isDisplayed()
                                && adminLogin.totalRefundNumber.isDisplayed());
        Driver.closeDriver();
    }
}
