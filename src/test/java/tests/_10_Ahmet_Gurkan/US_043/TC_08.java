package tests._10_Ahmet_Gurkan.US_043;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_08 {

    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void test08(){

        //"Kullanici https://qa.mealscenter.com/backoffice/reports/merchant_registration Url'ye gider
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");
        //Solda bulunan Reports basligina tiklar
        adminDashboard.adminReports.click();

        //Merchant Registration sekmesine tiklar
        adminDashboard.merchantRegistration.click();

        //acilan sayfada Merchant Registration yazisi dogrulanir
        Assert.assertTrue(adminDashboard.merchantRegistrationText.isDisplayed());
        //Start date -- End date sekmesine tiklanir
        adminDashboard.startEndDate.click();
        //iki gun secilip filtreleme yapildigi dogrulanir
        adminDashboard.adminDateLast7Days.click();

        //sayfa kapatilir
        //Driver.closeDriver();
    }
}
