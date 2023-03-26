package tests._10_Ahmet_Gurkan.US_045;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_19 extends TestBaseReport {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde order id, subtotal, total, merchant earnings, admin commision e göre sıralanabildiği doğrulanmalı
    -When you click to the "Order earnings" section from the Reports menu, it should be verified that it can be sorted by order id,
    subtotal, total, merchant earnings, admin commission
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_19(){

        extentTest= extentReports.createTest("TC_19", "ilgili alana gidildiginde order id, subtotal, total, merchant earnings, admin commision e göre sıralanabildiği doğrulanmalı");

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();
        extentTest.info("Reports linkine tiklandi");

        //- Çıkan bölümde "Order Earnings" kısmına tıklayın
        adminDashboard.adminReportsOrderEarnings.click();
        extentTest.info("Order Earnings linkine tiklandi");

        //- Gelen sekmede gözuken listeyi order id, subtotal, total, merchant earnings,admin commision basliklarinin gorunur ve tiklanabilir oldugu doğrulanmalı
        Assert.assertTrue(adminDashboard.adminReportsMerchantSalesOrderID.isDisplayed());
        Assert.assertTrue(adminDashboard.adminReportsSubtotal.isDisplayed());
        Assert.assertTrue(adminDashboard.adminReportsTotal.isDisplayed());
        Assert.assertTrue(adminDashboard.adminReportsMerchantEarnings.isDisplayed());
        Assert.assertTrue(adminDashboard.adminReportsAdminCommission.isDisplayed());

        Assert.assertTrue(adminDashboard.adminReportsMerchantSalesOrderID.isEnabled());
        Assert.assertTrue(adminDashboard.adminReportsSubtotal.isEnabled());
        Assert.assertTrue(adminDashboard.adminReportsTotal.isEnabled());
        Assert.assertTrue(adminDashboard.adminReportsMerchantEarnings.isEnabled());
        Assert.assertTrue(adminDashboard.adminReportsAdminCommission.isEnabled());
        extentTest.info("Gelen sekmede gözuken listeyi order id, subtotal, total, merchant earnings,admin commision basliklari gorundu ve tiklanabilir oldugu doğrulandi");

        //- Sayfayi kapatin
        Driver.closeDriver();
        extentTest.info("Sayfa Kapatildi");
        extentTest.pass("Basarili sekilde Test edildi");

}
}
