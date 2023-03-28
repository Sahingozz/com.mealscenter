package tests._07_Said.US_032;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_11 {


    //    It should be verified that "Draft" can be selected as Status.
    @Test
    public void test11() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
        merchant_dashboard.attributesLink.click();
        merchant_dashboard.attributesIngredientsLink.click();
        merchant_dashboard.addNewButton.click();
        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantIngredients"));
        Assert.assertTrue(merchant_dashboard.ddm1.isEnabled());
        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByVisibleText("Draft");
        ReusableMethods.wait(2);
        Driver.closeDriver();
    }
}