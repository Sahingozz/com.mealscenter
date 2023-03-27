package tests._10_Ahmet_Gurkan.US_043;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_09 {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void test09(){

        //"Kullanici https://qa.mealscenter.com/backoffice/reports/merchant_registration Url'ye gider
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");
        //Solda bulunan Reports basligina tiklar
        adminDashboard.adminReports.click();

        //Merchant Registration sekmesine tiklar
        adminDashboard.merchantRegistration.click();

        //acilan sayfada Merchant Registration yazisi dogrulanir
        Assert.assertTrue(adminDashboard.merchantRegistrationText.isDisplayed());
        //All status sekmesine tiklanir
        adminDashboard.allStatus.click();

        //gelen seceneklere gore filtreleme yapildigi dogrulanir
        adminDashboard.allStatusActive.click();
        //ilk sirada 7-Eleven yazdigi dogrulanir
        Assert.assertTrue(adminDashboard.getAllStatusActive7Eleven.isDisplayed());
        //sayfa kapatilir
        Driver.closeDriver();
    }
}
