package tests._07_Said.US_033;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_13 {


    //    It should be verified that publish can be selected as status.
    @Test
    public void TC013() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.promoLink.click();
        merchant_dashboard.couponLink.click();
        merchant_dashboard.addNewButton.click();

        Select select2 =new Select(merchant_dashboard.ddm2);
        select2.selectByIndex(1);

        String actualresult=select2.getFirstSelectedOption().getText();
        String expectedresult ="Pending for review";
        Assert.assertEquals(actualresult,expectedresult);

        Driver.closeDriver();





    }
}