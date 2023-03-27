package tests._07_Said.US_033;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_07 {
//    It should be verified that the type can be selected from Coupon type.
@Test
public void TC07() {
    ReusableMethods.merchantLoginHasan();
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();
    merchant_dashboard.promoLink.click();
    merchant_dashboard.couponLink.click();
    merchant_dashboard.addNewButton.click();


    Select select = new Select(merchant_dashboard.ddm1);
    select.selectByIndex(1);
      String actualCouponType = select.getFirstSelectedOption().getText();
      String expextedCouponType="percentage";
      Assert.assertEquals(actualCouponType,expextedCouponType);
    ReusableMethods.wait(3);
    Driver.closeDriver();
}

}
