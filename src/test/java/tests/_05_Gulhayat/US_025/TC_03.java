package tests._05_Gulhayat.US_025;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {

    @Test
    public void merchantItem_03() {
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
        //   User confirms that they can edit items
        merchant_dashboard.ItemUpdate.click();
        merchant_dashboard.ItemUpdateNameTexBox.clear();
        merchant_dashboard.ItemUpdateNameTexBox.sendKeys("cheetos2");
        merchant_dashboard.ItemUpdateSaveButton.isEnabled();
        //  - User closes the page
       Driver.closeDriver();







    }
}
