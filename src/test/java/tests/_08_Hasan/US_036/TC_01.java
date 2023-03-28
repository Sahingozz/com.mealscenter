package tests._08_Hasan.US_036;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void TC01(){
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkinini tiklanabilir ve gorunur oldugunu dogrular.
        adminDashboard.dashboardButtonu.click();
        Assert.assertTrue(adminDashboard.dashboardButtonu.isDisplayed());

        String expected ="Dashboard";
        String actual=adminDashboard.dashboardButtonu.getText();
        Assert.assertTrue(actual.contains(expected));

        // - Kullanıcı sayfayı kapatır
        Driver.closeDriver();

    }

}
