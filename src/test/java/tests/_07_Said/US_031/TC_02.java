package tests._07_Said.US_031;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ReusableMethods;

import java.sql.ResultSet;

public class TC_02 {
    //When we click on Order, it must be verified that
    // the All orders tab is present.

    Merchant_Dashboard merchantDashboard = new Merchant_Dashboard();
   @Test
    public void TC02(){
        ReusableMethods.merchantLoginHasan();
        merchantDashboard.merchantOrderLink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(merchantDashboard.merchantAllOrdersLink.isDisplayed());

    }
}
