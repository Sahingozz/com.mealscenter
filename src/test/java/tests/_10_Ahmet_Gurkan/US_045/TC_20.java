package tests._10_Ahmet_Gurkan.US_045;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_20 extends TestBaseReport {

    /*---------------------------------------------------------------------------------------------
    -Reports menüsünden “Order earnings”  bölümüne gidildiğinde kac adet sonuc oldugunun ekranda yazdıgını dogrulayın
    -Verify how many results are displayed on the screen when you click to the "Order earnings" section from the Reports menu
    -----------------------------------------------------------------------------------------------
    */

    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_20(){

        extentTest= extentReports.createTest("TC_20", "ilgili alana gidildiginde kac adet sonuc oldugunun ekranda yazdıgını dogrulayın");

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        //- Yanda bulunan "Reports" kısmına tıklayın
        Assert.assertTrue(adminDashboard.adminReports.isDisplayed());
        adminDashboard.adminReports.click();
        extentTest.info("Reports linkine tiklandi");

        //- Çıkan bölümde "Order Earnings" kısmına tıklayın
        ReusableMethods.wait(1);
        Assert.assertTrue(adminDashboard.adminReportsOrderEarnings.isDisplayed());
        adminDashboard.adminReportsOrderEarnings.click();
        extentTest.info("Order Earnings linkine tiklandi");

        //- Gelen sekmede kac adet sonuc ciktigini bulun ve kac adet oldugunu yazdirin
        Assert.assertTrue(adminDashboard.adminReportsOrderEarningsCount.isDisplayed());
        int count= Integer.parseInt(adminDashboard.adminReportsOrderEarningsCount.getText());
        System.out.println(count);
        extentTest.info("Gelen sekmede kac adet sonuc ciktigini bulundu ve kac adet oldugunu yazdirildi");

        //- Sayfayi kapatin
        Driver.closeDriver();
        extentTest.info("Sayfa Kapatildi");
        extentTest.pass("Basarili sekilde Test edildi");

}
}
