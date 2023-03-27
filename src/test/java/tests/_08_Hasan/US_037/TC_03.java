package tests._08_Hasan.US_037;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {
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
        //  acilan sayfada "All Merchant" adindaki tum saticilara ait  olan listede degisiklik yapilabildiginin dogrular
         adminDashboard.allMerchantListEdit.click();
        Actions actions=new Actions(Driver.getDriver());
        //emailin erisilebilir olmasi dogurlanir.
        Assert.assertTrue(adminDashboard.editEmailIsim.isEnabled());
        actions.moveToElement(adminDashboard.editEmailIsim).click().perform();
        actions.sendKeys(Keys.DELETE)
                .sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE)
                .sendKeys("kar")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys("kara")
                .sendKeys(Keys.TAB)
                .sendKeys("Karacali")
                .sendKeys(Keys.TAB)
                .sendKeys("093328068432")
                .sendKeys(Keys.TAB)
                .sendKeys("hkm@hotmail.com")
                .sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(2);
       //Sayfa yapilan  degisiklik sonrasi kayit kontrol edilir
        adminDashboard.dashboardButtonu.click();
        adminDashboard.merchantButtonu.click();
        adminDashboard.listButtonu.click();
        String expected="kar";
        String actual=adminDashboard.editName.getText();
        Assert.assertTrue(actual.contains(expected));
        //-Kullanıcı sayfayı kapatır
        Driver.closeDriver();










    }
}