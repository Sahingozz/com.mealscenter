package tests._09_Zafer_Harun.US_040;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /*
    Verify that after logging in to admin panel, there is a "Promo" link on the
    left side bar and after clicking the "Coupon" link,it possible
    to list the coupon
     */
    @Test
    public void TC_02_CouponList() {
        // admin panele giriş yapılıp, promo->coupon list bölümüne geçilir
        ReusableMethods.adminLoginZafer();
        adminLogin.promoLink.click();
        ReusableMethods.wait(1);
        adminLogin.couponLink.click();

        // Listenin göstergesi olan textlerin bulunup bulunmadığı test edilir
        String expectedText1="Showing";
        String expectedText2="entries";
        Assert.assertTrue(adminLogin.couponListText.isDisplayed()
        && adminLogin.couponListResultsText.getText().contains(expectedText1)
                && adminLogin.couponListResultsText.getText().contains(expectedText2));

        Driver.closeDriver();
    }

}
