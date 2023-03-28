package tests._09_Zafer_Harun.US_040;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /*
    Verify that after logging in to admin panel, there is a "Promo" link on the
    left side bar and after clicking the "Coupon" link,  there is an "update"
    button and it possible to update the coupon
     */
    @Test
    public void TC_03_CouponUpdate(){
        // admin panele giriş yapılıp, promo->coupon list bölümüne geçilir
        ReusableMethods.adminLoginZafer();
        adminLogin.promoLink.click();
        ReusableMethods.wait(1);
        adminLogin.couponLink.click();

        Assert.assertTrue(adminLogin.couponUpdateButton.isDisplayed()
                && adminLogin.couponUpdateButton.isEnabled());

        Driver.closeDriver();
    }
}
