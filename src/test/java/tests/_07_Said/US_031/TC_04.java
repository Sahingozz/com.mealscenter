package tests._07_Said.US_031;

import com.beust.ah.A;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.Arrays;

public class TC_04 {


//    On the page that opens, under the Order history text, click Order
//    it must be verified that the quantity is greater than 0

    @Test
    public void TC04(){
        Merchant_Dashboard merchantDashboard =new Merchant_Dashboard();
        ReusableMethods.merchantLoginHasan();
        merchantDashboard.merchantOrderLink.click();
        ReusableMethods.wait(2);
        merchantDashboard.merchantAllOrdersLink.click();
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        String entries= merchantDashboard.showingEntries.getText();

         String []entriesSplit=entries.split(" ");

         int num=Integer.parseInt(entriesSplit[5]);
        Assert.assertTrue(num>0);

        Driver.closeDriver();
    }
}
