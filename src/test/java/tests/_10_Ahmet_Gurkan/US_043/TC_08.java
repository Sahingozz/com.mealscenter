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
        //Start date -- End date sekmesine tiklanir
        // Click on Start date -- End date tab
        adminDashboard.startEndDate.click();
        //iki gun secilip filtreleme yapildigi dogrulanir
        // Two days are selected and filtering is verified.
        adminDashboard.adminDateLast7Days.click();

        //sayfa kapatilir
        // page is closer
        Driver.closeDriver();
    }
}
