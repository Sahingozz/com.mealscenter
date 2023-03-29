package tests._09_Zafer_Harun.US_038;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_07 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();


    /*
Verify that after logging in to admin panel, in "Orders" menu, and
clicking "All order" link that it is possible to list the orders
according to Order ID */

    @Test
    public void TC_07_sortByOrderID (){
        ReusableMethods.adminLoginZafer();
        adminLogin.adminOrderLink.click();
        adminLogin.adminAllOrderLink.click();
        adminLogin.sortByOrderIDButton.click();
        Assert.assertTrue(adminLogin.sortByOrderIDButton.isEnabled());

        Driver.closeDriver();


    }

}
