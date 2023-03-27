package tests._07_Said.US_032;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.dnd.DragGestureEvent;

public class TC_05 {

  //  It must be verified that information can be entered in the Size Name Box.

    @Test
    public void TC05(){
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

        merchant_dashboard.attributesLink.click();
        merchant_dashboard.attributesSizeLink.click();
        merchant_dashboard.addNewButton.click();
        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantSize"));
        Assert.assertTrue( merchant_dashboard.nameBox1.isEnabled());
        ReusableMethods.wait(2);
        Driver.closeDriver();




    }
}
