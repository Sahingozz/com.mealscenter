package tests._05_Gulhayat.US_025;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;



public class TC_02 {

    @Test
    public void merchantItem_02() {
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
        //   User confirms that a new item can be added
        merchant_dashboard.ItemAdd.click();
        merchant_dashboard.ItemAddNameTexBox.sendKeys("cheetos");
        merchant_dashboard.ItemAddCategorySnacks.click();

       merchant_dashboard.ItemAddSaveButtonu.isEnabled();

        //  - User closes the page
          Driver.closeDriver();





    }
}
