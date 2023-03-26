package tests._10_Ahmet_Gurkan.US_044;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_12 {

    /*-----------------------------------------------------------------------------------
    -Reports menüsünden “Merchant Sales”  bölümüne gidildiğinde filtre kullanarak Merchant ismi McDonald's olana göre sıralanabildiği doğrulanmalı
    -When you click to the “Merchant Sales” section from the Reports menu, it should be verified that
    it can be sorted according to the Merchant name(McDonald's) by using a filter
    -------------------------------------------------------------------------------------
     */
    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC12(){

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Merchant Sales" kısmına tıklayın
        adminDashboard.adminReportsMerchantSales.click();

        //-Merchant Sales Report yazisinin altinda bulunan sari renkli filtreleme tusuna basin
        adminDashboard.adminReportsMerchantSalesYellowFilter.click();

        //- Sag tarafta gelen kisimda "By Marchant" basligi altinda "McDonalds" i secin
        Actions actions=new Actions(Driver.getDriver());
        actions.click(adminDashboard.adminFilterByMerchantText)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER).perform();

        //- Filtreyi uygulayin
        adminDashboard.adminFiltersApply.click();

        //- Yeni listede ilk gelenin "Mcdonalds" gozuktugunu test edin
        String expectedMerchant="McDonalds";
        String actualMerchant=adminDashboard.adminMerchantColumn.getText();
        Assert.assertEquals(expectedMerchant,actualMerchant);

        ReusableMethods.wait(2);

        //- Sayfayi kapatin
        Driver.closeDriver();

        /*
        49. satirda gerceklesen bug nedeniyle test fail olmustur.
        Bug: Merchant sutununu "McDonalds" a gore siralamamiza ragmen siralanmadi. Bu sebeple test Fail oldu.
         */
    }
}
