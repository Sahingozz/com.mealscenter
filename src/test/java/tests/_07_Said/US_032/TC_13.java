package tests._07_Said.US_032;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_13 {

//    After clicking the Cooking Reference tab, click Cooking Reference List
//    page must be confirmed to open.
    @Test
    public void TC13(){

        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

        merchant_dashboard.attributesLink.click();
        merchant_dashboard.attributesCookingReferenceLink.click();

        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.mealscenter.com/backoffice/attrmerchant/cookingref_list";
        Assert.assertEquals(actualUrl,expectedUrl);
        Driver.closeDriver();
    }
}
