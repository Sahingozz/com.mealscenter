package tests._09_Zafer_Harun.US_040;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {

    Admin_Dashboard adminLogin = new Admin_Dashboard();
    /*Verify that after logging in to admin panel, there is a "Promo" link on the
    left side bar and after clicking the "Coupon" link, it possible to list the
    coupons according to name and number of usage. */

    @Test
    public void TC_05_ListingByNameAndUsage() {
        // admin panele giriş yapılıp, promo->coupon list bölümüne geçilir
        ReusableMethods.adminLoginZafer();
        adminLogin.promoLink.click();
        ReusableMethods.wait(1);
        adminLogin.couponLink.click();

        Assert.assertTrue(adminLogin.couponSortByNameButton.isDisplayed()
                && adminLogin.couponSortByNameButton.isEnabled()
                && adminLogin.couponSortByUsage.isDisplayed()
                && adminLogin.couponSortByUsage.isEnabled());

        Driver.closeDriver();
    }
}

