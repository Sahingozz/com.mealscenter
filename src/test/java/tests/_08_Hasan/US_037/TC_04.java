package tests._08_Hasan.US_037;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TC_04 {

    // sonra da  acilan sayfada "All Merchant "
    //   adindaki tum saticilara ait  olan listede silme isleminin  yapilabildiginin dogrular.
    // - Kullanıcı sayfayı kapatır.

    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_11() throws IOException {
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel", "123456");
        // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
        adminDashboard.dashboardButtonu.click();
        //-Kullanıcı acilan sayfada sol panelde bulunan "Dasboard"  panelinin altinda bulunan "Merchant"
        //linkine basar  ve acilan sekmede list linkinin tiklar.
        adminDashboard.merchantButtonu.click();
        //-Kullanici acilan sekmelerden "List"  linkinin tiklar
        adminDashboard.listButtonu.click();
        // sonra da  acilan sayfada "All Merchant " adindaki tum saticilara ait  olan listede silme isleminin  yapilabildiginin dogrular.
       ReusableMethods.getScreenShotFullScreen(Driver.getDriver());
        adminDashboard.deleteButton.click();


    }
}
