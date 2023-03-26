package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_15 {


//    Enter information in the ""Name"" box on the All Cooking Reference page
//    accessibility must be verified

    @Test
    public void test15() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        merchant_dashboard.attributesCookingReferenceLink.click();
        merchant_dashboard.addNewButton.click();
        Assert.assertTrue( merchant_dashboard.nameBox1.isEnabled());
        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantIngredients"));
        ReusableMethods.wait(2);
        Driver.closeDriver();
    }
}
