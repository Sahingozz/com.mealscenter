package tests._10_Ahmet_Gurkan.US_044;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.io.IOException;

public class TC_12 extends TestBaseReport {

    /*-----------------------------------------------------------------------------------
    -Reports menüsünden “Merchant Sales”  bölümüne gidildiğinde filtre kullanarak Merchant ismi McDonald's olana göre sıralanabildiği doğrulanmalı
    -When you click to the “Merchant Sales” section from the Reports menu, it should be verified that
    it can be sorted according to the Merchant name(McDonald's) by using a filter
    -------------------------------------------------------------------------------------
     */
    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC12() throws IOException {

        extentTest= extentReports.createTest("TC_12", "ilgili alana gidildiginde secilen isme gore liste siralanmali");

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");
        extentTest.info("admin sayfasina login islemi gerceklesti ve anasayfaya gidildi");

        //- Yanda bulunan "Reports" kısmına tıklayın
        Assert.assertTrue(adminDashboard.adminReports.isDisplayed());
        adminDashboard.adminReports.click();
        extentTest.info("Reports linkine tiklandi");

        //- Çıkan bölümde "Merchant Sales" kısmına tıklayın
        Assert.assertTrue(adminDashboard.adminReportsMerchantSales.isDisplayed());
        adminDashboard.adminReportsMerchantSales.click();
        extentTest.info("Merchant Sales linkine tiklandi");

        //-Merchant Sales Report yazisinin altinda bulunan sari renkli filtreleme tusuna basin
        adminDashboard.adminReportsMerchantSalesYellowFilter.click();
        Assert.assertTrue(adminDashboard.adminReportsMerchantSalesYellowFilter.isDisplayed());

        //- Sag tarafta gelen kisimda "By Marchant" basligi altinda "McDonalds" i secin
        Actions actions=new Actions(Driver.getDriver());
        Assert.assertTrue(adminDashboard.adminFilterByMerchantText.isDisplayed());
        actions.click(adminDashboard.adminFilterByMerchantText)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER).perform();
        extentTest.info("By Marchant basligi altinda McDonalds secildi");

        //- Filtreyi uygulayin
        Assert.assertTrue(adminDashboard.adminFiltersApply.isDisplayed());
        adminDashboard.adminFiltersApply.click();
        extentTest.info("Filtre uygulandi");

        //- Yeni listede ilk gelenin "Mcdonalds" gozuktugunu test edin
        Assert.assertTrue(adminDashboard.adminMerchantColumn.isDisplayed());
        String expectedMerchant="McDonalds";
        String actualMerchant=adminDashboard.adminMerchantColumn.getText();
        ReusableMethods.getScreenShotFullScreen(Driver.getDriver());
        extentTest.info("Screenshot alindi");
        Assert.assertEquals(expectedMerchant,actualMerchant);
        extentTest.info("Yeni listede ilk gelenin Mcdonalds gozuktugunu test edildi");

        ReusableMethods.wait(2);

        //- Sayfayi kapatin
        Driver.closeDriver();
        extentTest.info("Sayfa Kapatildi");
        extentTest.pass("Basarili sekilde siralandigi Test edildi");

        /*
        49. satirda gerceklesen bug nedeniyle test fail olmustur.
        Bug: Merchant sutununu "McDonalds" a gore siralamamiza ragmen siralanmadi. Bu sebeple test Fail oldu.
         */
    }
}
