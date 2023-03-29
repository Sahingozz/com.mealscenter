package tests._10_Ahmet_Gurkan.US_044;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_11 extends TestBaseReport {

    /*---------------------------------------------------------------------------------------------
    Reports menüsünden “Merchant Sales”  bölümüne gidildiği doğrulanmalı
    It should be verified that you click to the "Merchant Sales" section from the Reports menu
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC_11(){

        extentTest= extentReports.createTest("TC_11", "ilgili alana gidildigi dogrulanmali");

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");
        extentTest.info("dmin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        //- Yanda bulunan "Reports" kısmına tıklayın
        Assert.assertTrue(adminDashboard.adminReports.isDisplayed());
        adminDashboard.adminReports.click();
        extentTest.info("Reports linkine tiklandi");

        //- Çıkan bölümde "Merchant Sales" kısmına tıklayın
        Assert.assertTrue(adminDashboard.adminReportsMerchantSales.isDisplayed());
        adminDashboard.adminReportsMerchantSales.click();
        extentTest.info("Merchant Sales linkine tiklandi");

        //- Gittiğiniz yerin urlsini alarak doğru urlde olduğunuzu test edin
        String expectedUrl= "https://qa.mealscenter.com/backoffice/reports/merchant_sales";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        extentTest.info("Dogru urlde oldugu dogrulandi");

        //- Sayfayi kapatin
        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");
    }
}
