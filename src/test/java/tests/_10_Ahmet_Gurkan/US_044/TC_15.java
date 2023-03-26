package tests._10_Ahmet_Gurkan.US_044;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_15 extends TestBaseReport {

    /*-----------------------------------------------------------------------------------
    - Reports menüsünden “Merchant Sales”  bölümüne gidildiğinde site title nın “Merchant Sales Report” oldugu doğrulanabilmeli
    - When you click to the “Merchant Sales” section from the Reports menu, it should be verified that the
    site title is “Merchant Sales Report
    -------------------------------------------------------------------------------------
     */

    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC15(){

        extentTest= extentReports.createTest("TC_15", "ilgili alana gidildiginde site title nın “Merchant Sales Report” oldugu doğrulanabilmeli");

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();
        extentTest.info("Reports linkine tiklandi");

        //- Çıkan bölümde "Merchant Sales" kısmına tıklayın
        adminDashboard.adminReportsMerchantSales.click();
        extentTest.info("Merchant Sales linkine tiklandi");

        //- Gelen sekmenin titlenin "Merchant Sales Report" yazdigini dogrulayin
        String expectedTitle = "Merchant Sales Report";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        extentTest.info("Gelen sekmenin titlenin Merchant Sales Report yazdigini dogrulandi");

        //- Sayfayi kapatin
        Driver.closeDriver();
        extentTest.info("Sayfa Kapatildi");
        extentTest.pass("Basarili sekilde Test edildi");
}
}
