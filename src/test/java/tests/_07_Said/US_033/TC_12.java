package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ReusableMethods;

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

        merchant_dashboard.nameBox1.sendKeys("checkmedeals");
        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByIndex(1);
        merchant_dashboard.nameBox2.clear();
        merchant_dashboard.nameBox2.sendKeys("20.222");

        merchant_dashboard.nameBox3.clear();
        merchant_dashboard.nameBox3.sendKeys("3");

        merchant_dashboard.daysAvailableBox.sendKeys("Monday"+ Keys.ENTER);
        merchant_dashboard.expiration.click();
        ReusableMethods.wait(2);
        merchant_dashboard.expiration17.click();
        merchant_dashboard.couponOptions_ddmX.click();



        ReusableMethods.wait(3);

}}
