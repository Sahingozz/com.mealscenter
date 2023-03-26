package tests._09_Zafer_Harun.US_038;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {

    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /*Verify that after logging in to admin section, in "All order" menu,
total number of cancelled orders is visible */

    @Test
    public void TC_03_TotalofCancelledOrders(){
        ReusableMethods.adminLoginZafer();
        adminLogin.adminOrderLink.click();
        adminLogin.adminAllOrderLink.click();
        ReusableMethods.wait(2);

        Assert.assertTrue(adminLogin.cancelledOrderText.isDisplayed()
                               && adminLogin.cancelledOrderNumber.isDisplayed());
        Driver.closeDriver();
    }
}
