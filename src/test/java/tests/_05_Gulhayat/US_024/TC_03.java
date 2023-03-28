package tests._05_Gulhayat.US_024;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {

    @Test
    public void merchantCategory_03() {
        // - The user goes to the "Merchant login", which is the merchand panel, with the browser he opens
        //  - User enters "username" and "password" and clicks "Sign in" button
        ReusableMethods.merchantLoginAndsuccessfullLogin();

        //  - User clicks on the category link
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.FoodLink.click();
        merchant_dashboard.CategoryLink.click();

        //  - Verifies that you are on the Category page
        String expectedUrl = "https://qa.mealscenter.com/backoffice/food/category";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        //   Verify that the categories are update
        merchant_dashboard.CategoryUpdate.click();
        merchant_dashboard.CategoryAddnameTextBox.clear();
        merchant_dashboard.CategoryAddnameTextBox.sendKeys("abcdef");
        merchant_dashboard.CategoryAddDascriptionTextBox.clear();
        merchant_dashboard.CategoryAddDascriptionTextBox.sendKeys("abcdef");
        merchant_dashboard.CategoryAddSaveButton.click();

        //  - user closes the page
        Driver.closeDriver();

    }
}
