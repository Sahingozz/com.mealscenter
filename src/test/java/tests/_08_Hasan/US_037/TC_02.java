package tests._08_Hasan.US_037;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {
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
        //-Kullanici acilan sekmelerden "List"  linkinin tiklar
        adminDashboard.listButtonu.click();
        //Kullanici "List"  linkinin  altinda  acilan sayfada "All Merchant " adinda tum saticilara ait bir listenin oldugunu dogrular
        String expected="All Merchant";
        String actual= adminDashboard.allMerchantBasligi.getText();
        Assert.assertTrue(actual.contains(expected));
        //Basliklari iceren kismi dogrular.
        Assert.assertFalse(ReusableMethods.getElementsText(By.xpath("//th[@class='sorting']")).isEmpty());
        System.out.println(ReusableMethods.getElementsText(By.xpath("//th[@class='sorting']")));
        //Kullanici listenin icerigini dogrular
        Assert.assertFalse(ReusableMethods.getElementsText(By.xpath("//tbody/tr")).isEmpty());
        System.out.println(ReusableMethods.getElementsText(By.xpath("//tbody/tr")));
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();
    }
}
