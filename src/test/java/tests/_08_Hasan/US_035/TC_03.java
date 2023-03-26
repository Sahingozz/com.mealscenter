package tests._08_Hasan.US_035;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03 {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void TC_03(){
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel","123456");
        // - Kullanıcı acilan sayfada "Meals Center"  basliginin gorunur oldugunu dogrular
        String expectedTitle="Dashboard";
        String actualTitle =Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        // - Kullanıcı sayfayı kapatır
        Driver.closeDriver();


    }
}
