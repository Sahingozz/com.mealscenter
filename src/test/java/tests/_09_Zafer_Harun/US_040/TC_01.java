package tests._09_Zafer_Harun.US_040;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {
    /*
    Verify that after logging in to admin panel, there is a "Promo" link on the
    left side bar and after clicking the "Coupon" link, there is an "add new"
    button and it possible to add a coupon
     */
    Admin_Dashboard adminLogin = new Admin_Dashboard();
    @Test
    public void TC_01_PromoLinkAddFunction(){

        // admin panele giriş yapılıp, add new coupon ekranına geçilir
        ReusableMethods.adminLoginZafer();
        adminLogin.promoLink.click();
        ReusableMethods.wait(1);
        adminLogin.couponLink.click();
        adminLogin.addNewCouponButton.click();

        // add new coupon formu doldurulur
        String couponName = "Fruehling Campaign";
        adminLogin.addCouponNameField.sendKeys(couponName);
        Select select = new Select(adminLogin.couponTypeDDM);
        select.selectByVisibleText("percentage");
        adminLogin.couponAmountField.clear();
        adminLogin.couponAmountField.sendKeys("10");
        adminLogin.minOrdertField.clear();
        adminLogin.minOrdertField.sendKeys("50");

        select = new Select (adminLogin.daysAvailableDDM);
        select.selectByVisibleText("sunday");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys("McDonalds").perform();
        ReusableMethods.wait(2);
         actions       .sendKeys(Keys.ENTER)
                        .click()
                .sendKeys(Keys.TAB).build().perform();
         actions.scrollByAmount(600,600).perform();



        adminLogin.couponExpiryDate.click();

        select = new Select(adminLogin.couponOptionsDDM);
        select.selectByIndex(1);

        select = new Select(adminLogin.couponStatusDDM);
        select.selectByVisibleText("Publish");

        adminLogin.couponSaveButton.click();

        Assert.assertTrue(adminLogin.couponNameText.getText().contains(couponName));

        Driver.closeDriver();

    }

}

