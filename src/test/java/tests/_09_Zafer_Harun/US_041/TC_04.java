package tests._09_Zafer_Harun.US_041;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {

    Admin_Dashboard adminLogin = new Admin_Dashboard();
    /*Verify that after logging in to admin panel, there is a "Buyers" link on the
    left side bar and after clicking the "Customers" link, it is possible to
    delete any customer's information */

    @Test
    public void TC_04_deleteCustomer(){
        ReusableMethods.adminLoginZafer();
        adminLogin.buyersLink.click();
        ReusableMethods.wait(1);
        adminLogin.customersLink.click();
        String customer = Driver.getDriver().findElement(By.className("odd")).getText();
        adminLogin.customerDeleteButton.click();
        ReusableMethods.wait(2);
        adminLogin.customerDeleteConfirm.click();
        ReusableMethods.wait(2);
        Assert.assertFalse(Driver.getDriver().findElement(By.className("odd")).getText().contains(customer));

        Driver.closeDriver();

    }
}
