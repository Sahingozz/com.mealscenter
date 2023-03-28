package tests._05_Gulhayat.US_025;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {

    @Test
    public void merchantItem_04() {
        // - The user goes to the "Merchant login", which is the merchand panel, with the browser he opens
        //  - User enters "username" and "password" and clicks "Sign in" button


        ReusableMethods.merchantLoginAndsuccessfullLogin();

        //  - User clicks the items link under Food on the Dashboard page
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.FoodLink.click();
        merchant_dashboard.ItemsLink.click();

        //  - User verifies on Items page
        String expectedUrl = "https://qa.mealscenter.com/backoffice/food/items";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        //   - Verifies that user list can be deleted

       merchant_dashboard.ItemDelete.click();

        //  - User closes the page
       Driver.closeDriver();





    }
}
