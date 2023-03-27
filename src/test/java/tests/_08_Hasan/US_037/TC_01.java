package tests._08_Hasan.US_037;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {
    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_11() {
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel", "123456");
        // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
        adminDashboard.dashboardButtonu.click();
        //-Kullanıcı acilan sayfada sol panelde bulunan "Dasboard"  panelinin altinda bulunan "Merchant"
        //linkine basar  ve acilan sekmede list linkinin tiklar.
        adminDashboard.merchantButtonu.click();
        //-Kullanici acilan sekmelerden "List"  linkinin tiklanabilir  oldugunu dogrular
        adminDashboard.listButtonu.click();
        String expectedUrl="list";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        //-Kullanıcı sayfayı kapatır
    }
}
