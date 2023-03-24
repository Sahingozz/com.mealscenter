package tests._09_Zafer_Harun.US_038;

import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.ReusableMethods;

public class TC_02 {

    Admin_Dashboard adminLogin = new Admin_Dashboard();

  //  Verify that after logging in to admin section, in "All order" menu,
   //  total number of orders is displayed
    @Test
    public void totalNumberOforders (){
        ReusableMethods.adminLoginZafer();
        adminLogin.adminOrderLink.click();
        adminLogin.adminAllOrderLink.click();

    }
}
