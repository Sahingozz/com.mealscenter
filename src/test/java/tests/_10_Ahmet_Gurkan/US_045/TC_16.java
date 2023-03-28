package tests._10_Ahmet_Gurkan.US_045;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_16 extends TestBaseReport {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde site title nın “Order earnings report” oldugu doğrulanabilmeli
    -When you click to the "Order earnings" section from the Reports menu, it should be verified that the site
    title is "Order earnings report
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC_16(){

        extentTest= extentReports.createTest("TC_16", "ilgili alana gidildiginde site title nın “Order earnings report” oldugu doğrulanabilmeli");

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

        //- Gelen sekmenin titlenin "Order earnings report" yazdigini dogrulayin
        String expectedTitle = "Order earnings report";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        extentTest.info("Gelen sekmenin titlenin Order earnings report yazdigini dogrulandi");

        //- Sayfayi kapatin
        Driver.closeDriver();
        extentTest.info("Sayfa Kapatildi");
        extentTest.pass("Basarili sekilde Test edildi");
    }
}
