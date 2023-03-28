package tests._08_Hasan.US_035;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {

    @Test
    public void TC_02(){
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        // - Kullanıcı "Url"ye gider
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        //  ve Url'nin "https://qa.mealscenter.com/backoffice/admin/dashboard"  icerdiginin dogrular
        String expectedUrl="admin/dashboard";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        // - Kullanıcı sayfayı kapatır
        Driver.closeDriver();

    }
}
