package tests._09_Zafer_Harun.US_041;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {
    Admin_Dashboard adminLogin = new Admin_Dashboard();

    /*Verify that after logging in to admin panel, there is a "Buyers" link on the
    left side bar and after clicking the "Customers" link, it is possible to
    add new customer*/

    @Test
    public void TC_02_AddNewCustomer() {
        ReusableMethods.adminLoginZafer();
        adminLogin.buyersLink.click();
        ReusableMethods.wait(1);
        adminLogin.customersLink.click();

        adminLogin.addNewCustomerButton.click();
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        adminLogin.firstName.sendKeys(firstName);
        String lastName = faker.name().lastName();
        adminLogin.lastName.sendKeys(lastName);
        String emailAdresse= faker.internet().emailAddress();
        adminLogin.emailAdresse.sendKeys(emailAdresse);
        String contactPhone = faker.phoneNumber().cellPhone();
        adminLogin.contactPhone.sendKeys(contactPhone);
        String passWord = faker.internet().password();
        adminLogin.passWord.sendKeys(passWord);
        adminLogin.confirmPassWord.sendKeys(passWord);

        Select select = new Select(adminLogin.newCustomerClassDDM);

        select.selectByIndex(1);

        adminLogin.newCustomerSaveButton.click();

        adminLogin.customerSearchField.sendKeys(lastName+ Keys.ENTER);

        Assert.assertTrue(adminLogin.customerSearch1stResult.getText().contains(firstName+" "+lastName));

        Driver.closeDriver();


    }
}

