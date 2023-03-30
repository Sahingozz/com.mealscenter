package tests._10_Ahmet_Gurkan.US_043;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_06 extends TestBaseReport {

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void test01(){

        extentTest=extentReports.createTest("US_043_TC_06","Ilgili sayfaya gidildiginde istenen yazi dogrulanir.");

        //"Kullanici https://qa.mealscenter.com/backoffice/reports/merchant_registration Url'ye gider
        // "User goes to https://qa.mealscenter.com/backoffice/reports/merchant_registration Url
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");
        extentTest.info("Admin login islemi gerceklesir ve anasayfaya yonlendirilir.");

        //Solda bulunan Reports basligina tiklar
        // Click on Reports on the left
        adminDashboard.adminReports.click();
        extentTest.info("Reports linkine tiklandi.");

        //Merchant Registration sekmesine tiklar
        // Click on Merchant Registration tab
        adminDashboard.merchantRegistration.click();
        extentTest.info("Merchant Registration linkine tiklandi.");

        //acilan sayfada Merchant Registration yazisi dogrulanir
        // On the page that opens, the text Merchant Registration is verified.
        Assert.assertTrue(adminDashboard.merchantRegistrationText.isDisplayed());
        extentTest.info("Merchant Registration yazisi geldigi dogrulanir.");

        //sayfa kapatilir
        // page is closed
        Driver.closeDriver();
        extentTest.info("Sayfa kapandi.");
        extentTest.pass("Test basariyla gerceklesti");

    }
}
