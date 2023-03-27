package tests._05_Gulhayat.US_023;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_11 {
    @Test
    public void merchantDashboard_11(){
        // - The user goes to the "Merchant login", which is the merchand panel, with the browser he opens
        //  - User enters "username" and "password" and clicks "Sign in" button
        ReusableMethods.merchantLoginAndsuccessfullLogin();
        //  - Verifies that you are on the Dashboard page
        String expectedUrl="https://qa.mealscenter.com/backoffice/merchant/dashboard";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //  - Verifies my best customers are visible
        Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.TopCustomers.isDisplayed();
        //  - User closes the page
        Driver.closeDriver();
    }
}
