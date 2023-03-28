package tests._09_Zafer_Harun.US_040;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {
    /*
    Verify that after logging in to admin panel, there is a "Promo" link on the
    left side bar and after clicking the "Coupon" link, there is a "search field"
    on the page and it is possible to make search
     */
    Admin_Dashboard adminLogin = new Admin_Dashboard();
    @Test
    public void TC_06_CouponSearchField(){
        ReusableMethods.adminLoginZafer();
        adminLogin.buyersLink.click();
        ReusableMethods.wait(1);
        adminLogin.customersLink.click();

        // taking the first element's full text->converting to array->taking the 1st index (Lastname)
        String firstElementText = adminLogin.customerList1stElement.getText();
        String [] firstElement = firstElementText.split(" ");
        String lastName = firstElement[1];
        //search lastname in the search box
        adminLogin.customerSearchField.sendKeys(lastName);

        Assert.assertTrue(adminLogin.customerSearch1stResult.getText().contains(lastName));

        Driver.closeDriver();

    }
}

