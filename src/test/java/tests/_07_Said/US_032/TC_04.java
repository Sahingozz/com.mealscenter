package tests._07_Said.US_032;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {

    //    Click the Add button on the Size List page
    //    is verified.
    @Test
    public void TC04(){
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard =new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        merchant_dashboard.attributesSizeLink.click();
        Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
        Driver.closeDriver();
    }
}
