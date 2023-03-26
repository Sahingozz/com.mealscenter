package tests._07_Said.US_032;

import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ResourceBundle;

public class TC_03 {

        //    Size List page when we click on the Size tab
        //    it must be verified that it has been opened.

       @Test
    public void TC03(){
           ReusableMethods.merchantLoginHasan();
           Merchant_Dashboard merchant_dashboard =new Merchant_Dashboard();
           merchant_dashboard.attributesLink.click();
           merchant_dashboard.attributesSizeLink.click();
           ReusableMethods.wait(2);
           String actualUrl= Driver.getDriver().getCurrentUrl();
           String expectedUrl="https://qa.mealscenter.com/backoffice/attrmerchant/size_list";
           Assert.assertEquals(actualUrl,expectedUrl);
       }
}
