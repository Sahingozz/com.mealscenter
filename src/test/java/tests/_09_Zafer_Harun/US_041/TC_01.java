package tests._09_Zafer_Harun.US_041;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

    Admin_Dashboard adminLogin = new Admin_Dashboard();
    /*
    Verify that after logging in to admin panel, there is a "Buyers" link on the
    left side bar and after clicking the "Customers" link, it is possible to list all
    customers and sort the list according to Name
     */

    @Test
    public void TC_01_customersList() {


        ReusableMethods.adminLoginZafer();
        adminLogin.buyersLink.click();
        ReusableMethods.wait(1);
        adminLogin.customersLink.click();

        String expectedText1 = "Showing";
        String expectedText2 = "entries";

        Assert.assertTrue(adminLogin.customersListTotalEntries.getText().contains(expectedText1)
                && adminLogin.customersListTotalEntries.getText().contains(expectedText2)
                && adminLogin.customersListText.isDisplayed());

               Driver.closeDriver();
    }
}

