package tests._04_Ayten._10_Ahmet_Gurkan.US_044;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_13 {

    /*-----------------------------------------------------------------------------------
    - Reports menüsünden “Merchant Sales”  bölümüne gidildiğinde filtre kullanarak Order ID ye göre sıralanabildiği doğrulanmalı
    - When you click to the "Merchant Sales" section from the Reports menu, it should be verified that
    it can be sorted by Order ID using a filter
    -------------------------------------------------------------------------------------
     */

    Admin_Dashboard adminDashboard=new Admin_Dashboard();

    @Test
    public void TC13(){

        //-"https://qa.mealscenter.com/backoffice/admin/dashboard" linkine gidin
        ReusableMethods.adminLogin("emre.elieyioglu","123456");

        //- Yanda bulunan "Reports" kısmına tıklayın
        adminDashboard.adminReports.click();

        //- Çıkan bölümde "Merchant Sales" kısmına tıklayın
        adminDashboard.adminReportsMerchantSales.click();

        //- Merchant Sales Report yazisinin altinda "Order ID" yazan yere tiklayin
        adminDashboard.adminReportsMerchantSalesOrderID.click();

        //- Siralamadaki ilk iki bolumun Order Id lerinin kucukten buyuge ilerledigini dogrulayin
        orderIDSiralama(1,2);

        //- sayfayi kapatin
        Driver.closeDriver();
}


    //
    public static void orderIDSiralama(int sira1, int sira2){
        boolean sonuc=false;
        WebElement orderID1= Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr["+sira1+"]/td[3]"));
        WebElement orderID2= Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr["+sira2+"]/td[3]"));
        int a= Integer.parseInt(orderID1.getText());
        int b= Integer.parseInt(orderID2.getText());
        if (a<b){
            sonuc=true;
        }
        boolean expectedSonuc=true;

        try {
            if (expectedSonuc==sonuc){
                System.out.println("PASSED");
            }else{
                System.out.println("FAILED");
            }
        }catch (StaleElementReferenceException e){
        }
    }
}
