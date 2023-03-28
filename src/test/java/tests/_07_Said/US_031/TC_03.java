package tests._07_Said.US_031;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {

    //    When we click on the All orders tab, it tells us that it opens the All orders page.
    //    must be verified.

    @Test
    public void TC03(){
        Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();
        ReusableMethods.merchantLoginHasan();
        merchantDashboard.merchantOrderLink.click();
        ReusableMethods.wait(2);
        merchantDashboard.merchantAllOrdersLink.click();
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.mealscenter.com/backoffice/orders/history";
        Assert.assertEquals(actualUrl,expectedUrl);



    }
}
