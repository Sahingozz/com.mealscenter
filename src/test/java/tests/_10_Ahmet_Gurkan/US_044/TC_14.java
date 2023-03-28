package tests._10_Ahmet_Gurkan.US_044;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_14 extends TestBaseReport {

    /*-----------------------------------------------------------------------------------
    - Reports menüsünden “Merchant Sales”  bölümüne gidildiğinde başlangıç ve bitiş tarihi seçilebilmeli, tarihe göre sıralanabildiği doğrulanmalı
    - When you click to the “Merchant Sales” section from the Reports menu, the start and end dates should be selected,
    and it should be verified that they can be sorted by date
    -------------------------------------------------------------------------------------
     */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC14(){

        extentTest= extentReports.createTest("TC_14", "ilgili alana gidildiginde başlangıç ve bitiş tarihi seçilebilmeli, tarihe göre sıralanabildiği doğrulanmalı");

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        //- Yanda bulunan "Reports" kısmına tıklayın
        Assert.assertTrue(adminDashboard.adminReports.isDisplayed());
        adminDashboard.adminReports.click();
        extentTest.info("Reports linkine tiklandi");

        //- Çıkan bölümde "Merchant Sales" kısmına tıklayın
        ReusableMethods.wait(1);
        Assert.assertTrue(adminDashboard.adminReportsMerchantSales.isDisplayed());
        adminDashboard.adminReportsMerchantSales.click();
        extentTest.info("Merchant Sales linkine tiklandi");

        //- Merchant Sales Report yazisinin altinda bulunan "Start Date-End Date" tarih kutucuguna tiklayin
        Assert.assertTrue(adminDashboard.adminStartandEndDate.isDisplayed());
        adminDashboard.adminStartandEndDate.click();
        extentTest.info("By Marchant basligi altinda Start Date-End Date secildi");

        //- Bir tarih araligi secin ve o tarih araligindaki siparislerin geldigini dogrulayin
        Assert.assertTrue(adminDashboard.adminDateLast7Days.isDisplayed());
        adminDashboard.adminDateLast7Days.click();
        Assert.assertTrue(adminDashboard.adminFirstElementofSearchResultText.isDisplayed());
        extentTest.info("Bir tarih araligi belirlendi");

        //- Sayfayi kapatin
        Driver.closeDriver();
        extentTest.info("Sayfa Kapatildi");
        extentTest.pass("Basarili sekilde siralandigi Test edildi");
    }
}
