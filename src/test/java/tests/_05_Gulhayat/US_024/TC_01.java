package tests._05_Gulhayat.US_024;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

    @Test
    public void merchantCategory() {
        // - The user goes to the "Merchant login", which is the merchand panel, with the browser he opens
        //  - User enters "username" and "password" and clicks "Sign in" button
        ReusableMethods.merchantLoginAndsuccessfullLogin();

        //  - User clicks on the category link
        Merchant_Dashboard merchant_dashboard=new Merchant_Dashboard();
        merchant_dashboard.FoodLink.click();
        merchant_dashboard.CategoryLink.click();

        //  - Verifies that you are on the Category page
        String expectedUrl="https://qa.mealscenter.com/backoffice/food/category";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //  - Verifies Category List ist visible
        merchant_dashboard.CategoryList.isDisplayed();

        //  - user closes the page
        Driver.closeDriver();



    }
}
