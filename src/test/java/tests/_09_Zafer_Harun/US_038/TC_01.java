package tests._09_Zafer_Harun.US_038;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.ReusableMethods;

public class TC_01 {

    Admin_Dashboard adminLogin = new Admin_Dashboard();

    // AdminAllorderLink
    @Test
    public void adminAllorderLink (){
        ReusableMethods.adminLoginZafer();
        adminLogin.adminOrderLink.click();
        Assert.assertTrue(adminLogin.adminAllOrderLink.isDisplayed()
                           && adminLogin.adminAllOrderLink.isEnabled());

    }
}
