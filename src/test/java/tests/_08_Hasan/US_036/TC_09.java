package tests._08_Hasan.US_036;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_09 {

        Admin_Dashboard adminDashboard=new Admin_Dashboard();
        @Test
        public void TC_09(){
            // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
            // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
            ReusableMethods.adminLogin("hasan.adiguzel","123456");
            // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
            adminDashboard.dashboardButtonu.click();
            // ve acilan sayfada "New Customer " bolumunun gorunur oldugunu ve degerler icerdigini dogrular
            Assert.assertTrue(adminDashboard.newCustomerLink.isDisplayed());
            Assert.assertFalse(adminDashboard.newCustomerLink.getText().isEmpty());
            // - Kullanıcı sayfayı kapatır
            Driver.closeDriver();
        }
    }
