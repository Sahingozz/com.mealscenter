package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_10 {

    // It should be verified that information can be entered in the "Ingredients Name Box".

    @Test
    public void test10() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        merchant_dashboard.attributesIngredientsLink.click();
        merchant_dashboard.addNewButton.click();
       Assert.assertTrue( merchant_dashboard.nameBox1.isEnabled());
       merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantIngredients"));
       ReusableMethods.wait(2);
        Driver.closeDriver();
    }
}
