package tests._09_Zafer_Harun.US_039;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class TC_03 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /* Verify that, after logging in to admin panel and clicking "Earnings" link
        and "Earnings list", there is a "search field" and searching is possible */
    @Test
    public void TC_03_SearchField (){
        ReusableMethods.adminLoginZafer();
        adminLogin.earningsButton.click();
        adminLogin.merchantEarningsButton.click();


        try {
            adminLogin.merchantEarningsSearchField.sendKeys("Burger"+ Keys.ENTER);
        } catch (ElementNotInteractableException e) {
            boolean isClickable=false;
            if(isClickable==false){
                Assert.assertTrue(isClickable);
            }
        }


        //Assert.assertTrue(adminLogin.merchantEarningsSearchField.cli
        Driver.closeDriver();
    }
}
