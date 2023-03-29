package tests._09_Zafer_Harun.US_038;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

    Admin_Dashboard adminLogin = new Admin_Dashboard();

    // Verify that after logging in to admin section, "All order" menu is
    //displayed and it is clickable
    @Test
    public void adminAllorderLink (){
        ReusableMethods.adminLoginZafer();
        adminLogin.adminOrderLink.click();
        Assert.assertTrue(adminLogin.adminAllOrderLink.isDisplayed()
                           && adminLogin.adminAllOrderLink.isEnabled());

        Driver.closeDriver();

    }
}
