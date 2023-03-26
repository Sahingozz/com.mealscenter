package tests._10_Ahmet_Gurkan.US_045;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_17 extends TestBaseReport {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde tarihe göre filtelenebildiği dogrulanmalı
    -When you click to the "Order earnings" section from the Reports menu, it should be verified
    that it can be filtered by date
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC_17(){

        extentTest= extentReports.createTest("TC_17", "ilgili alana gidildiginde tarihe göre filtelenebildiği dogrulanmalı");

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();
        extentTest.info("Reports linkine tiklandi");

        //- Çıkan bölümde "Order Earnings" kısmına tıklayın
        adminDashboard.adminReportsOrderEarnings.click();
        extentTest.info("Order Earnings linkine tiklandi");

        //-Order Earnings Report yazisinin altinda bulunan "Start Date-End Date" tarih kutucuguna tiklayin
        adminDashboard.adminStartandEndDate.click();
        extentTest.info("Start Date-End Date tarih kutucuguna tiklandi");

        //- Bir tarih araligi secin ve o tarih araligindaki siparislerin geldigini dogrulayin
        adminDashboard.adminDateLast7Days.click();
        Assert.assertTrue(adminDashboard.adminFirstElementofSearchResultOrderID.isDisplayed());
        extentTest.info("Bir tarih araligi secildi ve o tarih araligindaki siparislerin geldigini dogrulandi");

        //- Sayfayi kapatin
        Driver.closeDriver();
        extentTest.info("Sayfa Kapatildi");
        extentTest.pass("Basarili sekilde Test edildi");
}
}
