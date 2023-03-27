package tests._07_Said.US_030;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ReusableMethods;

public class TC_04 {


     Merchant_Dashboard merchantDashboard=new Merchant_Dashboard();

    @Test
    public void TC_04(){

//        After opening the "Scheduled" page
//        "Scheduled" orders in the "Delivery Date/Time" section
//        date information must be verified as available.

        ReusableMethods.merchantLoginHasan();
        merchantDashboard.merchantOrderLink.click();
        merchantDashboard.merchantScheduledLink.click();
        String dateTimeInformation = merchantDashboard.merchantScheduledDeliveryDateTime.getText();
        Assert.assertTrue(dateTimeInformation.contains("Scheduled at"));
        ReusableMethods.wait(2);



    }

}
