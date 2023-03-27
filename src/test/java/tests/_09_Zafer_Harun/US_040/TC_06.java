package tests._09_Zafer_Harun.US_040;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06 {
    /*
    Verify that after logging in to admin panel, there is a "Promo" link on the
    left side bar and after clicking the "Coupon" link, there is a "search field"
    on the page and it is possible to make search
     */
    Admin_Dashboard adminLogin = new Admin_Dashboard();
    @Test
    public void TC_06_CouponSearchField(){
        ReusableMethods.adminLoginZafer();
        adminLogin.promoLink.click();
        ReusableMethods.wait(1);
        adminLogin.couponLink.click();
        String listResultText=adminLogin.couponListResultsText.getText();
        adminLogin.couponSearchField.sendKeys("xyz"+ Keys.ENTER);
        String searchResultsText=Driver.getDriver()
                .findElement(By.xpath("//div[@class='dataTables_info']")).getText();
        boolean isSearchOk;
        if(listResultText.equals(searchResultsText)){
            isSearchOk=false;
            Assert.assertTrue(isSearchOk);
        }

        Driver.closeDriver();
    }
}
