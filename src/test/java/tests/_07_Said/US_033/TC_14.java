package tests._07_Said.US_033;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class TC_14 {

    //    It should be confirmed that the Save button can be clicked.
    @Test
    public void TC013() {
        ReusableMethods.merchantLoginHasan();
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

        merchant_dashboard.promoLink.click();
        Assert.assertTrue(merchant_dashboard.promoLink.isDisplayed());

        merchant_dashboard.couponLink.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.mealscenter.com/backoffice/merchant/coupon";
        Assert.assertEquals(actualUrl,expectedUrl);

        Assert.assertTrue(merchant_dashboard.addNewButton.isEnabled());
        merchant_dashboard.addNewButton.click();


        merchant_dashboard.nameBox1.sendKeys("checkmedeals");
        Assert.assertTrue(merchant_dashboard.nameBox1.isEnabled());

        Select select = new Select(merchant_dashboard.ddm1);
        select.selectByIndex(1);
        String actualCouponType = select.getFirstSelectedOption().getText();
        String expextedCouponType="percentage";
        Assert.assertEquals(actualCouponType,expextedCouponType);

        merchant_dashboard.nameBox2.clear();
        merchant_dashboard.nameBox2.sendKeys("20.222");
        Assert.assertTrue(merchant_dashboard.nameBox2.isEnabled());

        merchant_dashboard.nameBox3.clear();
        merchant_dashboard.nameBox3.sendKeys("3");
        Assert.assertTrue(merchant_dashboard.nameBox3.isEnabled());

        merchant_dashboard.daysAvailableBox.sendKeys("Monday" + Keys.ENTER);
        Assert.assertTrue(merchant_dashboard.daysAvailableBox.isEnabled());

        merchant_dashboard.expiration.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(merchant_dashboard.expiration.isEnabled());

        merchant_dashboard.expiration17.click();
        Assert.assertTrue(merchant_dashboard.expiration17.isEnabled());


        Select select1 = new Select(merchant_dashboard.couponOptions_ddmX);
        select1.selectByIndex(1);
        String actualresult=select1.getFirstSelectedOption().getText();
        String expectedresult ="Use only once";
        Assert.assertEquals(actualresult,expectedresult);


        Select select2 = new Select(merchant_dashboard.ddm2);
        select2.selectByIndex(1);
        actualresult=select2.getFirstSelectedOption().getText();
        expectedresult ="Pending for review";
        Assert.assertEquals(actualresult,expectedresult);

        Assert.assertTrue(merchant_dashboard.saveButton.isEnabled());
        ReusableMethods.wait(2);
        merchant_dashboard.saveButton.click();

        Driver.closeDriver();

    }
}