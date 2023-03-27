package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.SecureRandom;
import java.util.Set;

public class TC_12 {

    //    One of the options in Coupan Options can be selected
    //    is confirmed.

    @Test
    public void TC012() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        merchant_dashboard.couponLink.click();
        merchant_dashboard.addNewButton.click();

        Select select1 = new Select(merchant_dashboard.couponOptions_ddmX);
        select1.selectByIndex(1);
        String actualresult=select1.getFirstSelectedOption().getText();
        String expectedresult ="Use only once";
        Assert.assertEquals(actualresult,expectedresult);

        Driver.closeDriver();




        ReusableMethods.wait(3);

}}
