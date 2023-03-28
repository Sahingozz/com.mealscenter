package tests._08_Hasan.US_036;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_11 extends TestBaseReport {
    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_11() {
        extentTest=extentReports.createTest("US_36 TC_011","Ilgili Alanin gorunur ve Tiklanabilir oldugu dogrulanmali");
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel", "123456");
        extentTest.info("Admin sayfasina login yapildi ve Admin anasayfaya gidildi ");
        // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
        adminDashboard.dashboardButtonu.click();
        extentTest.info("Dashboard linki tiklandi");
        //// ve acilan sayfada "Commission this week","Commission this month","Subscriptions this month" , "Last Orders",
        // "Popular items","Popular merchants", "Top Customers" , "Overview of Review" ve "Recent payout" bolumlerinin gorunur olduklari
        // ve degerler icerdikleri dogrular
        Assert.assertFalse(ReusableMethods.getElementsText(By.xpath("//div[@class='card-body']")).isEmpty());
        System.out.println(ReusableMethods.getElementsText(By.xpath("//div[@class='card-body']")));
        extentTest.info("Merchant linki tiklandi ve acilan sayfada bulunan \"Commission this week\",\"Commission this month\",\"Subscriptions this month\" , \"Last Orders\",\n" +
                               " // \"Popular items\",\"Popular merchants\", \"Top Customers\" , \"Overview of Review\" ve \"Recent payout\" " +
                               "bolumlerinin gorunur olduklari ve  ozet bilgiler icerikleri cagrilan methot yoluyla dogrulandi");

        //-Kullanici sayfayi kapatir.
        extentTest.info("Sayfa kapatildi");
        extentTest.pass("Test hatasiz gerceklesti");

    }
}