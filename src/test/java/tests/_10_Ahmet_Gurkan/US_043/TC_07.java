package tests._10_Ahmet_Gurkan.US_043;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_07 {

    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void test07(){
        //"Kullanici https://qa.mealscenter.com/backoffice/reports/merchant_registration Url'ye gider
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");
        //Solda bulunan Reports basligina tiklar
        adminDashboard.adminReports.click();

        //Merchant Registration sekmesine tiklar
        adminDashboard.merchantRegistration.click();

        //acilan sayfada Merchant Registration yazisi dogrulanir
        Assert.assertTrue(adminDashboard.merchantRegistrationText.isDisplayed());
        //Name sekmesine tiklanir
        adminDashboard.merchantRegistrationName.click();
        //isme gore siralama dogrulanir
        Assert.assertTrue(adminDashboard.name_67899Pendingforapproval.isDisplayed());

        //sayfa kapatilir
        Driver.closeDriver();
    }
}
