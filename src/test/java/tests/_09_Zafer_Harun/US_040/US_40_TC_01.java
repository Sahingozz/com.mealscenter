package tests._09_Zafer_Harun.US_040;

import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.ReusableMethods;

public class US_40_TC_01 {
    /*
    Verify that after logging in to admin panel, there is a "Promo" link on the
    left side bar and after clicking the "Coupon" link, there is an "add new"
    button and it possible to add a coupon
     */
    Admin_Dashboard adminLogin = new Admin_Dashboard();
    @Test
    public void TC_01_PromoLinkAddFunction(){

        // admin panele giriş yapılıp, add new coupon ekranına geçilir
        ReusableMethods.adminLoginZafer();
        adminLogin.promoLink.click();
        adminLogin.couponLink.click();
        adminLogin.addNewCouponButton.click();

        // add new coupon formu doldurulur
        adminLogin.addCouponNameField.sendKeys("Fruehling Campaign");

    }

}

