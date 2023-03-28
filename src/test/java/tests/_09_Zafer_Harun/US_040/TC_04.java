package tests._09_Zafer_Harun.US_040;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /*Verify that after logging in to admin panel, there is a "Promo" link on the
    left side bar and after clicking the "Coupon" link, there is a "delete" button
    and it possible to delete the coupon */
    @Test
    public void TC_04_CouponDelete(){
        // admin panele giriş yapılıp, promo->coupon list bölümüne geçilir
        ReusableMethods.adminLoginZafer();
        adminLogin.promoLink.click();
        ReusableMethods.wait(1);
        adminLogin.couponLink.click();

        Assert.assertTrue(adminLogin.couponDeleteButton.isDisplayed()
         && adminLogin.couponDeleteButton.isEnabled());

        Driver.closeDriver();
    }

}
