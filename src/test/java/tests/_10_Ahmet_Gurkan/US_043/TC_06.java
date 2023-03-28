package tests._10_Ahmet_Gurkan.US_043;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void test01(){

        //"Kullanici https://qa.mealscenter.com/backoffice/reports/merchant_registration Url'ye gider
        // "User goes to https://qa.mealscenter.com/backoffice/reports/merchant_registration Url
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");
        //Solda bulunan Reports basligina tiklar
        // Click on Reports on the left
        adminDashboard.adminReports.click();

        //Merchant Registration sekmesine tiklar
        // Click on Merchant Registration tab
        adminDashboard.merchantRegistration.click();

        //acilan sayfada Merchant Registration yazisi dogrulanir
        // On the page that opens, the text Merchant Registration is verified.
        Assert.assertTrue(adminDashboard.merchantRegistrationText.isDisplayed());
        //sayfa kapatilir
        // page is closed
        Driver.closeDriver();

    }
}
