package tests._08_Hasan.US_035;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public  void TC_04(){
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        // - Kullanıcı sol  ust panelde "Admin ismini "  ve "Email adresinin "  gorunur
        //   oldugunu doğrular.
        String expected ="Hasan";
        String actualProfil= adminDashboard.profilName.getText();
        Assert.assertTrue(actualProfil.contains(expected));

        expected ="adiguzel@gmail";
        actualProfil=adminDashboard.profilName.getText();
        Assert.assertTrue(actualProfil.contains(expected));


        // - Kullanıcı sayfayı kapatır
        Driver.closeDriver();

    }
}
