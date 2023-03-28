package tests._10_Ahmet_Gurkan.US_045;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.io.IOException;

public class TC_18 extends TestBaseReport {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde arama yapabildiği doğrulanmalı
    -When you click to the "Order earnings" section from the Reports menu, it should be verified that you can search
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC_18() throws IOException {

        extentTest= extentReports.createTest("TC_18", "ilgili alana gidildiginde arama yapabildiği doğrulanmalı");

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        //- Yanda bulunan "Reports" kısmına tıklayın
        Assert.assertTrue(adminDashboard.adminReports.isDisplayed());
        adminDashboard.adminReports.click();
        extentTest.info("Reports linkine tiklandi");

        //- Çıkan bölümde "Order Earnings" kısmına tıklayın
        Assert.assertTrue(adminDashboard.adminReportsOrderEarnings.isDisplayed());
        adminDashboard.adminReportsOrderEarnings.click();
        extentTest.info("Order Earnings linkine tiklandi");

        //- Gelen sekmede arama kutusuna gidin ve arama yapin
        ReusableMethods.getScreenShotFullScreen(Driver.getDriver());
        Assert.assertTrue(adminDashboard.adminReportsOrderEarningsSearchBox.isDisplayed());
        adminDashboard.adminReportsOrderEarningsSearchBox.sendKeys("10246");
        extentTest.info("Gelen sekmede arama kutusuna gidildi ve arama yapildi");

        //- Arama yaptiginiz Order Id nin ekranınıza geldigini dogrulayin
        Assert.assertTrue(adminDashboard.adminFirstElementofSearchResultOrderID.isDisplayed());
        extentTest.info("Arama yaptiginiz Order Id nin ekranınıza geldigi dogrulandi");

        //- Sayfayi kapatin
        Driver.closeDriver();
        extentTest.info("Sayfa Kapatildi");
        extentTest.pass("Basarili sekilde Test edildi");
}
        /*
        32. satirda gerceklesen bug nedeniyle test fail olmustur.
        Bug: Gelen ekranda bulunan arama kutusu tiklanabilir olmamasi sebebiyle arama yapilamamis ve test FAILED olmustur.
         */
}
