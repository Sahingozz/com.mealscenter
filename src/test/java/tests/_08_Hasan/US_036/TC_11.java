package tests._08_Hasan.US_036;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.ReusableMethods;

public class TC_11 {
    Admin_Dashboard adminDashboard = new Admin_Dashboard();

    @Test
    public void TC_11() {
        // - Kullanıcı açtığı browserla admin paneli olan "AdminUrl" ye gider
        // - Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine  tıklar
        ReusableMethods.adminLogin("hasan.adiguzel", "123456");
        // - Kullanıcı acilan sayfada sol panelde bulunan "Dasboard" linkine basar
        adminDashboard.dashboardButtonu.click();
        //// ve acilan sayfada "Commission this week","Commission this month","Subscriptions this month" , "Last Orders",
        // "Popular items","Popular merchants", "Top Customers" , "Overview of Review" ve "Recent payout" bolumlerinin gorunur olduklari
        // ve  ve degerler icerdikleri dogrular
        Assert.assertFalse(ReusableMethods.getElementsText(By.xpath("//div[@class='card-body']")).isEmpty());

        //Methot kisminda is displayed de eklendigi icin bir daha displayed testi yapilmadi.
        System.out.println(ReusableMethods.getElementsText(By.xpath("//div[@class='card-body']")));

    }
}