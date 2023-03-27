package tests._09_Zafer_Harun.US_041;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.ReusableMethods;

public class TC_03 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();
    /*
    Verify that after logging in to admin panel, there is a "Buyers" link on the
    left side bar and after clicking the "Customers" link, it is possible to
    update any customer's information
     */
    @Test
    public void TC_03_updateCustomerInfo (){

        ReusableMethods.adminLoginZafer();
        adminLogin.buyersLink.click();
        ReusableMethods.wait(1);
        adminLogin.customersLink.click();

        adminLogin.customerInfoUpdateButton.click();
        adminLogin.contactPhone.clear();
        adminLogin.contactPhone.sendKeys("1010101010");
        adminLogin.customerInfoUpdateSaveButton.click();
        Assert.assertTrue(adminLogin.updatedMessage.isDisplayed());
    }
    }
